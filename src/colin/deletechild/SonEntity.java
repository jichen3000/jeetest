package colin.deletechild;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import colin.common.SequenceHelper;

@Entity
@Table(name = "son")
public class SonEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	public SonEntity() {
	}

	public SonEntity(String name) {
		this.id = SequenceHelper.genID();
		this.name = name;

	}

	@Id
	private Long id;
	private String name;
	@ManyToOne(cascade = { CascadeType.REFRESH })
	private DadEntity dad;

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

	public DadEntity getDad() {
		return dad;
	}

	public void setDad(DadEntity dad) {
		this.dad = dad;
	}

	@Override
	public String toString() {
		return "SonEntity [id=" + id + ", name=" + name + ", dad="
				+ dad.getId() + "]";
	}

}
