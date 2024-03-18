package in.Rajuit.entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="raju_contact")

public class ContactEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cid;
	private String cname;
	private String cmail;
	private Double cnumber;
	
	//if you want time also you can use LocalDateTime data type
	@CreationTimestamp
	@Column(name="inserted_date_Time", updatable = false)
	private LocalDate inserteddate;
	
	//if you want time also you can use LocalDateTime data type
	@UpdateTimestamp
	@Column(name="updateed_date_time", insertable = false)
	private LocalDate updateddate;
	
	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
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

	public LocalDate getInserteddate() {
		return inserteddate;
	}

	public void setInserteddate(LocalDate inserteddate) {
		this.inserteddate = inserteddate;
	}

	public LocalDate getUpdateddate() {
		return updateddate;
	}

	public void setUpdateddate(LocalDate updateddate) {
		this.updateddate = updateddate;
	}
	public Double getCnumber() {
		return cnumber;
	}

	public void setCnumber(Double cnumber) {
		this.cnumber = cnumber;
	}

}
