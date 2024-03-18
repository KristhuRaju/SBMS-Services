package in.Raju.it.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Employee {

	@Id
	@GeneratedValue
	private Integer eid;
	private String empName;
	private Double empSalary;
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}
	
	
	public Integer getEid() {
		return eid;
	}
	public void setEid(Integer eid) {
		this.eid = eid;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(Double empSalary) {
		this.empSalary = empSalary;
	}
	
}
