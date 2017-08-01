package pageclasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WelcomeMercurytours {
	@FindBy(name="userName")
	WebElement username;
	@FindBy(name="password")
	WebElement password;
	@FindBy(name="login")
	WebElement signin;
	public void findAFlight(String u,String p)
	{
		username.sendKeys(u);
		password.sendKeys(p);
		signin.click();
	}
	
	@FindBy(linkText="your destination")
	WebElement yourDestination;
	public void destiantions()
	{
		yourDestination.click();
	}
	
	@FindBy(linkText="featured vacation destinations")
	WebElement f_v_destiantions;
	public void vacations()
	{
		f_v_destiantions.click();
	}
	
	@FindBy(linkText="Register here")
	WebElement  registerHere;
	public void register()
	{
		registerHere.click();
	}
	
	
	
	
	

}
