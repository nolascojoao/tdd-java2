package com.nolascojoao.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoneyTest {

	@Test
	public void testEquality() {
		Assertions.assertTrue(Money.dollar(5).equals(Money.dollar(5)));
		Assertions.assertFalse(Money.dollar(5).equals(Money.dollar(6)));
		
		Assertions.assertTrue(Money.franc(5).equals(Money.franc(5)));
		Assertions.assertFalse(Money.franc(5).equals(Money.franc(6)));
		
		Assertions.assertFalse(Money.franc(5).equals(Money.dollar(5)));
	}

}
