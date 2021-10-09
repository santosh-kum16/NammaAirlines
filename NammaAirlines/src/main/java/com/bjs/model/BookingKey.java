package com.bjs.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class BookingKey implements Serializable{
	
	private static final long serialVersionUID = -2185173012506278891L;
	
	@Column(name = "flt_num")
	private String fltNum;
	
	@Column(name = "seat_num")
	private String seatNum;

	
	@Column(name = "phn_num")
	private String phnNum;
	
	public String getPhnNum() {
		return phnNum;
	}

	public void setPhnNum(String phnNum) {
		this.phnNum = phnNum;
	}

	public String getFltNum() {
		return fltNum;
	}

	public void setFltNum(String fltNum) {
		this.fltNum = fltNum;
	}

	public String getSeatNum() {
		return seatNum;
	}

	public void setSeatNum(String seatNum) {
		this.seatNum = seatNum;
	}

	
}
