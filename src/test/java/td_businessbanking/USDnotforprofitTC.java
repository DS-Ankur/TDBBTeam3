package td_businessbanking;

import java.io.IOException;

import org.apache.http.util.Asserts;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageobjects.LandingPage;
import pageobjects.USDnotforprofitPage;
import resources.base;

public class USDnotforprofitTC extends base{

	@Test
	
	public void USDnotforProfitNavigation() throws IOException
	{
		
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
		
		//2 ways to access methods pf other call
		//1 . create object to that class
		//2. inheritance (extends method)
		
		LandingPage l = new LandingPage(driver);// to pass this argument to landing page, we need to use constructor in landing page
		l.USDnotforprofit_webelement().click(); // similar to findelement by (xpath....)
		USDnotforprofitPage UP = new USDnotforprofitPage(driver);
		
		
		//Assert.assertEquals(UP.MonthCommunityPlanFee().getText(),$1.95);
		
		
		
	}
	}


