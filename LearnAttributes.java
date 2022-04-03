package week6.day1;

import org.testng.annotations.Test;

public class LearnAttributes {
	@Test(invocationCount=5,threadPoolSize=3)
	public void driveCar() {
		System.out.println("wish to drive a car");
	}
	@Test(priority=-4,dependsOnMethods = "week6.day1.LearnAttributes2.loginPage")
	public void owningCar() {
		System.out.println("I have a Audi car");
	}
	@Test
	public void drivingLicence() {
		System.out.println("I have licence");
	}
	@Test(enabled=false)
	public void switchMusicSystem() {
		System.out.println("switch the music system");
	}
	
}
