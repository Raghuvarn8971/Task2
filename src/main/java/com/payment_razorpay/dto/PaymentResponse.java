package com.payment_razorpay.dto;


	public class PaymentResponse {
	    private String transactionId;
	    private double amount;


	    public PaymentResponse() {
	    }

	    
	    public String getTransactionId() {
	        return transactionId;
	    }

	    public void setTransactionId(String transactionId) {
	        this.transactionId = transactionId;
	    }

	    public double getAmount() {
	        return amount;
	    }

	    public void setAmount(double amount) {
	        this.amount = amount;
	    }
	    
	    
	   
	}

	

