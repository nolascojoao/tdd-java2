package com.nolascojoao.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DollarTest {

	@Test
	public void testMultiplication() {
		Dollar dollar = new Dollar(5.0);
		Dollar product = dollar.times(2.0);
		Assertions.assertEquals(10.0, product.getAmount());
		product = dollar.times(3.0);
		Assertions.assertEquals(15, product.getAmount());
	}

}
