package com.nolascojoao.tdd;

public class Dollar {

	private Double amount;

	public Dollar(Double amount) {
		this.amount = amount;
	}

	public Dollar times(Double multiplier) {
		return new Dollar(amount * multiplier);
	}

	public Double getAmount() {
		return amount;
	}

}
