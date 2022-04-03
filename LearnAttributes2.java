package week6.day1;

import org.testng.annotations.Test;

public class LearnAttributes2 {
	
	@Test(dependsOnMethods = "loginPage",alwaysRun=true)
	public void createLead() {
		System.out.println("created successfully");
	}
	@Test
	public void loginPage() {
		System.out.println("logged successfully");
		throw new RuntimeException(); 
	
	}
	@Test(dependsOnMethods= {"loginPage","createLead"})
	public void editlead() {
		System.out.println("updated the lead");
	}
	@Test(invocationCount=4,timeOut=3000)
	public void deleteLead() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("delete lead");
	}

}
