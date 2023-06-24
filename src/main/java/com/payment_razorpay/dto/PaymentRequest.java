package com.payment_razorpay.dto;

	public class PaymentRequest {
	    private String customerName;
	    private String emailAddress;
	    private double amount;
	    private String paymentDescription;
	    
		public PaymentRequest(String customerName, String emailAddress, double amount, String paymentDescription) {
			super();
			this.customerName = customerName;
			this.emailAddress = emailAddress;
			this.amount = amount;
			this.paymentDescription = paymentDescription;
		}
		public PaymentRequest() {}

		public String getCustomerName() {
			return customerName;
		}

		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}

		public String getEmailAddress() {
			return emailAddress;
		}

		public void setEmailAddress(String emailAddress) {
			this.emailAddress = emailAddress;
		}

		public double getAmount() {
			return amount;
		}

		public void setAmount(double amount) {
			this.amount = amount;
		}

		public String getPaymentDescription() {
			return paymentDescription;
		}

		public void setPaymentDescription(String paymentDescription) {
			this.paymentDescription = paymentDescription;
		}

	    
	}

	

