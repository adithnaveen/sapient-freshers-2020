package com.mybl.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.training.testing.demo.MyBL;

class MyBlTest {
	MyBL m = null;

	
	@BeforeAll
	public static void setUpBeforeClass() {
		System.out.println("I'm in before class ");
	}
	
	@AfterAll
	public static void tearDownAfterClass() {
		System.out.println("i'm in after class ");
	}
	
	@BeforeEach
	public void setUp() {
		m = new MyBL();
		System.out.println("in setup... ");
	}
	
	@AfterEach
	public void tearDown() {
		System.out.println("in tear down... ");
	}

	@Test
	@Disabled
	void insertTest() {
		String name = "uday";
		String expected = name + " inserted";

		assertEquals(expected, m.inserte(name));
	}

	@Test
	@DisplayName(value = "to check the record is updated")
	void updateTest() {
		String name = "uday";
		String expected = name.toUpperCase();

		assertEquals(expected, m.update(name));
	}

}
