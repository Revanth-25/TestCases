package base;


import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseTest {

	   public static ChromeOptions opt = new ChromeOptions();
	   public static WebDriver driver;
	   public static Properties prop = new Properties();
	   public static FileReader fr;
	    @BeforeTest
       public void setUp() throws IOException {

	                opt.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true); 
	       
    			WebDriverManager.chromedriver().setup();  //base
    			driver = new ChromeDriver(opt); 
    			driver.get("https://localhost:44340/Orders/Create");
    	   
       }
	    @AfterTest
	       public void tearDown() {
	    	   driver.close();
	    	
	       }
}
