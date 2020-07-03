package pageTest;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageObject.HomePage;

public class HomePageTest extends BaseTest{

	
	
	HomePage homePageTest;
	
	@Test  //(threadPoolSize = 3,invocationCount = 3) for test in multibrowser
	public void homePage_Test() {
		homePageTest= new HomePage(driver);
		homePageTest.productPage();
		homePageTest.laptopPage();
		homePageTest.forHome_laptopPage();
	}

}
