package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {

public WebDriver driver;
public Properties prop;



	public WebDriver initializeDriver() throws IOException

	{

	 prop = new Properties();
	
		
		FileInputStream fil = new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\E2EProjectJava\\src\\main\\java\\resources\\data.properties");
		
		
		prop.load(fil);

		String browserName = prop.getProperty("browser");
		System.out.println(browserName);
		
		if (browserName.equals("chrome"))
				{
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\hp\\eclipse-workspace\\E2EProjectJava\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();

		}

		else if (browserName.equals("firefox"))
				{

			// Execute this one

		}

		else if (browserName.equals("IE"))
		{

			// Execute this one/

		}
		return driver;
	}
	
	public String getScreenshotPath(String testCaseName, WebDriver driver) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String destinationPath = System.getProperty("user.dir")+"//screenshot//"+testCaseName+".png";
		FileUtils.copyFile(source, new File(destinationPath));
		return destinationPath;
		
	}
	
	
	}
		
		
		
		
	



