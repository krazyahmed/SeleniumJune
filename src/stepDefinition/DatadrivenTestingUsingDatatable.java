package stepDefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class DatadrivenTestingUsingDatatable  extends BaseClass{
	
	@Given("^we logged into orangehrm application$")
	public void we_logged_into_orangehrm_application() throws Throwable {
	    driver=new FirefoxDriver();
	    driver.get("http://opensource.demo.orangehrmlive.com");
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	    driver.findElement(By.id("txtPassword")).sendKeys("admin");
	    driver.findElement(By.id("btnLogin")).click();
	}

	@When("^we click on PIM,AddEmployee and add multiple employess info$")
	public void we_click_on_PIM_AddEmployee_and_add_multiple_employess_info(DataTable data) throws Throwable {
	   List<List<String>> mydata=data.raw();
	   for(int i=1;i<mydata.size();i++)
	   {
		   driver.findElement(By.xpath("//*[@id='menu_pim_viewPimModule']/b")).click();
		   driver.findElement(By.linkText("Add Employee")).click();
		   driver.findElement(By.id("firstName")).sendKeys(mydata.get(i).get(0));
		   driver.findElement(By.id("middleName")).sendKeys(mydata.get(i).get(1));
		   driver.findElement(By.id("lastName")).sendKeys(mydata.get(i).get(2));
		   driver.findElement(By.id("employeeId")).clear();
		   driver.findElement(By.id("employeeId")).sendKeys(mydata.get(i).get(3));
		   driver.findElement(By.id("btnSave")).click();
		   
		   
		   
		   
		   
		   
		   
	   }
	}



}
