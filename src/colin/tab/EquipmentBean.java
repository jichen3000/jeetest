package colin.tab;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

import colin.tab.entity.EquipmentEntity;

@ManagedBean(name = "equipmentBean")
@ViewScoped
public class EquipmentBean {
	@Inject
	private EquipmentEntity equipment;
	

	public void save(){
		System.out.println("EquipmentBean save...");
		System.out.println(this.equipment);
	}


	public EquipmentEntity getEquipment() {
		return equipment;
	}


	public void setEquipment(EquipmentEntity equipment) {
		this.equipment = equipment;
	}




}
