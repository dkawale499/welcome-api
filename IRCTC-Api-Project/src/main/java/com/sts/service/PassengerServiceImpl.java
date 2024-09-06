package com.sts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.sts.buind.PassengerA;
import com.sts.buind.TicketA;
import com.sts.repo.PassengerRepo;

public class PassengerServiceImpl implements TicketService {
	@Autowired
	PassengerRepo passrepo;
	@Override
	public TicketA bookTicket(PassengerA passenger) {
		// TODO Auto-generated method stub
		passrepo.save(passenger);
		
		return null;
	}

	@Override
	public TicketA getTicket(Integer ticketId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TicketA> getAllTickets() {
		// TODO Auto-generated method stub
		return null;
	}

}
