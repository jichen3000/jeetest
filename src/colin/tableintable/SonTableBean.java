package colin.tableintable;

import java.util.HashMap;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ActionEvent;

import colin.deletechild.SonEntity;
import colin.deletechild.SonService;

@ManagedBean(name = "sonTableBean")
@ViewScoped
public class SonTableBean {
	@EJB
	private SonService sonService;

	private SonEntity selectedSon;
	private HashMap<Long,Boolean> sonEditableHash=new HashMap<Long,Boolean>();
	public boolean isSonEditing(Long id){
		if (sonEditableHash.get(id)==null){
			return false;
		}
		return sonEditableHash.get(id);
	}
	
	public void setSonEditing(Long id){
		System.out.println("setSonEditing id:"+id);
		sonEditableHash.put(id, true);
	}
	@PostConstruct
	public void postConstruct(){
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
	
	
	
	public SonEntity getSelectedSon() {
		return selectedSon;
	}
	public void setSelectedSon(SonEntity selectedSon) {
		this.selectedSon = selectedSon;
	}

	public SonService getSonService() {
		return sonService;
	}
	public void setSonService(SonService sonService) {
		this.sonService = sonService;
	}

	
}
