package com.bjs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bjs.model.Booking;
import com.bjs.repository.BookingRepository;

@Controller("bookingController")
@RestController
@RequestMapping(path = "/booking")
public class BookingController {
	
	@Autowired
	private BookingRepository bookingRepository;
	
	@GetMapping(value = "/getAllBookings")
	public List<Booking> getAllBookings(){
		List<Booking> bookings = null;
		bookings = (List<Booking>) bookingRepository.findAll();
		return bookings;
	}
	
	@PostMapping (value ="/addBooking", consumes = "application/json", produces = "application/json")
	public String addBooking(@RequestBody Booking booking) {
		bookingRepository.save(booking);
		return "SUCCESS";
		
	}

}
