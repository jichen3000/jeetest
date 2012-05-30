package colin.commandialog;

import java.io.IOException;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;


@ManagedBean(name = "bookBean")
@ViewScoped
public class BookBean {
	public BookBean() {
		System.out.println("BookBean...");
	}

	@Inject
	private BookEntity book;
	@EJB
	private BookService bookService;
	
	private NotBean notBean;
	
	public NotBean getNotBean() {
		return notBean;
	}
	public void setNotBean(NotBean notBean) {
		this.notBean = notBean;
	}
	@PostConstruct
	public void postConstruct() {
		System.out.println("BookBean postConstruct...");
		notBean = new NotBean();
	}
	public BookEntity getBook() {
		return book;
	}

	public void setBook(BookEntity book) {
		this.book = book;
	}

	public void save(){
		bookService.saveOrUpdate(book);
	}
	
	
	
	@EJB
	private PublisherCodeService PublisherCodeService;
	public List<PublisherCodeEntity> getPublisherCodeList(){
		System.out.println("getPublisherCodeList...");
		return PublisherCodeService.findAll();
	}	
	
	private boolean genPublisherCodeDialog = false;
	public boolean getGenPublisherCodeDialog() {
		return genPublisherCodeDialog;
	}
	
	public void showPublisherCodeDialog(){
		genPublisherCodeDialog = true;
		System.out.println("showPublisherCodeDialog...");
	}
	
	public String gotoWithParam(){
		return "/inbox/list.xhtml?faces-redirect=true&trans_param=123";
//		return "success?faces-redirect=true&IncludeViewParams=true";
	}
}
