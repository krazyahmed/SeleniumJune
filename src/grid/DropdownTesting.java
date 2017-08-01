package grid;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DropdownTesting {
	@Parameters("browser")
	@Test
	public void dropdownTest(String b) throws MalformedURLException
	{
		DesiredCapabilities caps=null;
		if(b.equals("chrome"))
		{
			caps=DesiredCapabilities.chrome();
			caps.setPlatform(Platform.ANY);
		}
		else if(b.equals("firefox"))
		{
			caps=DesiredCapabilities.firefox();
			caps.setPlatform(Platform.ANY);
		}
		RemoteWebDriver driver=new RemoteWebDriver(new URL
				            ("http://localhost:32768/wd/hub"),caps);
		driver.get("http://newtours.demoaut.com");
		driver.findElement(By.linkText("REGISTER")).click();
		Sleeper.sleepTightInSeconds(5);
		WebElement drop=driver.findElement(By.name("country"));
		List<WebElement> dropdown=drop.findElements(By.tagName("option"));
		for(int i=0;i<dropdown.size();i++)
		{
			dropdown.get(i).click();
			if(dropdown.get(i).isSelected())
				System.out.println(dropdown.get(i).getText()+
						                             " is active");
			else
				System.out.println(dropdown.get(i).getText()+
						                           " is inactive");
		}
	}

}
