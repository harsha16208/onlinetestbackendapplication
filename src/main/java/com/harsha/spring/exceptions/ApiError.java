package com.harsha.spring.exceptions;

import java.util.Date;

public class ApiError {

	private Date date;
	private String message;
	
	public ApiError(Date date, String message) {
		super();
		this.date = date;
		this.message = message;
	}
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
