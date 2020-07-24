package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UnlimitedBP {

	public WebDriver driver;
	
	String Mfee= "$125 U.S.";
	String Monthlybal = "$65,000 U.S.";
	String PerMonthTrans = "Unlimited";
	String Monthlydepitems= "Unlimited";
		
	public UnlimitedBP(WebDriver driver) {
		this.driver = driver;
	}
	
	By Monthlyfee = By.xpath(("(//span[@class='td-product-feature-text'])[1]"));
	By MMBal = By.xpath(("(//span[@class='td-product-feature-text'])[2]"));
	By Transpermon = By.xpath(("(//span[@class='td-product-feature-text'])[3]"));
	By Depitemspermon = By.xpath(("(//span[@class='td-product-feature-text'])[4]"));
	
	public WebElement MonthPlanFee()
		{
    		return driver.findElement(Monthlyfee);
		}
	
	public WebElement MinMonBal()
		{
    		return driver.findElement(MMBal);
		}

	public WebElement MonthlyTrans()
		{
    		return driver.findElement(Transpermon);
		}
    
	public WebElement Depitemsmonthly()
    	{
        	return driver.findElement(Depitemspermon);
    	}
	
}
