package com.sts.service;

import java.util.List;

import com.sts.buind.PassengerA;
import com.sts.buind.TicketA;

public interface TicketService {

	public TicketA bookTicket(PassengerA passenger);
		 
	public TicketA getTicket(Integer ticketId);
	
	public List<TicketA>getAllTickets();
	
}
