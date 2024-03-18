package in.Rajuit.Service;

import org.springframework.stereotype.Component;

@Component
public class UserEmail {

	public Boolean emailSent(String email) {
		System.out.println("Email sent");
		return true;
	}
}
