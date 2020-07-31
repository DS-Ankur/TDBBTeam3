package td_businessbanking;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import resources.Extentreportertestng;
import resources.base;

public class Listeners extends base implements ITestListener{
	ExtentTest test;
	ExtentReports extent=Extentreportertestng.getReporterObject();
	ThreadLocal<ExtentTest> extentTest =new ThreadLocal<ExtentTest>();	
	
	
//ExtentReports extent = Extentreportertestng.getReporterObject();
//ExtentTest test;
//ThreadLocal<ExtentTest> extentTest = new ThreadLocal<ExtentTest>(); 
//for parallel test execution and reporting for corresponding test case
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		 //test = extent.createTest(result.getMethod().getMethodName());//create unique object of testcase with 
		 //all properties captured in extent object for that test case---learn it
		 //dynamic test case name instead if "initial demo" test case which was specific by using 
		 //result.getMethod().getMethodName()
		// extentTest.set(test); ///extentTest object of threadlocal class is linked to test object
		 
		 test= extent.createTest(result.getMethod().getMethodName());
			extentTest.set(test);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		extentTest.get().log(Status.PASS, "Test Passed");
		//extentTest.get().log(Status.PASS,"Test Passed"); //Replace test with extentTest.get()
		///to report test pass test status in logs
	}

	@Override
	public void onTestFailure(ITestResult result) {
		extentTest.get().fail(result.getThrowable());
		//extentTest.get().fail(result.getThrowable());
		//extentTest.get().fail(result.getThrowable());//replace Test.fail.(result.getThrowable());
		//to get log from ITestresult for failed test
		WebDriver driver = null;
		// TODO Auto-generated method stub
		String testnamemethod = result.getMethod().getMethodName();
		try {
			//extentTest.get().addScreenCaptureFromPath(getScreenShotPath(result.getMethod().getMethodName(),driver), result.getMethod().getMethodName());
			extentTest.get().addScreenCaptureFromPath(getScreenShotPath(testnamemethod,driver),result.getMethod().getMethodName());
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			driver =(WebDriver)result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
		} catch (Exception e) {
			// TODO Auto-generated catch block
					} 
		
		
		}
	   
	
	
		
		
	
		
	

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		extent.flush();
		
	}

}
