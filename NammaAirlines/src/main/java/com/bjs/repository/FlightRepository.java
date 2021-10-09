package com.bjs.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bjs.model.Flight;
import com.bjs.model.FlightKey;

@Repository
public interface FlightRepository extends CrudRepository<Flight, FlightKey>{
	

}
