package com.ust.testing;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Junit1 {
	
	@ BeforeClass
	public static void beforeAllTest()
	{
		System.out.println("before all tes starts");
	}
	@Before
	public void beforeTest() {
		System.out.println("before test");
	}

	@Test(timeout=500)
	
	public void test() {
		String str="java training";
		assertEquals("java training",str);
		

		//fail("Not yet implemented");
	}
	@AfterClass
	public static  void afterTest() {
		System.out.println("after testing");
	}
	@After
	public void afterAllTest() {
		System.out.println("after test");
	}
	@Test	
	public void test1()
	{
		int i=25;
		assertNotEquals(25,25);
		
	}
	

}

