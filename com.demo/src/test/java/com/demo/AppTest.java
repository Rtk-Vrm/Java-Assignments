package com.demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest {

	@Test
	public void test() {
		App app=new App();
		app.Sample2();
		System.out.println("Test passed.");
	}
	
	@Test
	public void addition() {
		App app=new App();
		int expected=30;
		
		int actual=app.add(10, 20);
		assertEquals(actual,expected);
	}
	@Test
	public void subtraction() {
		App app=new App();
		int expected=-10;
		
		int actual=app.sub(10, 20);
		assertEquals(actual,expected);
	}
	@Test
	public void mulitply() {
		App app=new App();
		int expected=200;
		
		int actual=app.mul(10, 20);
		assertEquals(actual,expected);
	}
	@Test
	public void divide() {
		App app=new App();
		//int expected=20;
		
		//int actual=app.div(10, 200);
		assertThrows(ArithmeticException.class,app.div(0,10));
	}

}

