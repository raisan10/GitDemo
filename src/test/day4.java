package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4 {
		@Parameters({"URL"})
		@Test
		public void WebHomeLogin(String uname) {
			System.out.println("web home loan");
			System.out.println(uname);
		}
		@Test
		public void MobileHomeLogin() {
			System.out.println("mobile home loan");
		}
		@Test(groups= {"smoke"})
		public void APIHomeLogin() {
			System.out.println("API home loan");
		}

}
