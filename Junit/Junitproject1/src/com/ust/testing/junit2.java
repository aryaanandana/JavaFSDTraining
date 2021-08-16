package com.ust.testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class junit2 {

	@Test
	public void calc() {
		int a=5,b=6,c;
		c=a+b;
		assertEquals(5,c);
		
	}

}
