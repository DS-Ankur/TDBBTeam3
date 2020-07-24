package td_businessbanking;

import java.io.IOException;

import org.testng.annotations.Test;

import junit.framework.Assert;
import pageobjects.LandingPage;
import pageobjects.UnlimitedBP;
import resources.base;


public class UnlimitedUSDBBTC extends base {
	String Mfee= "$125 U.S.";
	String Monthlybal = "$65,000 U.S.";
	String PerMonthTrans = "Unlimited";
	String Monthlydepitems= "Unlimited";
	
	
	@Test
		
public void BusinessBankingUSD() throws IOException {
	
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
		
		LandingPage LP= new LandingPage(driver);
		LP.USDUnlimitedBusinessPlan_webelement().click();
		UnlimitedBP UBP = new UnlimitedBP(driver);
		
		System.out.println(UBP.MonthPlanFee().getText());
		System.out.println(UBP.MinMonBal().getText());
		System.out.println(UBP.MonthlyTrans().getText());
		System.out.println(UBP.Depitemsmonthly().getText());
						
	Assert.assertEquals(Mfee, UBP.MonthPlanFee().getText());
	Assert.assertEquals(Monthlybal, UBP.MinMonBal().getText());
	Assert.assertEquals(PerMonthTrans, UBP.MonthlyTrans().getText());
	Assert.assertEquals(Monthlydepitems, UBP.Depitemsmonthly().getText());
}
}
