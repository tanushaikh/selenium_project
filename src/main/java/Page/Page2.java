package Page;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.Test;
	public class Page2 {
		WebDriver Driver;
		@Test
		public void f() throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\HCL\\eclipse-workspace\\selenium4\\Drivers\\chromedriver.exe");
			WebDriver Driver=new ChromeDriver();
			Driver.get("http://www.lambdatest.com");
			System.out.println(Driver.getTitle());
		WebElement allow=Driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div[2]/div/span[1]"));
		allow.click();
		Thread.sleep(2000);
		WebElement a=Driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[1]/div/div/div[1]/div[1]/a"));
		a.click();
		Thread.sleep(2000);
		//WebElement signup=Driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[1]/a[1]/span]"));
		//signup.click();
		
		WebElement FullName=Driver.findElement(By.id("name"));                                              
		FullName.sendKeys("Farid shaikh");
		Thread.sleep(2000);
		WebElement EmailID=Driver.findElement(By.id("email"));                                      
		EmailID.sendKeys("Faridshaikhjio786@gmail.com");
		Thread.sleep(2000);
		WebElement Password=Driver.findElement(By.id("userpassword"));
		Password.sendKeys("Farid@123");
		Thread.sleep(2000);
		WebElement Phone=Driver.findElement(By.id("phone"));
		Phone.sendKeys("9595959595");
		Thread.sleep(2000);
		WebElement Check=Driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/form/div[5]/label/span"));
		Check.click();
		Thread.sleep(2000);
		WebElement SignUp=Driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/form/div[6]/button"));
		SignUp.click();
		Thread.sleep(2000);
	}
		 }

