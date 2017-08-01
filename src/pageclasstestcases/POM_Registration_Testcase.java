package pageclasstestcases;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageclasses.LeftMenu;
import pageclasses.RegisterMercuryTours;
import pageclasses.WelcomeMercurytours;

public class POM_Registration_Testcase {
	
	@Test
	public void registrationTest()
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		WelcomeMercurytours wmPage=PageFactory.initElements(driver,WelcomeMercurytours.class);
		RegisterMercuryTours rmPage=PageFactory.initElements(driver,RegisterMercuryTours.class);
		LeftMenu lmPage=PageFactory.initElements(driver,LeftMenu.class);
		wmPage.register();
		rmPage.register();
		lmPage.home();
		wmPage.findAFlight("tutorial","tutorial");
		
	}

}
