package colin.uiparameter;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.component.UIParameter;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;

import colin.deletechild.DadEntity;
import colin.deletechild.DadService;
import colin.deletechild.SonEntity;
import colin.deletechild.SonService;

@ManagedBean(name = "changeBean")
@ViewScoped
public class ChangeBean {
	@Inject
	private DadEntity dad;
	@EJB
	private DadService dadService;
	@EJB
	private SonService sonService;
	private SonEntity selectedSon;
	@PostConstruct
	public void postConstruct(){
		this.dad = dadService.find(new Long(2));
		System.out.println("dad : "+this.dad);
	}	
	public void save(){
		dadService.save(dad);
	}
	public void deleteChild(){
		System.out.println("selectedSon:"+selectedSon);
		dad.delSon(selectedSon);
		dadService.update(dad);
	}
	public void addChild(ActionEvent e){
		UIParameter paramFather = (UIParameter) e.getComponent().findComponent("currentDad");
		DadEntity dad = (DadEntity) paramFather.getValue();
		SonEntity son = new SonEntity(dad.getName()+"'s son");
		dad.addSon(son);
		System.out.println("pre currentDad:"+dad);
		sonService.update(son);
		this.dad = dad;
//		this.dad = dadService.find(new Long(2));
		System.out.println("aft currentDad:"+dad);
//		System.out.println("aft this.dad:"+this.dad);
//		System.out.println("aft currentDad:"+dad.getSonList());
	}
	
	
	
	public DadEntity getDad() {
		return dad;
	}
	public void setDad(DadEntity dad) {
		this.dad = dad;
	}
	public DadService getDadService() {
		return dadService;
	}
	public void setDadService(DadService dadService) {
		this.dadService = dadService;
	}
	public SonEntity getSelectedSon() {
		return selectedSon;
	}
	public void setSelectedSon(SonEntity selectedSon) {
		this.selectedSon = selectedSon;
	}
	
	
}
