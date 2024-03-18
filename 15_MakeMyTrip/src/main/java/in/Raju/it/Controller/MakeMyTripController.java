package in.Raju.it.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.Raju.it.entity.Passenger;
import in.Raju.it.entity.Ticket;
import in.Raju.it.service.MakemyTripService;

@Controller
public class MakeMyTripController {
	
	@Autowired
	public MakemyTripService makemyTripService;
	
	@PostMapping("/ticket")
	public  String ticketBooking( Passenger p, Model model) {
	Ticket bookTicket = makemyTripService.bookTicket(p);
	model.addAttribute("msg", "YOUR TICKET CONFIRMED, ID"+ bookTicket.getTicketnumber());
	return "bookTicket";
	}
	
	@GetMapping("/book-ticket")
	public String bookTicket(Model model) {
		model.addAttribute("p",  new Passenger());
		return "bookTicket";
	}
	
	@GetMapping("/")
	public String index(Model model) {
	List<Ticket> alltickets=	makemyTripService.getAllTickets();
	model.addAttribute("tickets", alltickets);   
		return"index";
	}

}
