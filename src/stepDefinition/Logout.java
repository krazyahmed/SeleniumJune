package stepDefinition;

import org.openqa.selenium.By;

import cucumber.api.java.en.When;

public class Logout extends BaseClass{
	
	@When("^logout of the application$")
	public void logout_of_the_application() throws Throwable {
	    driver.findElement(By.id("welcome")).click();
	    driver.findElement(By.linkText("Logout")).click();
	}

}
















