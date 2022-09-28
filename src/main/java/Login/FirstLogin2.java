package Login;
import java.sql.Driver;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.Test;

	public class FirstLogin2 {
		WebDriver Driver;
		
		@Test
		public void Signin() throws InterruptedException
		
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\HCL\\eclipse-workspace\\selenium4\\Drivers\\chromedriver.exe");
			WebDriver Driver=new ChromeDriver();
			
			Driver.get("https://accounts.lambdatest.com/login");
			Driver.manage().window().maximize();
			WebElement Email=Driver.findElement(By.xpath("//*[@id='email']"));
			Email.sendKeys("tanushaikh00786@gmail.com");
			Thread.sleep(2000);
			WebElement Password=Driver.findElement(By.xpath("//*[@id='password']"));
			Password.sendKeys("Tanu@123");
			Thread.sleep(2000);
			WebElement Login=Driver.findElement(By.xpath("//*[@id='login-button']"));
			Login.click();
			Thread.sleep(2000);
			
		}
		}

		




