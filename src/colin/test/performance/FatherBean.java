package colin.test.performance;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import colin.test.performance.entities.Father;

@ManagedBean(name = "fatherBean")
@ViewScoped
public class FatherBean {
	@EJB
	private FatherService fatherService;
	@EJB
	private FatherClobService fatherClobService;
	private List<Father> fatherList;
	
	@PostConstruct
	public void postConstruct(){
		this.fatherList = fatherService.findAll();
	}

	public List<Father> getFatherList() {
		return this.fatherList;
	}

	public void setFatherList(List<Father> fatherList) {
		this.fatherList = fatherList;
	}
	
	public void save(){
		this.fatherService.testPerformance();
	}
	public void saveClob(){
		this.fatherClobService.testPerformance();
	}
}
