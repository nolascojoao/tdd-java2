package com.nolascojoao.tdd;

public class Dollar {

	private Double amount;

	public Dollar(Double amount) {
		this.amount = amount;
	}

	public void times(Double multiplier) {
		amount *= multiplier;
	}
	
	public Double getAmount() {
		return amount;
	}

}
