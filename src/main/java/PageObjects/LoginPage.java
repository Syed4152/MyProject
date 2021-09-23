package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public WebDriver driver;
	
	
	By userlogin = By.id("user_email");
	By userPassword = By.id("user_password");
	By submit = By.cssSelector(".btn.btn-primary.btn-md.login-button");
	By forgetPass = By.cssSelector(".link-below-button");
	By emailfp = By.id("user_email");
	By SMi = By.cssSelector(".btn.btn-primary.btn-md.login-button");
	
	

	public LoginPage(WebDriver driver)
	{
		
		this.driver=driver;
		
	}

	public WebElement userName()
	{
		
		return driver.findElement(userlogin);
	}
	public WebElement userPass()
	{
		
		return driver.findElement(userPassword);
	}
	
	public WebElement userSubmit()
	{
		
		return driver.findElement(submit);
	}
	
	
	public ForgotPassword forgetPass()
	{
		 driver.findElement(forgetPass).click();
		ForgotPassword fp = new ForgotPassword(driver);
		 return fp;
		
		
		
	}

	
}
