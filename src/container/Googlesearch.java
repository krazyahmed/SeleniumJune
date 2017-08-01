package container;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Googlesearch {
	@Parameters("browser")
	@Test
	public void googleSearchTest(String b) throws MalformedURLException
	{
		DesiredCapabilities caps=null;
		if(b.equals("firefox"))
		{
			caps=DesiredCapabilities.firefox();
			caps.setPlatform(Platform.ANY);
		}
		else if(b.equals("chrome"))
		{
			caps=DesiredCapabilities.chrome();
			caps.setBrowserName("chrome");
			caps.setPlatform(Platform.ANY);
			}
		RemoteWebDriver driver=new RemoteWebDriver(new URL("http://localhost:32772/wd/hub"),caps);
		driver.get("http://google.com");
		Sleeper.sleepTightInSeconds(10);
		driver.findElement(By.name("q")).sendKeys("selenium");
			
	}

}
