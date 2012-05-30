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
@Table(name = "child_b")
public class ChildB {
	public ChildB(){
	}
	public ChildB(String seed){
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
	@OneToMany(cascade={CascadeType.ALL}, mappedBy="childB")
	private List<GrandsonBA> grandsonBAList = new ArrayList<GrandsonBA>();
	public void addGrandsonBA(GrandsonBA grandsonBA){
		grandsonBA.setChildB(this);
		grandsonBAList.add(grandsonBA);
	}
  
	@OneToMany(cascade={CascadeType.ALL}, mappedBy="childB")
	private List<GrandsonBB> grandsonBBList = new ArrayList<GrandsonBB>();
	public void addGrandsonBB(GrandsonBB grandsonBB){
		grandsonBB.setChildB(this);
		grandsonBBList.add(grandsonBB);
	}
  
	@OneToMany(cascade={CascadeType.ALL}, mappedBy="childB")
	private List<GrandsonBC> grandsonBCList = new ArrayList<GrandsonBC>();
	public void addGrandsonBC(GrandsonBC grandsonBC){
		grandsonBC.setChildB(this);
		grandsonBCList.add(grandsonBC);
	}
  
	@OneToMany(cascade={CascadeType.ALL}, mappedBy="childB")
	private List<GrandsonBD> grandsonBDList = new ArrayList<GrandsonBD>();
	public void addGrandsonBD(GrandsonBD grandsonBD){
		grandsonBD.setChildB(this);
		grandsonBDList.add(grandsonBD);
	}
  
	@OneToMany(cascade={CascadeType.ALL}, mappedBy="childB")
	private List<GrandsonBE> grandsonBEList = new ArrayList<GrandsonBE>();
	public void addGrandsonBE(GrandsonBE grandsonBE){
		grandsonBE.setChildB(this);
		grandsonBEList.add(grandsonBE);
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

	public List<GrandsonBA> getGrandsonBAList() {
		return grandsonBAList;
	}
	public void setGrandsonBAList(List<GrandsonBA> grandsonBAList) {
		this.grandsonBAList = grandsonBAList;
	}
	public List<GrandsonBB> getGrandsonBBList() {
		return grandsonBBList;
	}
	public void setGrandsonBBList(List<GrandsonBB> grandsonBBList) {
		this.grandsonBBList = grandsonBBList;
	}
	public List<GrandsonBC> getGrandsonBCList() {
		return grandsonBCList;
	}
	public void setGrandsonBCList(List<GrandsonBC> grandsonBCList) {
		this.grandsonBCList = grandsonBCList;
	}
	public List<GrandsonBD> getGrandsonBDList() {
		return grandsonBDList;
	}
	public void setGrandsonBDList(List<GrandsonBD> grandsonBDList) {
		this.grandsonBDList = grandsonBDList;
	}
	public List<GrandsonBE> getGrandsonBEList() {
		return grandsonBEList;
	}
	public void setGrandsonBEList(List<GrandsonBE> grandsonBEList) {
		this.grandsonBEList = grandsonBEList;
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
