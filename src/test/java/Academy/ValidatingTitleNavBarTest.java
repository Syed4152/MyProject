package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.LandingPage;
import PageObjects.NavigationBar;
import resources.base;

public class ValidatingTitleNavBarTest extends base{
	public WebDriver driver;
	
	public static Logger log = LogManager.getLogger(base.class.getName());
	
@BeforeTest

public void initialize() throws IOException
{
	driver = initializeDriver();
	driver.get(prop.getProperty("url"));
	log.info("Successfully landed on HomePage");
	 driver.manage().window().maximize();
}
	@Test
	public void baseNavPage() throws IOException {
		
		
		
		NavigationBar nav= new NavigationBar(driver);
		Assert.assertTrue(nav.NavBar().isDisplayed());	
	}
	
	@AfterTest
	
	public void teardown ()
	{
		driver.close();
		
		
	}	
}
