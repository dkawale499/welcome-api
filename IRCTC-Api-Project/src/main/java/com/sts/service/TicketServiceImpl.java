package com.sts.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sts.buind.PassengerA;
import com.sts.buind.TicketA;
import com.sts.repo.TicketRepo;
@Service
public class TicketServiceImpl implements TicketService {
	@Autowired
	private TicketRepo repo;
	
	@Override
	public TicketA bookTicket(PassengerA passenger) {
		TicketA  t= new TicketA();
		BeanUtils.copyProperties(passenger, t);
		t.setTicketStatus("Confirmed");
		TicketA savedticket=repo.save(t);
		return savedticket;
	}

	@Override
	public TicketA getTicket(Integer ticketId) {
		return repo.findById(ticketId).orElseThrow();
		
	}

	@Override
	public List<TicketA> getAllTickets() {
		return repo.findAll();
		
	}

}
