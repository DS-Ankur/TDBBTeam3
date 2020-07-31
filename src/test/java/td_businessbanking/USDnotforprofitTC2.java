package td_businessbanking;

import java.io.IOException;

import org.apache.http.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageobjects.LandingPage;
import pageobjects.USDnotforprofitPage;
import resources.base;

public class USDnotforprofitTC2 extends base{
	public WebDriver driver;
	@Test
	
	public void USDnotforProfitNavigation2() throws IOException
	{
		
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
	
		//2 ways to access methods pf other call
		//1 . create object to that class
		//2. inheritance (extends method)
		
		LandingPage l = new LandingPage(driver);// to pass this argument to landing page, we need to use constructor in landing page
		
		l.USDnotforprofit_webelement().click(); // similar to findelement by (xpath....)
		USDnotforprofitPage UP = new USDnotforprofitPage(driver);
		
		
		Assert.assertEquals(UP.MonthCommunityPlanFee().getAttribute("innerText").trim(),"$1.9");
		Assert.assertEquals(UP.MonthCommunityPlusPlanFee().getAttribute("innerText").trim(),"$4.95");
		Assert.assertEquals(UP.MonthAdditionalActPlanFee().getAttribute("innerText").trim(),"N/A");
		Assert.assertEquals(UP.RebateCommunityPlanFee().getAttribute("innerText").trim(),"$5,000");
		Assert.assertEquals(UP.RebateCommunityPlusPlanFee().getAttribute("innerText").trim(),"$10,000");
		Assert.assertEquals(UP.RebateAdditionalActPlanFee().getAttribute("innerText").trim(),"N/A");
	}
	}


