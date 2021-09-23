package PageObjects;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	public WebDriver driver;
	public Properties prop;
	
	
	
	By singin  = By.cssSelector(".fa.fa-lock.fa-lg");
	By featuredCourse= By.xpath("//div[@class='text-center'][h2]");
	By NavBar = By.cssSelector(".nav.navbar-nav.navbar-right");
	
	
	
	public LandingPage(WebDriver driver) {
		this.driver=driver;
		
	}


	public LoginPage getLogin()
	
	{
		 driver.findElement(singin).click();
		 LoginPage lp= new LoginPage(driver);
		 return lp;
		 
	
		 
		
	}
	

	public WebElement featuredC()
	{
		
		return driver.findElement(featuredCourse);
		
	}
	public WebElement NBar()
	{
		
		return driver.findElement(NavBar);
		
	}
	
	
}
