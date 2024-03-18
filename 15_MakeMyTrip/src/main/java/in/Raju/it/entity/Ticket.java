package in.Raju.it.entity;

public class Ticket {

	private Integer ticketnumber;
	private String name;
	private String email;
	private String from;
	private String to;
	private String doj;
	private String trainnumber;
	private String status;
	
	public Ticket(Integer ticketnumber, String name, String email, String from, String to, String doj,
			String trainnumber, String status) {
		super();
		this.ticketnumber = ticketnumber;
		this.name = name;
		this.email = email;
		this.from = from;
		this.to = to;
		this.doj = doj;
		this.trainnumber = trainnumber;
		this.status = status;
	}
	
	public Ticket() {
		
	}
	
	public Integer getTicketnumber() {
		return ticketnumber;
	}
	public void setTicketnumber(Integer ticketnumber) {
		this.ticketnumber = ticketnumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}
	public String getTrainnumber() {
		return trainnumber;
	}
	public void setTrainnumber(String trainnumber) {
		this.trainnumber = trainnumber;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
