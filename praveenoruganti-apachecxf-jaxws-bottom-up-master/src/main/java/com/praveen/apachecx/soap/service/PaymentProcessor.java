package com.praveen.apachecx.soap.service;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.praveen.apachecx.soap.dto.PaymentProcessorRequest;
import com.praveen.apachecx.soap.dto.PaymentProcessorResponse;

@WebService(serviceName = "PaymentProcessor")
public interface PaymentProcessor {

	public @WebResult(name = "response")
	PaymentProcessorResponse processPayment(
			@WebParam(name = "PaymentProcessorRequest") PaymentProcessorRequest paymentProcessorRequest);
}
