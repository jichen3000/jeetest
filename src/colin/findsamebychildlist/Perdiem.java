package colin.findsamebychildlist;

import colin.common.SequenceHelper;



public class Perdiem implements SameSeriesable<Perdiem>{

	public Perdiem(String type, long rangeFromVal, long rangeToVal) {
		super();
		this.id = SequenceHelper.genID();
		this.type = type;
		this.name = type+" name";
		this.subType = type+" sub";
		this.rangeFromVal = rangeFromVal;
		this.rangeToVal = rangeToVal;
	}
	
	private Long id;

	private String type;
	
	private String name;
	
	private String subType;

	private Long rangeFromVal;

	private Long rangeToVal;
	
	private Contract contract;

	@Override
	public int compareTo(Perdiem other) {
		int i = this.type.compareTo(other.type);
		if (i != 0) return i;
		
		i = this.name.compareTo(other.name);
	    if (i != 0) return i;

	    i = this.subType.compareTo(other.subType);
	    if (i != 0) return i;
	    
	    return this.rangeFromVal.compareTo(other.rangeFromVal);
	}

	@Override
	public boolean isInSameSeries(Perdiem other){
		if(other==null) return false;
		return (this.type.equals(other.type) && this.name.equals(other.name) && 
				this.subType.equals(other.subType));
	}
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubType() {
		return subType;
	}

	public void setSubType(String subType) {
		this.subType = subType;
	}

	public Long getRangeFromVal() {
		return rangeFromVal;
	}

	public void setRangeFromVal(Long rangeFromVal) {
		this.rangeFromVal = rangeFromVal;
	}

	public Long getRangeToVal() {
		return rangeToVal;
	}

	public void setRangeToVal(Long rangeToVal) {
		this.rangeToVal = rangeToVal;
	}

	public Contract getContract() {
		return contract;
	}

	public void setContract(Contract contract) {
		this.contract = contract;
	}


}