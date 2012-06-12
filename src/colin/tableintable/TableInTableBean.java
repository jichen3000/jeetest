package colin.tableintable;

import java.util.HashMap;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;

import colin.deletechild.DadEntity;
import colin.deletechild.DadService;
import colin.deletechild.SonEntity;
import colin.deletechild.SonService;

@ManagedBean(name = "tableInTableBean")
@ViewScoped
public class TableInTableBean {
	@Inject
	private DadEntity dad;
	private List<DadEntity> dadList;
	@EJB
	private DadService dadService;
	@EJB
	private SonService sonService;

	private DadEntity selectedDad;
	private SonEntity selectedSon;
	private HashMap<Long,Boolean> dadEditableHash=new HashMap<Long,Boolean>();
	@PostConstruct
	public void postConstruct(){
		this.dadList = dadService.findAll();
//		System.out.println("dad list: "+this.dadList);
		FacesContext.getCurrentInstance().getExternalContext().getSession(true);
	}
	public void save(){
//		dadService.save(dad);
	}
	public void deleteChild(){
//		System.out.println("selectedSon:"+selectedSon);
//		dad.delSon(selectedSon);
//		dadService.update(dad);
	}
	public void addChild(ActionEvent e){
//		UIParameter paramFather = (UIParameter) e.getComponent().findComponent("currentDad");
//		DadEntity dad = (DadEntity) paramFather.getValue();
//		SonEntity son = new SonEntity(dad.getName()+"'s son");
//		dad.addSon(son);
//		System.out.println("pre currentDad:"+dad);
//		sonService.update(son);
//		this.dad = dad;
////		this.dad = dadService.find(new Long(2));
//		System.out.println("aft currentDad:"+dad);
////		System.out.println("aft this.dad:"+this.dad);
////		System.out.println("aft currentDad:"+dad.getSonList());
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
	public List<DadEntity> getDadList() {
		return dadList;
	}
	public void setDadList(List<DadEntity> dadList) {
		this.dadList = dadList;
	}
	public SonService getSonService() {
		return sonService;
	}
	public void setSonService(SonService sonService) {
		this.sonService = sonService;
	}
	public DadEntity getSelectedDad() {
		return selectedDad;
	}
	public void setSelectedDad(DadEntity selectedDad) {
		this.selectedDad = selectedDad;
	}

}
