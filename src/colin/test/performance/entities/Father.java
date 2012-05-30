package colin.test.performance.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import colin.common.SequenceHelper;

@JsonIgnoreProperties()
@Entity
@Table(name = "father")
public class Father {
	public Father(){
	}
	public Father(String seed){
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
	@OneToMany(cascade={CascadeType.ALL}, mappedBy="father")
	private List<ChildA> childAList = new ArrayList<ChildA>();
	public void addChildA(ChildA childA){
		childA.setFather(this);
		childAList.add(childA);
	}
	
	@OneToMany(cascade={CascadeType.ALL}, mappedBy="father")
	private List<ChildB> childBList = new ArrayList<ChildB>();
	public void addChildB(ChildB childB){
		childB.setFather(this);
		childBList.add(childB);
	}
 

	@OneToMany(cascade={CascadeType.ALL}, mappedBy="father")
	private List<ChildC> childCList = new ArrayList<ChildC>();
	public void addChildC(ChildC childC){
		childC.setFather(this);
		childCList.add(childC);
	}
 

	@OneToMany(cascade={CascadeType.ALL}, mappedBy="father")
	private List<ChildD> childDList = new ArrayList<ChildD>();
	public void addChildD(ChildD childD){
		childD.setFather(this);
		childDList.add(childD);
	}
 

	@OneToMany(cascade={CascadeType.ALL}, mappedBy="father")
	private List<ChildE> childEList = new ArrayList<ChildE>();
	public void addChildE(ChildE childE){
		childE.setFather(this);
		childEList.add(childE);
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
	public List<ChildA> getChildAList() {
		return childAList;
	}
	public void setChildAList(List<ChildA> childAList) {
		this.childAList = childAList;
	}
	
	
	public List<ChildB> getChildBList() {
		return childBList;
	}
	public void setChildBList(List<ChildB> childBList) {
		this.childBList = childBList;
	}
	public List<ChildC> getChildCList() {
		return childCList;
	}
	public void setChildCList(List<ChildC> childCList) {
		this.childCList = childCList;
	}
	public List<ChildD> getChildDList() {
		return childDList;
	}
	public void setChildDList(List<ChildD> childDList) {
		this.childDList = childDList;
	}
	public List<ChildE> getChildEList() {
		return childEList;
	}
	public void setChildEList(List<ChildE> childEList) {
		this.childEList = childEList;
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
	public String getF0() {
		return f0;
	}
	public void setF0(String f0) {
		this.f0 = f0;
	}
//	private List<ChildA> firstChildList;
//	private List<ChildB> secondChildList;
}
