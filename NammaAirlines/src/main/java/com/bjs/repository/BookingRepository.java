package com.bjs.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bjs.model.Booking;
import com.bjs.model.BookingKey;

@Repository
public interface BookingRepository extends CrudRepository<Booking, BookingKey>{

}
