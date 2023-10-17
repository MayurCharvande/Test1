package ParallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestsClass {
	public static WebDriver driver;
	@Test
	public void restrictionPage_chrome() 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Fxbytes\\eclipse-workspace\\Fxbytes\\src\\main\\resources\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(co);
		driver.navigate().to("https://speaker10.legalops.com/");
		//driver.manage().window().maximize();	  
   }
	@Test
	public void restrictionPage_firefox() 
	{
	 
		  System.setProperty("webdriver.gecko.driver", "C:\\Mozilla Files\\geckodriver-v0.33.0-win64\\geckodriver.exe");
          driver = new FirefoxDriver();
          driver.navigate().to("https://speaker10.legalops.com/"); 
  		//  driver.manage().window().maximize();
	 }
}
