package tetsngsessions;

import org.testng.annotations.Test;

public class DependsOnMethodConcept {
	
	
	@Test
	public void loginTest() {
		System.out.println("login to the app");
		int i = 9/0;
	}
	
	@Test(dependsOnMethods = "loginTest")
	public void appsearchTest() {
		System.out.println("searchTest");
	}
	
	@Test(dependsOnMethods = "appsearchTest")
	public void selectProductTest() {
		System.out.println("selectProductTest");
	}
	
	
	//login -
	
	
	
	
	
	
	

}
