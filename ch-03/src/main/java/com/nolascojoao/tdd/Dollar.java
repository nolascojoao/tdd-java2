package com.nolascojoao.tdd;

import java.util.Objects;

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

	@Override
	public int hashCode() {
		return Objects.hash(amount);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dollar other = (Dollar) obj;
		return Objects.equals(amount, other.amount);
	}

}
