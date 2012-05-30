package colin.tab.entity;

import colin.common.SequenceHelper;

public class EquipmentEntity {
	private Long id;
	private String name;
	private Long quantity;
	public EquipmentEntity(){
		
	}
	public EquipmentEntity(String name){
		this.id = SequenceHelper.genSimpleID();
		this.name = name;
		this.quantity = new Long(3);
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
	public Long getQuantity() {
		return quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "EquipmentEntity [id=" + id + ", name=" + name + ", quantity="
				+ quantity + "]";
	}
	
	
	
}
