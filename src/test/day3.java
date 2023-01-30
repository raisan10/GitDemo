package test;

import java.lang.reflect.Array;
import java.util.Arrays;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {
	@Parameters({"URL"})
	@Test
	public void WebCarLogin(String urlname) {
		System.out.println("web car loan");
		System.out.println(urlname);
	}
	@Test(groups= {"smoke"})
	public void MobileCarLogin() {
		System.out.println("mobile car loan");
	}
	@Test(enabled=false)
	public void MobileCarSignin() {
		System.out.println("mobile car Signin");
	}
	@Test(dataProvider="getData")
	public void MobileCarSignout(String username, String password) {
		System.out.println("mobile car Signout");
	}
	@Test(dependsOnMethods= {"WebCarLogin","MobileCarLogin"})
	public void APICarLogin() {
		System.out.println("API car loan");
	}
	
	@BeforeMethod
	public void bfevery() {
		System.out.println("run before test");
	}
	
	@AfterMethod
	public void Afterevery() {
		System.out.println("run after test");
	}
	@BeforeClass
	public void Beforeclass() {
		System.out.println("run before class");
	}
	@AfterClass
	public void Afterclass() {
		System.out.println("run after class");
	}
	@DataProvider
	public Object getData() {
		//good credit history
		//no credit history
		//fraudulent credit history
		Object data = new Object[3][2];
	//	data[0][0] = "username1";
	//	data[0][1] = "password1";
		
	//	data[1][0] = "username2";
	//	data[1][1] = "password2";
		
	//	data[2][0] = "username3";
	//	data[2][1] = "password3";
		
		return data;
	}
}
