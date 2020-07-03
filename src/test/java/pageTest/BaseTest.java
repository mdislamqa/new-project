package pageTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
	 WebDriver driver;
	//String url="https://www.dell.com/en-us";
	//@BeforeSuite
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "/Users/ripam/Downloads/chromedriver");
	    driver=new ChromeDriver();
//		System.setProperty("webdriver.gecko.driver", "/Users/ripam/Downloads/geckodriver");
//	    driver=new FirefoxDriver();
	    driver.get("https://www.dell.com/en-us");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   
	
	}

}
