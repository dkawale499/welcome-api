package com.sts.buind;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class PassengerA {
	@Id
	private String name;
	private String dob;
	private String gender;
	private String doj;
	private String source;
	private String dest;
	private String trainNo;
	
}
