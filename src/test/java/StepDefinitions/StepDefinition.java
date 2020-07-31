package StepDefinitions;

import org.junit.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.LandingPage;
import pageobjects.USDnotforprofitPage;
import resources.base;

public class StepDefinition extends base {
	
	@Given("^Initialize the browser with chrome$")
	public void initialize_the_browser_with_chrome() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver = initializeDriver();
	}

	@Given("^Navigate to \"([^\"]*)\"$")
	public void navigate_to(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.get(arg1);
	}

	@When("^USD not for profit product page is populated$")
	public void usd_not_for_profit_product_page_is_populated() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		LandingPage l = new LandingPage(driver);
		l.USDnotforprofit_webelement().click();
	}

	@Then("^Product page is validated$")
	public void product_page_is_validated() throws Throwable {
		USDnotforprofitPage UP = new USDnotforprofitPage(driver);
				
		
		Assert.assertEquals(UP.MonthCommunityPlanFee().getAttribute("innerText").trim(),"$1.95");
		Assert.assertEquals(UP.MonthCommunityPlusPlanFee().getAttribute("innerText").trim(),"$4.95");
		Assert.assertEquals(UP.MonthAdditionalActPlanFee().getAttribute("innerText").trim(),"N/A");
		Assert.assertEquals(UP.RebateCommunityPlanFee().getAttribute("innerText").trim(),"$5,000");
		Assert.assertEquals(UP.RebateCommunityPlusPlanFee().getAttribute("innerText").trim(),"$10,000");
		Assert.assertEquals(UP.RebateAdditionalActPlanFee().getAttribute("innerText").trim(),"N/A");
	}

	@And("^Close browsers$")
	public void close_browsers() throws Throwable {
	  driver.close();  
		
	}
}

