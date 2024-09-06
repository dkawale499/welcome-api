package com.sts.buind;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class TicketA{
	@Id
	@GeneratedValue
	private Integer ticketId;
	private String ticketStatus;
	private String trainNo;
	private String name;
	private String dob;
	private String gender;
	private String doj;
	private String source;
	private String dest;	
	
}
