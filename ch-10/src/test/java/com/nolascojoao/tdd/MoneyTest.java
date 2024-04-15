package com.nolascojoao.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoneyTest {

	@Test
	public void testCurrency() {
		Assertions.assertEquals("USD", Money.dollar(1).currency());
		Assertions.assertEquals("CHF", Money.franc(1).currency());
	}

	@Test
	public void testDifferentClassEquality() {
		Assertions.assertTrue(new Money(10, "CHF").equals(new Franc(10, "CHF")));
	}

}
