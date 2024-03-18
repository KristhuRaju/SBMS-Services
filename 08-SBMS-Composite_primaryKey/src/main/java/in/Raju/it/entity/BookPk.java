package in.Raju.it.entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class BookPk {
	
	private Integer bookid;
	private String bookName; 
	
	public BookPk(Integer bookid, String bookName) {
		super();
		this.bookid = bookid;
		this.bookName = bookName;
	}
	
	public BookPk() {
		
	}
	
	
	@Override
	public String toString() {
		return "BookPk [bookid=" + bookid + ", bookName=" + bookName + "]";
	}
	
	public Integer getBookid() {
		return bookid;
	}
	public void setBookid(Integer bookid) {
		this.bookid = bookid;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	
}
