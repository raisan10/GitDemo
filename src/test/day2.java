package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {

	@Test
	public void Demo2() {
		System.out.println("hello2");
	}
	
	@BeforeTest
	public void prerequisite() {
		System.out.println("I will execute first");
	}
	
	@AfterTest
	public void postrequisite() {
		System.out.println("I will execute last");
	}
}
