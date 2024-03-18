package in.Raju.it.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import in.Raju.it.entity.Passenger;
import in.Raju.it.entity.Ticket;

@Service
public class MakemyTripService {

	public Ticket bookTicket(Passenger p) {
		String apiurl="http://localhost:8181/ticket";
		RestTemplate rt= new RestTemplate();
		 ResponseEntity<Ticket> forentiti= rt.postForEntity(apiurl, p, Ticket.class);
		Ticket body= forentiti.getBody();
		return body;
	}
	
	public List<Ticket> getAllTickets() {
		String url = "http://localhost:8181/tickets";
		RestTemplate rt1 = new RestTemplate();
		ResponseEntity<Ticket[]> tarray   = rt1.getForEntity(url, Ticket[].class);
		Ticket[] ticketbody = tarray.getBody();
		List<Ticket> list = Arrays.asList(ticketbody);
		return list;
	}
}
