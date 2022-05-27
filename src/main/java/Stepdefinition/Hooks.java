package Stepdefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	@Before("@MobileTest")
	
	public void beforevalidation()
	{
		System.out.println("Before web hook");
	}
		
	@After("@MobileTest")
	
	public void aftervalidation()
	{
		System.out.println("After web hook");
	}
}
