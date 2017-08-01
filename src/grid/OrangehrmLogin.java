package grid;

import java.net.MalformedURLException;
import java.net.URL;


import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class OrangehrmLogin {
	@Test
	public void loginTest() throws MalformedURLException 
	{
		DesiredCapabilities caps=null;
		caps=DesiredCapabilities.chrome();
		caps.setPlatform(Platform.WINDOWS);
		RemoteWebDriver driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),caps);
		driver.get("http://opensource.demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		driver.findElement(By.id("btnLogin")).click();
		
		
		
		
	}

}
