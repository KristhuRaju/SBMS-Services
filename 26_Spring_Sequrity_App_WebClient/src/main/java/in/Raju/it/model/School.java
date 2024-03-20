package in.Raju.it.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "shalome")
public class School {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer sid;
	private String schoolname;
	private String schooladdres;
	private String schollfee;
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getSchoolname() {
		return schoolname;
	}
	public void setSchoolname(String schoolname) {
		this.schoolname = schoolname;
	}
	public String getSchooladdres() {
		return schooladdres;
	}
	public void setSchooladdres(String schooladdres) {
		this.schooladdres = schooladdres;
	}
	public String getSchollfee() {
		return schollfee;
	}
	public void setSchollfee(String schollfee) {
		this.schollfee = schollfee;
	}
	public School(Integer sid, String schoolname, String schooladdres, String schollfee) {
		super();
		this.sid = sid;
		this.schoolname = schoolname;
		this.schooladdres = schooladdres;
		this.schollfee = schollfee;
	}
	public School() {
		
	}
	
	
}
