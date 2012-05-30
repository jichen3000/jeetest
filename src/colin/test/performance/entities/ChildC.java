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
@Table(name = "child_c")
public class ChildC {
	public ChildC(){
	}
	public ChildC(String seed){
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
	@OneToMany(cascade={CascadeType.ALL}, mappedBy="childC")
	private List<GrandsonCA> grandsonCAList = new ArrayList<GrandsonCA>();
	public void addGrandsonCA(GrandsonCA grandsonCA){
		grandsonCA.setChildC(this);
		grandsonCAList.add(grandsonCA);
	}
  
	@OneToMany(cascade={CascadeType.ALL}, mappedBy="childC")
	private List<GrandsonCB> grandsonCBList = new ArrayList<GrandsonCB>();
	public void addGrandsonCB(GrandsonCB grandsonCB){
		grandsonCB.setChildC(this);
		grandsonCBList.add(grandsonCB);
	}
  
	@OneToMany(cascade={CascadeType.ALL}, mappedBy="childC")
	private List<GrandsonCC> grandsonCCList = new ArrayList<GrandsonCC>();
	public void addGrandsonCC(GrandsonCC grandsonCC){
		grandsonCC.setChildC(this);
		grandsonCCList.add(grandsonCC);
	}
  
	@OneToMany(cascade={CascadeType.ALL}, mappedBy="childC")
	private List<GrandsonCD> grandsonCDList = new ArrayList<GrandsonCD>();
	public void addGrandsonCD(GrandsonCD grandsonCD){
		grandsonCD.setChildC(this);
		grandsonCDList.add(grandsonCD);
	}
  
	@OneToMany(cascade={CascadeType.ALL}, mappedBy="childC")
	private List<GrandsonCE> grandsonCEList = new ArrayList<GrandsonCE>();
	public void addGrandsonCE(GrandsonCE grandsonCE){
		grandsonCE.setChildC(this);
		grandsonCEList.add(grandsonCE);
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


	public List<GrandsonCA> getGrandsonCAList() {
		return grandsonCAList;
	}
	public void setGrandsonCAList(List<GrandsonCA> grandsonCAList) {
		this.grandsonCAList = grandsonCAList;
	}
	public List<GrandsonCB> getGrandsonCBList() {
		return grandsonCBList;
	}
	public void setGrandsonCBList(List<GrandsonCB> grandsonCBList) {
		this.grandsonCBList = grandsonCBList;
	}
	public List<GrandsonCC> getGrandsonCCList() {
		return grandsonCCList;
	}
	public void setGrandsonCCList(List<GrandsonCC> grandsonCCList) {
		this.grandsonCCList = grandsonCCList;
	}
	public List<GrandsonCD> getGrandsonCDList() {
		return grandsonCDList;
	}
	public void setGrandsonCDList(List<GrandsonCD> grandsonCDList) {
		this.grandsonCDList = grandsonCDList;
	}
	public List<GrandsonCE> getGrandsonCEList() {
		return grandsonCEList;
	}
	public void setGrandsonCEList(List<GrandsonCE> grandsonCEList) {
		this.grandsonCEList = grandsonCEList;
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
