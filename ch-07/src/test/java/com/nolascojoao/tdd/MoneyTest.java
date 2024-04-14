package com.nolascojoao.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoneyTest {

	/**
	 * This test verifies that objects of different currency types (Franc and Dollar) are not considered equal,
	 * which is expected behavior in the domain of Java objects, but doesn't reflect real-world finance.
	 */
	@Test
	public void testEquality() {
		Assertions.assertFalse(new Franc(5).equals(new Dollar(5)));
	}

}
