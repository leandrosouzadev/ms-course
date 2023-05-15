package br.com.elegacy.payroll.services;

import org.springframework.stereotype.Service;

import br.com.elegacy.payroll.entities.Payment;

@Service
public class PaymentService {

	public Payment getPayment(Long workerId, int days) {
		return new Payment("Bog", 200.0, days);
	}

}
