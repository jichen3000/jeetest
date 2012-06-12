package colin.deletechild;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.eclipse.persistence.annotations.PrivateOwned;

import colin.common.SequenceHelper;

@Entity
@Table(name = "dad")
public class DadEntity implements Serializable{
	
	private static final long serialVersionUID = 1L;
	//	public DadEntity(){
//	}
	public DadEntity(String name){
		this.id = SequenceHelper.genSimpleID();
		this.name = name;
	}
	public DadEntity(Long id, String name){
		this.id = id;
		this.name = name;
	}
	public DadEntity(){
		this.id = SequenceHelper.genID();;
		this.name = "colin "+id;
	}
	@Id
	private Long id;
	private String name;
	private Long age;
	public Long getAge() {
		return age;
	}
	public void setAge(Long age) {
		this.age = age;
	}
	@OneToMany(cascade={CascadeType.ALL}, mappedBy="dad")
	@PrivateOwned
	private List<SonEntity> sonList = new ArrayList<SonEntity>();
	
	public void addSon(SonEntity son){
		son.setDad(this);
		sonList.add(son);
		
	}
	public void delSon(SonEntity son){
		sonList.remove(son);
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<SonEntity> getSonList() {
		return sonList;
	}
	public void setSonList(List<SonEntity> sonList) {
		this.sonList = sonList;
	}
	@Override
	public String toString() {
		return "DadEntity [id=" + id + ", name=" + name + ", age=" + age+ ", son count="+sonList.size()
				+ ", sonList=" + sonList + "]";
//		return "DadEntity [id=" + id + ", name=" + name + ", age=" + age+ "]";
	}
	
	
}
