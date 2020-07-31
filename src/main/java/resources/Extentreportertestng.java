package resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public class Extentreportertestng {

	static ExtentReports extent; /// variables inside static method have to be static
	
	
	public static ExtentReports getReporterObject()
	{
		String path =System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path); //its used to create reporter object
		reporter.config().setReportName("Web Automation Results"); //Name of the report
		reporter.config().setDocumentTitle("Test Results"); //Name of document or title of page 
		
		extent =new ExtentReports();
		extent.attachReporter(reporter); //to pass reporter object of ExtentSparkReporter class to ExtentReports
		extent.setSystemInfo("Tester", "Ankur Rana"); //to pass tester name 
		return extent;


	}
	
}
