package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base {

	
public WebDriver driver;
public Properties prop;

		public WebDriver initializeDriver() throws IOException
		{ 
			prop = new Properties();
			
			FileInputStream fis = new FileInputStream("C:/Users/Rana/Desktop/Test Automation/Workstation/TDBBteam3/src/main/java/resources/data.properties");
			
			prop.load(fis);
			
			String  browsername = prop.getProperty("browser");
			
			if(browsername.equalsIgnoreCase("chrome"))
			{
				System.setProperty("webdriver.chrome.driver","C:/Program Files/chromedriver.exe");// put drivers inside resources 
				 driver = new ChromeDriver();
			}
			else if(browsername.equalsIgnoreCase("firefox") )
			{
				System.setProperty("webdriver.chrome.driver","C:/Program Files/geckodriver.exe");
				 driver = new FirefoxDriver();
			}
			else if(browsername.equalsIgnoreCase("IE"))
			{
				//IE driver info
			}
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		
	
		
		}
		public String getScreenShotPath(String testCaseName,WebDriver driver)
		{
			TakesScreenshot ts=(TakesScreenshot) driver;
			File source =ts.getScreenshotAs(OutputType.FILE);
			String destinationFile = System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";
			try {
				FileUtils.copyFile(source,new File(destinationFile));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.print(destinationFile);
			return destinationFile;
			
		//Explanied in downupclass in selenium project
		//http://makeseleniumeasy.com/2017/04/02/hierarchy-of-selenium-classes-and-interfaces/
		//http://makeseleniumeasy.com/2017/08/27/taking-screenshot-using-takesscreenshot-interface-in-selenium/
		
		}
		
		
		}
	
///base page gives us driver and we have established implicit wait

//landing page gives us all the webElemsnts


//Products page here is the test page of home page 
