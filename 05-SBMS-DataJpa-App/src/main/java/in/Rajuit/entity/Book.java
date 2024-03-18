package in.Rajuit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Book {
	@Id
	private Integer id;
	private String bookauthorname;
	private Double bookprice;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getBookauthorname() {
		return bookauthorname;
	}
	public void setBookauthorname(String bookauthorname) {
		this.bookauthorname = bookauthorname;
	}
	public Double getBookprice() {
		return bookprice;
	}
	public void setBookprice(Double bookprice) {
		this.bookprice = bookprice;
	}
	
}
