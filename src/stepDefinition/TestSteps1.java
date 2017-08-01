package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestSteps1 {
	
	static FirefoxDriver driver;
	@Given("^the browser is launched and the url is navigated to$")
	public void the_browser_is_launched_and_the_url_is_navigated_to() throws Throwable {
	    driver=new FirefoxDriver();
	    driver.get("http://opensource.demo.orangehrmlive.com/");
	}

	@When("^we enter the username and paasword$")
	public void we_enter_the_username_and_paasword() throws Throwable {
	    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	    driver.findElement(By.id("txtPassword")).sendKeys("admin");
	}

	@When("^click on login button$")
	public void click_on_login_button() throws Throwable {
	    driver.findElement(By.id("btnLogin")).click();
	}

	@Then("^it should display welcome admin msg$")
	public void it_should_display_welcome_admin_msg() throws Throwable {
		String expText="Welcome Admin";
	    String actText=driver.findElement(By.id("welcome")).getText();
	    Assert.assertEquals(actText, expText);
	    Sleeper.sleepTightInSeconds(4);
	}
	
	@When("^we click on welcome admin$")
	public void we_click_on_welcome_admin() throws Throwable {
		driver.findElement(By.id("welcome")).click();
	}

	@When("^then click on Logout$")
	public void then_click_on_Logout() throws Throwable {
		Sleeper.sleepTightInSeconds(3);
	    driver.findElement(By.linkText("Logout")).click();
	}

	@Then("^it should come to login page$")
	public void it_should_come_to_login_page() throws Throwable {
	    String expurl="http://opensource.demo.orangehrmlive.com/index.php/auth/login";
	    String acturl=driver.getCurrentUrl();
	   Assert.assertEquals(acturl, expurl);
	    
	    
	    
	    
	}



}
