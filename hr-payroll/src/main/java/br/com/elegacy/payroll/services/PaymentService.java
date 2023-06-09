package br.com.elegacy.payroll.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.elegacy.payroll.entities.Payment;
import br.com.elegacy.payroll.entities.Worker;
import br.com.elegacy.payroll.feignclients.WorkerFeignClient;

@Service
public class PaymentService {	
	
	@Autowired
	private WorkerFeignClient workerFeignClient;

	public Payment getPayment(Long workerId, int days) {					
		Worker worker = workerFeignClient.findById(workerId).getBody();		
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}

}
