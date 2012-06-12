package colin.deletechild;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

@ManagedBean(name = "deleteChildBean")
@ViewScoped
public class DeleteChildBean {
	@Inject
	private DadEntity dad;
	@EJB
	private DadService dadService;
	private SonEntity selectedSon;
	@PostConstruct
	public void postConstruct(){
		this.dad = dadService.find(new Long(1));
		
	}	
	public void save(){
		DadEntity newDad = dadService.genNewOne();
		dadService.save(newDad);
	}
	public void deleteChild(){
		System.out.println("selectedSon:"+selectedSon);
		dad.delSon(selectedSon);
		dadService.update(dad);
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
