package com.ust.testing;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.sun.net.httpserver.Authenticator.Result;

@RunWith(Suite.class)
@SuiteClasses({Junit1.class,junit2.class})


public class Tester {
	public static void main (String args[]) {
		
		org.junit.runner.Result r=JUnitCore.runClasses(Tester.class);
		System.out.println(r.wasSuccessful());
		
		
	}


	
}
