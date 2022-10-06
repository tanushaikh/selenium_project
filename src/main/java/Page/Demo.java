package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Demo {

    WebDriver driver;
    public void beforeMethod() {
    	
    	
    final String APP_URL = "http://www.lambdatest.com";
    final String HOST_URL = "http://3.85.20.254:4444/wd/hub";

    
    	driver = new ChromeDriver();
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	driver.get("http://www.lambdatest.com");

    	}

		/*
		 * @BeforeMethod public void setUp(){ ChromeOptions opt = new ChromeOptions();
		 * try { driver = new RemoteWebDriver(new URL(HOST_URL), opt); } catch
		 * (MalformedURLException e) { e.printStackTrace(); }
		 * 
		 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 * driver.get(APP_URL); }
		 */
    

    @AfterMethod
    public void tearDown(){
    
        if(driver != null) {
            driver.quit();
        }
    }
}