package resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport {

	   static ExtentReports extent;
	public static ExtentReports getReportObject()
	{
		String path = System.getProperty("user.dir")+"\\reports\\index.html";
		
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setDocumentTitle("Automation Testing");
		reporter.config().setReportName("Syed");
		
		 extent  = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Engineer", "Syed");
		return extent;
		
		
		
	}
}
