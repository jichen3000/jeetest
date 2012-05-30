package colin.checkcontinuity;

import java.util.Date;

import colin.common.SequenceHelper;


/**
 * The persistent class for the PERDIEM_BY_DT database table.
 * 
 */
public class PerdiemByDate implements RangeContinuity<PerdiemByDate, Date>,Comparable<PerdiemByDate> {

	public PerdiemByDate(String type, Date rangeFromVal, Date rangeToVal) {
		super();
		this.id = SequenceHelper.genID();
		this.type = type;
		this.name = type+" name";
		this.subType = type+" sub";
		this.fromDt = rangeFromVal;
		this.toDt = rangeToVal;
	}
	
	private Long id;

	private String type;
	
	private String name;
	
	private String subType;

	private Date fromDt;

	private Date toDt;

	@Override
	public int compareTo(PerdiemByDate other) {
		int i = this.type.compareTo(other.type);
		if (i != 0) return i;
		
		i = this.name.compareTo(other.name);
	    if (i != 0) return i;

	    i = this.subType.compareTo(other.subType);
	    if (i != 0) return i;
	    
	    return this.fromDt.compareTo(other.toDt);
	}

	@Override
	public Date getRangeFrom() {
		return fromDt;
	}

	@Override
	public Date getRangeTo() {
		return toDt;
	}

	@Override
	public boolean isInSameSeries(PerdiemByDate other) {
		return (this.type.equals(other.type) && this.name.equals(other.name) && 
				this.subType.equals(other.subType));
	}
	
    public PerdiemByDate() {
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

	public Date getFromDt() {
		return fromDt;
	}

	public void setFromDt(Date fromDt) {
		this.fromDt = fromDt;
	}

	public Date getToDt() {
		return toDt;
	}

	public void setToDt(Date toDt) {
		this.toDt = toDt;
	}


}