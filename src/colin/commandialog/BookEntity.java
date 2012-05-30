package colin.commandialog;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "book")
@SequenceGenerator(name = "book_seq", sequenceName = "book_seq", allocationSize = 1)
public class BookEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "book_seq")
	@Column(name = "id")
	private Long id;
	private String title;
	@Column(name = "type_code")
	private String typeCode;

	@Column(name = "publisher_code")
	private String publisherCode;

	public String printMe() {
		return "It's me";
	}

	public Long getId() {
		return id;
	}

	public BookEntity() {
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTypeCode() {
		return typeCode;
	}

	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}

	public String getPublisherCode() {
		return publisherCode;
	}

	public void setPublisherCode(String publisherCode) {
		this.publisherCode = publisherCode;
	}

	public String toString() {
		return "book " + this.hashCode() + " id:" + id + " title:" + title
				+ " typeCode:" + typeCode + " publisherCode" + publisherCode;
	}
}
