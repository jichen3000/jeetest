package colin.tab;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

import colin.tab.entity.ChargeEntity;

@ManagedBean(name = "chargeBean")
@ViewScoped
public class ChargeBean {
	@Inject
	private ChargeEntity charge;

	public void save(){
		System.out.println("ChargeBean save...");
		System.out.println(this.charge);
	}



	public ChargeEntity getCharge() {
		return charge;
	}


	public void setCharge(ChargeEntity charge) {
		this.charge = charge;
	}
	

}
