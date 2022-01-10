package Expedia;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class flights {
	public static WebDriver driver;	
	
	
	@FindBy(xpath="(//*[@class='uitk-tab-text'])[2]") WebElement Vol ;
	
	
	public flights(WebDriver driver) {
		flights.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void ClickOnFlights() {
		Vol.click();
}
}