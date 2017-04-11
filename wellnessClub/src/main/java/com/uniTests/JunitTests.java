package com.uniTests;
import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;
 
 
public class JunitTests {

	@Test
	public void multiplicationOfZeroIntegersShouldReturnZero() {
		System.out.printf("%n[START] Thread Id : %s is started!", Thread.currentThread().getId());
		// assert statements
		System.out.println("test multiplication 5 and 10=" +Calculations.multiply(10, 5));
		assertEquals("10 x 5 must be 50", 50, Calculations.multiply(10, 5));
		System.out.println("test multiply by Zero = 0");
		assertEquals(0,10*0);
 
	}

	@Test
	public void addIntegerSets() {
		System.out.printf("%n[START] Thread Id : %s is started!", Thread.currentThread().getId());
		assertEquals(8,Calculations.add(1,3,4));
		System.out.println("test add of1,3,4 = "+Calculations.add(1,3,4));

 
	}

	@Test
	@Ignore("Why disabled")
	public void average() {
		System.out.printf("%n[START] Thread Id : %s is started!", Thread.currentThread().getId()); 
		System.out.println("test average of1,3,4 = "+Calculations.average(1,3,4));
		assertEquals(3,Calculations.average(2,3,4));
	}

	@Test
	public void findingMaxOIntegerSet() {
		System.out.printf("%n[START] Thread Id : %s is started!", Thread.currentThread().getId());
		System.out.println("test Max of 1,3,4,2 ="+Calculations.findMax(new int[]{1,3,4,2})); 
		assertEquals(4,Calculations.findMax(new int[]{1,3,4,2}));
	} 
}