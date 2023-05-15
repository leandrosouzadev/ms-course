package br.com.elegacy.payroll.entities;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String name;
	private Double dailyIncome;
	private int days;
	
	public double getTotal() {
		return days * dailyIncome;
	}

}
