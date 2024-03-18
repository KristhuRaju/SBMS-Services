package in.Raju.it.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long cid;
	private String cname;
	private String cmail;
	
	
	public Customer(Long cid, String cname, String cmail) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cmail = cmail;
	}
	
	public Customer() {
		
	}

	public Long getCid() {
		return cid;
	}
	public void setCid(Long cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCmail() {
		return cmail;
	}
	public void setCmail(String cmail) {
		this.cmail = cmail;
	}
	

}
