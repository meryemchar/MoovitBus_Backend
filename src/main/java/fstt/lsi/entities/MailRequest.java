package fstt.lsi.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;



public class MailRequest {
	
	private String name;
	private String to;
	private String from;
	private String subject;
	public MailRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MailRequest(String name, String to, String from, String subject) {
		super();
		this.name = name;
		this.to = to;
		this.from = from;
		this.subject = subject;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	

}
