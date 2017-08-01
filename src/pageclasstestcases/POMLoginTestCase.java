package pageclasstestcases;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageclasses.WelcomeMercurytours;

public class POMLoginTestCase {
	
	@Test
	public void loginTest()
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		WelcomeMercurytours wmPage=PageFactory.initElements(driver, WelcomeMercurytours.class);
		wmPage.findAFlight("Admin","admin");
	}

}
