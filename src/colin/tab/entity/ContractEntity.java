package colin.tab.entity;

import colin.common.SequenceHelper;

public class ContractEntity {
	private Long id;
	private String name;
	private String detail;
	public ContractEntity(){
		
	}
	public ContractEntity(String name){
		this.id = SequenceHelper.genSimpleID();
		this.name = name;
		this.detail = "detail "+name;
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
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	@Override
	public String toString() {
		return "ContractEntity [id=" + id + ", name=" + name + ", detail="
				+ detail + "]";
	}
	
	
}
