package pageModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeModel extends BaseModel {

	public HomeModel(WebDriver driver) {
		super(driver);
		
	}
	
	public WebElement homeProduct() {
	    
		WebElement product=driver.findElement(By.xpath("//*[@id='l1']"));
		
	       return product;
    }

	public WebElement homeLaptops() {
	    
		WebElement laptop=driver.findElement(By.xpath("//*[@id='l1_1']"));
		
	       return laptop;
    }
	
public WebElement forHomeLaptops() {
	    
		WebElement homelaptop=driver.findElement(By.xpath("//header[@id='dell-masthead']//nav[@role='navigation']/ul[@class='mh-site-nav']/li[1]/ul/li[1]/ul//img[@alt='View all Laptops for Home']"));
		
	       return homelaptop;
    }
	
	
}