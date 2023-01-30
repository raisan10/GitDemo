package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class day1 {
	@Test
	public void Demo() {
		System.out.println("hello");
	}
	@Test(groups= {"smoke"})
	public void Demo1() {
		System.out.println("hello1");
	}
	@BeforeSuite
	public void bfsuite() {
		System.out.println("I am no1");
	}
	@AfterSuite
	public void afsuite() {
		System.out.println("I am no1 from last");
	}

}
