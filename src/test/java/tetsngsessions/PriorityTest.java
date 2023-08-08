package tetsngsessions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PriorityTest {
	
	@Test(priority =-1)
	public void searchTest() {
		System.out.println("searchTest");
		Assert.assertEquals("Google", "Google");
	} 
	
	//5
	@Test(priority = 2)
	public void cartTest() {
		System.out.println("cartTest");
		Assert.assertEquals("macbook", "macbook");
	}
	//8
	@Test(priority = 3)
	public void orderTest() {
		System.out.println("orderTest");
		Assert.assertEquals(1000, 1000);
	}
	
	@Test
	public void paymentTest() {
		System.out.println("paymentTest");
		Assert.assertEquals("300", "300");
		
	}
	
	@Test
	public void emailTest() {
		System.out.println("emailTest");
		Assert.assertEquals("email is sent", "email is sent");
	}
	
	
	
	
	

}
