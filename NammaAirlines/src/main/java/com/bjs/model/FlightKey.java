package com.bjs.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class FlightKey implements Serializable {
	
private static final long serialVersionUID = 1426019456787312006L;
	
	@Column(name = "flt_num")
	private String fltNum;
	
	@Column(name = "from")
	private String from;
	
	@Column(name = "to")
	private String to;
	
	@Column(name = "dep_date")
	private Date depDate;

	
	public String getFltNum() {
		return fltNum;
	}

	public void setFltNum(String fltNum) {
		this.fltNum = fltNum;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public Date getDepDate() {
		return depDate;
	}

	public void setDepDate(Date depDate) {
		this.depDate = depDate;
	}

	
}
