package com.milano.hrpayroll.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.milano.hrpayroll.entities.Payment;
import com.milano.hrpayroll.services.PaymentService;

@RestController
@RequestMapping(value="/payments")
public class PaymentResourse {
	
	@Autowired
	private PaymentService service;
	
	@GetMapping(value= "/{workerId}/day/{days}")
	public ResponseEntity<Payment> getPayment(@PathVariable Long workerId, @PathVariable Integer days){
			Payment payment = service.getPayment(workerId, days);
		return ResponseEntity.ok(payment);
	}
}
