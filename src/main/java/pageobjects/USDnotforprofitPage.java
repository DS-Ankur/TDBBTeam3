package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class USDnotforprofitPage {
public WebDriver driver;
	
	
	
	By MonthCommunityPlanFeeclick = By.xpath(("(//div[@class='rte'])[5]"));
	By MonthCommunityPlusPlanFeeclick = By.xpath(("(//div[@class='rte'])[16]"));
	By MonthAdditionalActPlanFeeclick = By.xpath(("(//div[@class='rte'])[35]"));
	
    public USDnotforprofitPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	this.driver = driver;
    }

	     	
    	
    
	public WebElement MonthCommunityPlanFee(){
    	return driver.findElement(MonthCommunityPlanFeeclick);
	
	}
	
	public WebElement MonthCommunityPlusPlanFee(){
    	return driver.findElement(MonthCommunityPlusPlanFeeclick);
	
	}
	public WebElement MonthAdditionalActPlanFee(){
    	return driver.findElement(MonthAdditionalActPlanFeeclick);
	
	}
	
	
}