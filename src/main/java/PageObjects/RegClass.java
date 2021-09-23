package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegClass {
	
	public WebDriver driver;
	
	
	By reg = By.cssSelector(".fa.fa-user.fa-lg");
	
	public RegClass(WebDriver driver)
	
	{
		this.driver=driver;
		
	}

	public WebElement register()
	{
		
		return driver.findElement(reg);
		
	}

}
