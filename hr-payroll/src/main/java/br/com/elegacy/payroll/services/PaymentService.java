package br.com.elegacy.payroll.services;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.elegacy.payroll.entities.Payment;
import br.com.elegacy.payroll.entities.Worker;

@Service
public class PaymentService {
	
	@Value("${hr-worker.host}")
	private String workerHost;
	
	@Autowired
	private RestTemplate restTemplate;

	public Payment getPayment(Long workerId, int days) {
		Map<String, String> uriVariables = new HashMap<>();
		uriVariables.put("id", String.valueOf(workerId));
		
		String url = String.format("%s/workers/{id}", workerHost);		
		Worker worker = restTemplate.getForObject(url, Worker.class, uriVariables);
		
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}

}
