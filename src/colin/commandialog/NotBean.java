package colin.commandialog;

import java.util.List;

import javax.ejb.EJB;

public class NotBean {
	@EJB
	private BookService bookService;

	public BookService getBookService() {
		return bookService;
	}
	private List<BookEntity> bookList;
	public void setBookService(BookService bookService) {
		this.bookService = bookService;
	}
	public void getBookList(){
		this.bookList = bookService.findAll();
	}
}
