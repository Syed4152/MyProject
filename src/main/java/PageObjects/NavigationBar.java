package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import resources.base;

public class NavigationBar extends base{
	
	WebDriver driver;
	
	
By navin = By.xpath("//a[text()='Interview Guide']");
By navBar = By.cssSelector(".navbar-collapse.collapse");



	
	
	public NavigationBar(WebDriver driver)
	{
		
		this.driver=driver;
		
	}

	
	public WebElement NavBar()
	{
		return driver.findElement(navin);
		
		
	}
	public WebElement navBar01()
	
	{
		
	return	driver.findElement(navBar);
	}
	
	
}
