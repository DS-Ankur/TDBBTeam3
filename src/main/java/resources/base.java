 package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base {

	
public WebDriver driver;
public Properties prop;

		public WebDriver initializeDriver() throws IOException
		{ 
			prop = new Properties();
			
			FileInputStream fis = new FileInputStream("C:\\Users\\reshm\\eclipse-workspace\\TDBBTeam3\\src\\main\\java\\resources\\data.properties");
			
			prop.load(fis);
			
			String  browsername = prop.getProperty("browser");
			
			if(browsername.equalsIgnoreCase("chrome"))
			{
				System.setProperty("webdriver.chrome.driver","C:\\Drivers\\ChromeWebDriver\\chromedriver.exe");
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
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		
		}
		
		
		
		
		
		}
	
///base page gives us driver and we have established implicit wait

//landing page gives us all the webElemsnts


//Products page here is the test page of home page 
