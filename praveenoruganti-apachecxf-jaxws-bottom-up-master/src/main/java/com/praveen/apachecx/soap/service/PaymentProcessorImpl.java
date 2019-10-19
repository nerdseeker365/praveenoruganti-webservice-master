package com.praveen.apachecx.soap.service;

import com.praveen.apachecx.soap.service.dto.PaymentProcessorRequest;
import com.praveen.apachecx.soap.service.dto.PaymentProcessorResponse;

public class PaymentProcessorImpl implements PaymentProcessor {

	public PaymentProcessorResponse processPayment(
			PaymentProcessorRequest paymentProcessorRequest) {
		PaymentProcessorResponse paymentProcessorResponse = new PaymentProcessorResponse();
		//Business Logic or a call  to a Business Logic Class Goes Here.
		paymentProcessorResponse.setResult(true);
		return paymentProcessorResponse;
	}

}
