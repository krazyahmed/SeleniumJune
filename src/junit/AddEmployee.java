package junit;

import org.junit.Test;
import org.openqa.selenium.By;


public class AddEmployee  extends BaseClass{
	@Test
	public void addEmpTest()
	{
		//xpath of PIM
		driver.findElement(By.xpath("//*[@id='menu_pim_viewPimModule']/b")).click();
		//id of Add employee
		driver.findElement(By.id("menu_pim_addEmployee")).click();
		
		driver.findElement(By.id("firstName")).sendKeys("sai");
		driver.findElement(By.id("middleName")).sendKeys("krishna");
		driver.findElement(By.id("lastName")).sendKeys("g");
		driver.findElement(By.id("employeeId")).clear();
		driver.findElement(By.id("employeeId")).sendKeys("111");
		driver.findElement(By.id("btnSave")).click();
	}

}

