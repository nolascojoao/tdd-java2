package com.nolascojoao.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DollarTest {

	@Test
	public void testMultiplication() {
		Dollar dollar = new Dollar(5);
		Assertions.assertEquals(new Dollar(10), dollar.times(2));
		Assertions.assertEquals(new Dollar(15), dollar.times(3));
	}

	@Test
	public void testEquality() {
		Assertions.assertTrue(new Dollar(5).equals(new Dollar(5)));
		Assertions.assertFalse(new Dollar(5).equals(new Dollar(6)));
	}

}
