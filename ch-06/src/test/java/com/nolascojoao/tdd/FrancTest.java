package com.nolascojoao.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FrancTest {
	
	@Test
	public void testFrancMultiplication() {
		Franc franc = new Franc(5);
		Assertions.assertEquals(new Franc(10), franc.times(2));
		Assertions.assertEquals(new Franc(15), franc.times(3));
	}
	
	@Test
	public void testEquality() {
		Assertions.assertTrue(new Franc(8).equals(new Franc(8)));
		Assertions.assertFalse(new Franc(5).equals(new Franc(6)));
	}

}
