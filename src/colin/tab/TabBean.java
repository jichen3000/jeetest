package colin.tab;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import org.primefaces.event.TabChangeEvent;

import colin.tab.entity.ChargeEntity;
import colin.tab.entity.ContractEntity;
import colin.tab.entity.EquipmentEntity;

@ManagedBean(name = "tabBean")
@ViewScoped
public class TabBean {
	@Inject
	private ContractEntity contract;
    @ManagedProperty(value="#{chargeBean.charge}")
    private ChargeEntity charge;	
    
    @ManagedProperty(value="#{equipmentBean.equipment}")
    private EquipmentEntity equipment;	
    
	public void setEquipment(EquipmentEntity equipment) {
		this.equipment = equipment;
	}


	public void save(){
		
		System.out.println("tab save...");
		System.out.println(contract);
		System.out.println(charge);
		System.out.println(equipment);
	}
	
	
	public void setCharge(ChargeEntity charge) {
		this.charge = charge;
	}


	public ContractEntity getContract() {
		return contract;
	}


	public void setContract(ContractEntity contract) {
		this.contract = contract;
	}


	
//	public void onTabChange(ActionEvent actionEvent){
//        FacesContext context = FacesContext.getCurrentInstance();  
//        context.addMessage(null, new FacesMessage("Successful", "Hello "));  
//
//	}
	public void onTabChange(TabChangeEvent event) {       
      FacesContext context = FacesContext.getCurrentInstance();  
      context.addMessage(null, new FacesMessage("Successful", "Hello "+ event.getTab().getId()));  
	    System.out.println("tab id = " + event.getTab().getId());
	}
}
