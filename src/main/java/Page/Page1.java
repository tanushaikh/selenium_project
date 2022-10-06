package Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;


	import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
	@Test
	public class Page1 {
		
		WebDriver Driver;
		static final String APP_URL = "http://www.lambdatest.com";
	    static final String HOST_URL = "http://http://172.31.40.100/:4444/wd/hub";

	    @BeforeMethod
	    public void setUp()throws InterruptedException
	 {
	        ChromeOptions opt = new ChromeOptions();
	        try {
	            Driver = new RemoteWebDriver(new URL(HOST_URL), opt);
	        } catch (MalformedURLException e) {
	            e.printStackTrace();
	        }

	        Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        Driver.get(APP_URL);
	       
	        
	    
	        
		WebElement allow=Driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div[2]/div/span[1]"));
	        allow.click();
		WebElement a=Driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[1]/div/div/div[1]/div[1]/a"));
		    a.click();
		//WebElement signup=Driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[1]/a[1]/span]"));
		//signup.click();
		
		WebElement FullName=Driver.findElement(By.xpath("//*[@id='name']"));                                              
		FullName.sendKeys("Tanu shaikh");
		Thread.sleep(2000);
		WebElement EmailID=Driver.findElement(By.xpath("//*[@id='email']"));                                      
		EmailID.sendKeys("Faridshaikhjio786@gmail.com");
		Thread.sleep(2000);
		WebElement Password=Driver.findElement(By.xpath("//*[@id='userpassword']"));
	    Password.sendKeys("Tanu@123");
		Thread.sleep(2000);
		WebElement Phone=Driver.findElement(By.xpath("//*[@id='phone']"));
		Phone.sendKeys("8411052428");
		Thread.sleep(2000);
		WebElement Check=Driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/form/div[5]/label/span"));
		Check.click();
		Thread.sleep(2000);
		WebElement SignUp=Driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/form/div[6]/button"));
		SignUp.click();
		Thread.sleep(2000);
		}
		
			
		}
	
		
		
		
	
	
		




