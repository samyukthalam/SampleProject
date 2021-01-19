package FirstTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseSuiteFile {
	
	public String baseURL="http://www.google.com";
	public WebDriver driver;

	@BeforeTest
	public void b4Test() {
//		System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("useAutomationExtension", false);
		options.addArguments("--disable-extensions");
		driver=new ChromeDriver(options);
	}
	
	
	@Test
	public void googleTitleVerify() {
		driver.get(baseURL);
		Assert.assertEquals("Google", driver.getTitle());
	}
	
	@AfterTest
	public void afterTest() {
		driver.quit();
	}
	
}
