package com.sts.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sts.buind.PassengerA;

public interface PassengerRepo extends JpaRepository<PassengerA, String> {

}
