package com.nolascojoao.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DollarTest {

	@Test
	public void testMultiplication() {
		Dollar dollar = new Dollar(5.0);
		Assertions.assertEquals(new Dollar(10.0), dollar.times(2.0));
		Assertions.assertEquals(new Dollar(15.0), dollar.times(3.0));
	}

	@Test
	public void testEquality() {
		Assertions.assertTrue(new Dollar(5.0).equals(new Dollar(5.0)));
		Assertions.assertFalse(new Dollar(5.0).equals(new Dollar(6.0)));
	}

}
