package colin.tab.entity;

import colin.common.SequenceHelper;

public class ChargeEntity {
	private Long id;
	private String name;
	private Long total;

	public ChargeEntity(String name) {
		this.id = SequenceHelper.genSimpleID();
		this.name = name;
		this.total = new Long(3);
	}

	public ChargeEntity() {

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

	public Long getTotal() {
		return total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "ChargeEntity [id=" + id + ", name=" + name + ", total=" + total
				+ "]";
	}

}
