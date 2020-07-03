package pageObject;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import pageModel.HomeModel;

public class HomePage extends HomeModel {

	public HomePage(WebDriver driver) {
		super(driver);
		
	}
	Actions action = new Actions(driver);
	public void productPage() {
		
		WebElement productPage=homeProduct();
		action.moveToElement(productPage).perform();
		
	}
	
	public void laptopPage() {
		WebElement laptop_page=homeLaptops();
		action.moveToElement(laptop_page).perform();
	}
	
	public void forHome_laptopPage() {
		WebElement laptopForHome=forHomeLaptops();
		action.moveToElement(laptopForHome).click().perform();
	}

}
