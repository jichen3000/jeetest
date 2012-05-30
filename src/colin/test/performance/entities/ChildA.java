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
@Table(name = "child_a")
public class ChildA {
	public ChildA(){
	}
	public ChildA(String seed){
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
	@OneToMany(cascade={CascadeType.ALL}, mappedBy="childA")
	private List<GrandsonAA> grandsonAAList = new ArrayList<GrandsonAA>();
	public void addGrandsonAA(GrandsonAA grandsonAA){
		grandsonAA.setChildA(this);
		grandsonAAList.add(grandsonAA);
	}
	
	@OneToMany(cascade={CascadeType.ALL}, mappedBy="childA")
	private List<GrandsonAB> grandsonABList = new ArrayList<GrandsonAB>();
	public void addGrandsonAB(GrandsonAB grandsonAB){
		grandsonAB.setChildA(this);
		grandsonABList.add(grandsonAB);
	}
	
	@OneToMany(cascade={CascadeType.ALL}, mappedBy="childA")
	private List<GrandsonAC> grandsonACList = new ArrayList<GrandsonAC>();
	public void addGrandsonAC(GrandsonAC grandsonAC){
		grandsonAC.setChildA(this);
		grandsonACList.add(grandsonAC);
	}
	
	@OneToMany(cascade={CascadeType.ALL}, mappedBy="childA")
	private List<GrandsonAD> grandsonADList = new ArrayList<GrandsonAD>();
	public void addGrandsonAD(GrandsonAD grandsonAD){
		grandsonAD.setChildA(this);
		grandsonADList.add(grandsonAD);
	}
	
	@OneToMany(cascade={CascadeType.ALL}, mappedBy="childA")
	private List<GrandsonAE> grandsonAEList = new ArrayList<GrandsonAE>();
	public void addGrandsonAE(GrandsonAE grandsonAE){
		grandsonAE.setChildA(this);
		grandsonAEList.add(grandsonAE);
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
	public List<GrandsonAA> getGrandsonAAList() {
		return grandsonAAList;
	}
	public void setGrandsonAAList(List<GrandsonAA> grandsonAAList) {
		this.grandsonAAList = grandsonAAList;
	}
	
	public List<GrandsonAB> getGrandsonABList() {
		return grandsonABList;
	}
	public void setGrandsonABList(List<GrandsonAB> grandsonABList) {
		this.grandsonABList = grandsonABList;
	}
	public List<GrandsonAC> getGrandsonACList() {
		return grandsonACList;
	}
	public void setGrandsonACList(List<GrandsonAC> grandsonACList) {
		this.grandsonACList = grandsonACList;
	}
	public List<GrandsonAD> getGrandsonADList() {
		return grandsonADList;
	}
	public void setGrandsonADList(List<GrandsonAD> grandsonADList) {
		this.grandsonADList = grandsonADList;
	}
	public List<GrandsonAE> getGrandsonAEList() {
		return grandsonAEList;
	}
	public void setGrandsonAEList(List<GrandsonAE> grandsonAEList) {
		this.grandsonAEList = grandsonAEList;
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
