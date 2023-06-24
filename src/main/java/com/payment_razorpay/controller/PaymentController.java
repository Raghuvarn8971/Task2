package com.payment_razorpay.controller;

import com.razorpay.RazorpayClient;
import com.razorpay.RazorpayException;
import com.payment_razorpay.dto.PaymentRequest;
import com.payment_razorpay.dto.PaymentResponse;
import com.razorpay.Order;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/payments/razorpay")
public class PaymentController {

	@Value("${razorpay.keyId}")
	private String razorpayKeyId;

	@Value("${razorpay.keySecret}")
	private String razorpayKeySecret;

	@PostMapping("/create-order")
	public Order createOrder(@RequestBody PaymentRequest paymentRequest) throws RazorpayException {
		RazorpayClient razorpayClient = new RazorpayClient(razorpayKeyId, razorpayKeySecret);
		JSONObject orderRequest = new JSONObject();
		orderRequest.put("amount", paymentRequest.getAmount() * 100); // Convert amount to paise
		orderRequest.put("currency", "INR");
		orderRequest.put("receipt", paymentRequest.getPaymentDescription()); // Use getPaymentDescription() instead of
																			 // getReceiptId()
		Order order = razorpayClient.orders.create(orderRequest);
		return order;
	}

	@PostMapping("/payment-success")
	public String paymentSuccess(@RequestBody PaymentResponse paymentResponse, Model model) {
		// Process the payment response and handle successful payment scenario
		model.addAttribute("message", "Payment successful!");
		model.addAttribute("transactionId", paymentResponse.getTransactionId());
		model.addAttribute("amount", paymentResponse.getAmount());
		return "payment_conformation";
	}

	@ExceptionHandler(RazorpayException.class)
	public String handleRazorpayException(RazorpayException ex, Model model) {
		// Handle Razorpay exception
		model.addAttribute("errorMessage", "Error occurred during payment: " + ex.getMessage());
		return "payment conformation successufull";
	}
}
