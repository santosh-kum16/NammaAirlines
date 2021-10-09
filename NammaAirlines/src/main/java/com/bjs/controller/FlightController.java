package com.bjs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bjs.model.Flight;
import com.bjs.repository.FlightRepository;

@Controller("flightController")
@RestController
@RequestMapping(path = "/flight")
public class FlightController {
	
	@Autowired
	private FlightRepository flightRepository;
	
	@GetMapping(value = "/getAllFlights")
	public List<Flight> getAllFlights(){
		List<Flight> flights = null;
		flights = (List<Flight>) flightRepository.findAll();
		return flights;
	}

}
