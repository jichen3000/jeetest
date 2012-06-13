package colin.findsamebychildlist;

import java.util.ArrayList;
import java.util.List;

public class Contract {
	private List<Perdiem> prediemList;
	
	public void addPrediem(Perdiem perdiem){
		if(prediemList==null){
			prediemList = new ArrayList<Perdiem>();
		}
		perdiem.setContract(this);
		prediemList.add(perdiem);
	}
	
	public boolean checkSameSeriese(Contract other){
		if (other==null) return false;
		return SameSeriese.checkListInSameSeriese(prediemList,other.getPrediemList());
	}

	public List<Perdiem> getPrediemList() {
		return prediemList;
	}

	public void setPrediemList(List<Perdiem> prediemList) {
		this.prediemList = prediemList;
	}
	
	
}
