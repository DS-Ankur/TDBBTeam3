package td_businessbanking;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import pageobjects.LandingPage;
import pageobjects.USDnotforprofitPage;
import resources.base;

public class USDnotforprofitTC extends base{
	public WebDriver driver;
	
	@BeforeTest
	public void initialize() throws IOException
	{
		
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
	// driver value is taken as a return from base.initializeDriver() and then passed on as a constructor to object page 
		//like landing or TC object page to fetch the elements 
		// basically driver will connect TC page with base page first and then with object page to pass it on using construction
		//2 ways to access methods pf other call
		//1 . create object to that class --has IS
		//2. inheritance (extends method) --is IS
		
	}
	
	@Test
	public void USDnotforProfitNavigation() throws IOException
	{
		
		
		
		LandingPage l = new LandingPage(driver);
		//LandingPage l = new LandingPage(driver);// to pass this argument to landing page, we need to use 
		//constructor in landing page
		if(l.getPopUpSize()>0)
		{
			l.getPopUp().click();
		}

		l.USDnotforprofit_webelement().click(); // similar to findelement by (xpath....)
		USDnotforprofitPage UP = new USDnotforprofitPage(driver);
	
		
		
		Assert.assertEquals(UP.MonthCommunityPlanFee().getAttribute("innerText").trim(),"$1.95");
		Assert.assertEquals(UP.MonthCommunityPlusPlanFee().getAttribute("innerText").trim(),"$4.95");
		Assert.assertEquals(UP.MonthAdditionalActPlanFee().getAttribute("innerText").trim(),"N/A");
		Assert.assertEquals(UP.RebateCommunityPlanFee().getAttribute("innerText").trim(),"$5,000");
		Assert.assertEquals(UP.RebateCommunityPlusPlanFee().getAttribute("innerText").trim(),"$10,000");
		Assert.assertEquals(UP.RebateAdditionalActPlanFee().getAttribute("innerText").trim(),"N/A");
	}
	@AfterTest
	public void teardown()
	{
		
		driver.close();
	}
	}


