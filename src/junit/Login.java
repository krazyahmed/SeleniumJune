package junit;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Login  extends BaseClass{
	
	@Test
	public void loginTest()
	{
		driver=new FirefoxDriver();
		driver.get("http://opensource.demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		driver.findElement(By.id("btnLogin")).click();
		
		
	}

}


