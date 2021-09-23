package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.ForgotPassword;
import PageObjects.LandingPage;
import PageObjects.LoginPage;
import resources.base;

public class HomePageTest extends base {
	public WebDriver driver;
	public static Logger log = LogManager.getLogger(base.class.getName());
	
	@BeforeTest

	public void initialize() throws IOException
	{
		driver = initializeDriver();
		
		 driver.manage().window().maximize();
	}
	
	@Test(dataProvider ="getData")
	

	public void baseNavPage(String Username, String Password, String text) throws IOException, InterruptedException {
		driver= initializeDriver();
		driver.get(prop.getProperty("url"));
		log.info("Successfully landed on HomePage");
		 LandingPage l = new LandingPage(driver);
		 LoginPage lp = l.getLogin();
		 lp.userName().sendKeys(Username);
		 lp.userPass().sendKeys(Password);
		ForgotPassword fp =  lp.forgetPass();
	fp.resetPass().sendKeys("hnuodd");
	Thread.sleep(2000);
	fp.SMi().click();

	
	
		

	}


	
	@DataProvider
	
	public Object[][] getData()
	{
		
		Object[][] data = new Object[2][3];
		
		data[0][0] = "InvalidEmail";
		data[0][1]= "Invalid Password";
		data[0][2]= "Inavalid Test";
		
		data[1][0] = "Valid email";
		data[1][1]= "Valid password";
		data[1][2]= "Valid Text";
			
		return data;
	}  
	
@AfterTest
	
	public void teardown()
	{
		driver.close();
		
		
	}	

}
