package colin.test.performance.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import colin.common.SequenceHelper;


@JsonIgnoreProperties({"father"})
@Entity
@Table(name = "child_e")
public class ChildE {
	public ChildE(){
	}
	public ChildE(String seed){
		this.id = SequenceHelper.genID();
		this.f0 = "f0"+seed;
		this.f1 = "f1"+seed;
		this.f2 = "f2"+seed;
		this.f3 = "f3"+seed;
		this.f4 = "f4"+seed;
		this.f5 = "f5"+seed;
		this.f6 = "f6"+seed;
		this.f7 = "f7"+seed;
		this.f8 = "f8"+seed;
		this.f9 = "f9"+seed;
	}
	@Id
	private Long id;
	@ManyToOne(cascade={CascadeType.REFRESH})
	private Father father;
	@OneToMany(cascade={CascadeType.ALL}, mappedBy="childE")
	private List<GrandsonEA> grandsonEAList = new ArrayList<GrandsonEA>();
	public void addGrandsonEA(GrandsonEA grandsonEA){
		grandsonEA.setChildE(this);
		grandsonEAList.add(grandsonEA);
	}
  
	@OneToMany(cascade={CascadeType.ALL}, mappedBy="childE")
	private List<GrandsonEB> grandsonEBList = new ArrayList<GrandsonEB>();
	public void addGrandsonEB(GrandsonEB grandsonEB){
		grandsonEB.setChildE(this);
		grandsonEBList.add(grandsonEB);
	}
  
	@OneToMany(cascade={CascadeType.ALL}, mappedBy="childE")
	private List<GrandsonEC> grandsonECList = new ArrayList<GrandsonEC>();
	public void addGrandsonEC(GrandsonEC grandsonEC){
		grandsonEC.setChildE(this);
		grandsonECList.add(grandsonEC);
	}
  
	@OneToMany(cascade={CascadeType.ALL}, mappedBy="childE")
	private List<GrandsonED> grandsonEDList = new ArrayList<GrandsonED>();
	public void addGrandsonED(GrandsonED grandsonED){
		grandsonED.setChildE(this);
		grandsonEDList.add(grandsonED);
	}
  
	@OneToMany(cascade={CascadeType.ALL}, mappedBy="childE")
	private List<GrandsonEE> grandsonEEList = new ArrayList<GrandsonEE>();
	public void addGrandsonEE(GrandsonEE grandsonEE){
		grandsonEE.setChildE(this);
		grandsonEEList.add(grandsonEE);
	}
  	
	private String f0;
	private String f1;
	private String f2;
	private String f3;
	private String f4;
	private String f5;
	private String f6;
	private String f7;
	private String f8;
	private String f9;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Father getFather() {
		return father;
	}
	public void setFather(Father father) {
		this.father = father;
	}

	public List<GrandsonEA> getGrandsonEAList() {
		return grandsonEAList;
	}
	public void setGrandsonEAList(List<GrandsonEA> grandsonEAList) {
		this.grandsonEAList = grandsonEAList;
	}
	public List<GrandsonEB> getGrandsonEBList() {
		return grandsonEBList;
	}
	public void setGrandsonEBList(List<GrandsonEB> grandsonEBList) {
		this.grandsonEBList = grandsonEBList;
	}
	public List<GrandsonEC> getGrandsonECList() {
		return grandsonECList;
	}
	public void setGrandsonECList(List<GrandsonEC> grandsonECList) {
		this.grandsonECList = grandsonECList;
	}
	public List<GrandsonED> getGrandsonEDList() {
		return grandsonEDList;
	}
	public void setGrandsonEDList(List<GrandsonED> grandsonEDList) {
		this.grandsonEDList = grandsonEDList;
	}
	public List<GrandsonEE> getGrandsonEEList() {
		return grandsonEEList;
	}
	public void setGrandsonEEList(List<GrandsonEE> grandsonEEList) {
		this.grandsonEEList = grandsonEEList;
	}

	public String getF0() {
		return f0;
	}
	public void setF0(String f0) {
		this.f0 = f0;
	}
	public String getF1() {
		return f1;
	}
	public void setF1(String f1) {
		this.f1 = f1;
	}
	public String getF2() {
		return f2;
	}
	public void setF2(String f2) {
		this.f2 = f2;
	}
	public String getF3() {
		return f3;
	}
	public void setF3(String f3) {
		this.f3 = f3;
	}
	public String getF4() {
		return f4;
	}
	public void setF4(String f4) {
		this.f4 = f4;
	}
	public String getF5() {
		return f5;
	}
	public void setF5(String f5) {
		this.f5 = f5;
	}
	public String getF6() {
		return f6;
	}
	public void setF6(String f6) {
		this.f6 = f6;
	}
	public String getF7() {
		return f7;
	}
	public void setF7(String f7) {
		this.f7 = f7;
	}
	public String getF8() {
		return f8;
	}
	public void setF8(String f8) {
		this.f8 = f8;
	}
	public String getF9() {
		return f9;
	}
	public void setF9(String f9) {
		this.f9 = f9;
	}

}
