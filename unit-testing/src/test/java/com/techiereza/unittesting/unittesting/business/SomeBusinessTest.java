package com.techiereza.unittesting.unittesting.business;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.techiereza.unittesting.unittesting.data.SomeDataService;

class SomeBusinessTest {
	
	@Test
	public void calculateSum_basic() {
		SomeBusinessImpl business = new SomeBusinessImpl();
		int actualResult = business.calculateSum(new int[] { 1,2,3});
		int expectedResult = 6;
		assertEquals(expectedResult, actualResult);	
	}
	
	@Test
	public void calculateSum_empty() {
		SomeBusinessImpl business = new SomeBusinessImpl();
		int actualResult = business.calculateSum(new int[] { });
		int expectedResult = 0;
		assertEquals(expectedResult, actualResult);	
	}

	@Test
	public void calculateSum_oneValue() {
		SomeBusinessImpl business = new SomeBusinessImpl();
		int actualResult = business.calculateSum(new int[] { 5});
		int expectedResult = 5;
		assertEquals(expectedResult, actualResult);	
	}

}
