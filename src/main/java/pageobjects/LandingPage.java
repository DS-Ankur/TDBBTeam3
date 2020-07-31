package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	public WebDriver driver;
	
	By USDnotforprofitlink = By.xpath(("(//a[@class='td-rte-font-18 td-link-action'])[14]"));
	By USDUnlimitedBusinessPlanlink = By.xpath(("(//a[@class='td-rte-font-18 td-link-action'])[13]"));
	By USDBasicBusinessPlanlink = By.xpath(("(//a[@class='td-rte-font-18 td-link-action'])[12]"));
	By USDEverydayBusinessPlanClink = By.xpath(("(//a[@class='td-rte-font-18 td-link-action'])[11]"));
	By USDEverydayBusinessPlanBlink = By.xpath(("(//a[@class='td-rte-font-18 td-link-action'])[10]"));
	By popup=By.xpath("//button[text()='NO THANKS']");		
	
    public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	this.driver = driver;
    }

	public WebElement USDnotforprofit_webelement(){
    	return driver.findElement(USDnotforprofitlink);
	}
    public WebElement USDUnlimitedBusinessPlan_webelement(){
        return driver.findElement(USDUnlimitedBusinessPlanlink);
    } 	
    public WebElement USDBasicBusinessPlan_webelement(){
        return driver.findElement(USDBasicBusinessPlanlink);
    }     	
    public WebElement USDEverydayBusinessPlan_webelement(){
        return driver.findElement(USDEverydayBusinessPlanClink);
    }         	
    public WebElement USDEverydayBusinessPlanB_webelement(){
        return driver.findElement(USDEverydayBusinessPlanBlink);
    }
    public int getPopUpSize(){
    	return driver.findElements(popup).size();
    }
    public WebElement getPopUp(){
    	return driver.findElement(popup);
    }

    	
  
	
}
	