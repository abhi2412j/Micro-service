package com.jbk.exception;

public class ErrorDetail {
	private String message;
	private String details;
	
	public ErrorDetail() {
		// TODO Auto-generated constructor stub
	}

	public ErrorDetail(String message, String details) {
		super();
		this.message = message;
		this.details = details;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	@Override
	public String toString() {
		return "ErrorDetail [message=" + message + ", details=" + details + "]";
	}
	
	 

}
