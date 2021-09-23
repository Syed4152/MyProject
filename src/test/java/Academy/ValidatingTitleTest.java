package Academy;

import java.io.IOException;

import org.apache.logging.log4j.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.NavigationBar;
import resources.base;

public class ValidatingTitleTest extends base{
	public WebDriver driver;
	public static Logger log = LogManager.getLogger(base.class.getName());
	
	
	@BeforeTest

	public void initialize() throws IOException
	{
		driver = initializeDriver();
		log.info("driver is initialized");
		driver.get(prop.getProperty("url"));
		log.info("Successfully landed on HomePage");
		 driver.manage().window().maximize();
	}
	@Test
	public void baseNavPage() throws IOException {
		
		NavigationBar nav= new NavigationBar(driver);
		Assert.assertEquals(nav.NavBar().getText(), "INTERVIEW GUIDE");
		log.info("Successfully Validated Text in the bar");
	}
@AfterTest
	
	public void teardown ()
	{
		driver.close();
		
		
	}	
}
