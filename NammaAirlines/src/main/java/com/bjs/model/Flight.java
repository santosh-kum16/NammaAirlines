package com.bjs.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "flight")
public class Flight implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6367886987651640697L;

	@EmbeddedId
	private FlightKey flightKey;
	
	@Column(name = "price")
	private int price;
	
	@Column(name = "dep_time")
	private String depTime;
	
	@Column(name = "carrier")
	private String carrier;

	public FlightKey getFlightKey() {
		return flightKey;
	}

	public void setFlightKey(FlightKey flightKey) {
		this.flightKey = flightKey;
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

	
}
