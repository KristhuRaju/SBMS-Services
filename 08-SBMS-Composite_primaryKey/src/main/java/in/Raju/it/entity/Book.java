package in.Raju.it.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name= "booktbl")
public class Book {
	private Double bookPrice;
	private String authorName;
	
	public Book() {
		
	}
	public Book(Double bookPrice, String authorName, BookPk bookPk) {
		super();
		this.bookPrice = bookPrice;
		this.authorName = authorName;
		this.bookPk = bookPk;
	}

	
	@EmbeddedId
	private BookPk bookPk;

	@Override
	public String toString() {
		return "Book [bookPrice=" + bookPrice + ", authorName=" + authorName + ", bookPk=" + bookPk + "]";
	}
	
	

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public Double getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(Double bookPrice) {
		this.bookPrice = bookPrice;
	}

	

	
	
	



}
