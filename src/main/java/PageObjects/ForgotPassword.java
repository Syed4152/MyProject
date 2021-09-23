package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgotPassword {

	
	private WebDriver driver;
	public ForgotPassword(WebDriver driver) {
		this.driver = driver;
	}
	By emailfp = By.id("user_email");
	By SMi = By.cssSelector(".btn.btn-primary.btn-md.login-button");

	
	public WebElement resetPass()
	
	{
		
	return driver.findElement(emailfp);
	
	
	}
	
	public WebElement SMi()
	{
	return	driver.findElement(SMi);
	}
	
}
