package com.bjs.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "booking")
public class Booking implements Serializable {
	
	private static final long serialVersionUID = -6458761163200883226L;
	
	
	@EmbeddedId
	private BookingKey bookingKey;
	
	@Column (name = "source")
	private String source;
	
	@Column(name = "destination")
	private String destination;
	
	@Column(name = "dep_date")
	private Date depDate;
	
	@Column(name = "price")
	private int price;
	
	@Column(name = "dep_time")
	private String depTime;
	
	@Column(name = "carrier")
	private String carrier;
	
	@Column(name = "bag_count")
	private int bagCount;
	
	@Column(name = "booking_date")
	private Date bookingDate;
	
	public BookingKey getBookingKey() {
		return bookingKey;
	}

	public void setBookingKey(BookingKey bookingKey) {
		this.bookingKey = bookingKey;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Date getDepDate() {
		return depDate;
	}

	public void setDepDate(Date depDate) {
		this.depDate = depDate;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getDepTime() {
		return depTime;
	}

	public void setDepTime(String depTime) {
		this.depTime = depTime;
	}

	public String getCarrier() {
		return carrier;
	}

	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}

	public int getBagCount() {
		return bagCount;
	}

	public void setBagCount(int bagCount) {
		this.bagCount = bagCount;
	}

	public Date getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}

}
