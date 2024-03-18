package in.Raju.it.entity;

public class Passenger {
	
	private String name;
	private String email;
	private String from;
	private String to;
	private String doj;
	private String trainnumber;
	
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
	public Passenger(String name, String email, String from, String to, String doj, String trainnumber) {
		super();
		this.name = name;
		this.email = email;
		this.from = from;
		this.to = to;
		this.doj = doj;
		this.trainnumber = trainnumber;
	}
	public Passenger() {
		
	}

}
