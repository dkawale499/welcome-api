package com.sts.rest;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.sts.buind.PassengerA;
import com.sts.buind.TicketA;
import com.sts.service.TicketService;




@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	@Autowired
	private TicketService service;
	
	@PostMapping(
			value="/ticket",
			consumes = "application/json",
			produces = "application/json"
			)
	public ResponseEntity<TicketA>bookTicket(@RequestBody PassengerA passenger){
		TicketA ticket = service.bookTicket(passenger);
		return new ResponseEntity<>(ticket, HttpStatus.CREATED);
	}
	
	@GetMapping(value="ticket/{tid}",
			produces = "application/json"
			)
	public ResponseEntity<TicketA>geTicket(@PathVariable Integer tid){
		TicketA t = service.getTicket(tid);
		return new ResponseEntity<>(t, HttpStatus.OK);
	}
	
	@GetMapping(value="/tickets",
			produces = "application/json"
			)
	public ResponseEntity<List<TicketA>> getAllTickets(){
		List<TicketA> Tickets = service.getAllTickets();
		return new ResponseEntity<>(Tickets,HttpStatus.OK);
		}
}
