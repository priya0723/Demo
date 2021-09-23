package com.castseleniumframework;

import org.testng.annotations.Test;   

public class ContactTest {
	
    @Test(groups="SmokeTest")
	
	public void createContactTest() {
		
		System.out.println("execute createContactTest");
	}
	@Test(groups="regressionTest")
	public void createContactWithOrgTest() {
		
		System.out.println("execute createContactWithOrgTest");
	}
	@Test(groups="regressionTest")
	public void deleteContactTest() {
		
		System.out.println("execute deleteContactTest");
	}
	
	

}



