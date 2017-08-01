package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DatadrivenTestinginCucumber1 {
	FirefoxDriver driver;
	@Given("^the browser is launched and the url is opened$")
	public void the_browser_is_launched_and_the_url_is_opened() throws Throwable {
	    driver=new FirefoxDriver();
	    driver.get("http://opensource.demo.orangehrmlive.com");
	}

	@When("^we enter the \"([^\"]*)\" and the \"([^\"]*)\"$")
	public void we_enter_the_and_the(String u, String p) throws Throwable {
	    driver.findElement(By.id("txtUsername")).sendKeys(u);
	    driver.findElement(By.id("txtPassword")).sendKeys(p);
	}

	@When("^click on sigin button$")
	public void click_on_sigin_button() throws Throwable {
	    driver.findElement(By.id("btnLogin")).click();
	 }

	@Then("^it should display the \"([^\"]*)\"$")
	public void it_should_display_the(String expmsg) throws Throwable {
		String actmsg=null;
		if(expmsg.equals("Invalid credentials"))
	    	actmsg=driver.findElement(By.id("spanMessage")).getText();
		else if(expmsg.equals("Welcome Admin"))
			actmsg=driver.findElement(By.id("welcome")).getText();
		Assert.assertEquals(actmsg, expmsg);
	}



}
