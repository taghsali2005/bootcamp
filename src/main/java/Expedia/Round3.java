package Expedia;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Round3 {
	
	
public static WebDriver driver;	
	
	@FindBy(xpath="(//*[@class='uitk-faux-input uitk-form-field-trigger'])[1]") WebElement LeavingDate;
	@FindBy(xpath="//*[@aria-label='Jan 31, 2022 selected, current check in date.']") WebElement DepartureDate;

	public Round3(WebDriver driver) {
		Round3.driver=driver;
		PageFactory.initElements(driver, this);
	}	
public void FilRound3() throws InterruptedException {
	LeavingDate.click();
	
	Thread.sleep(3000);
	Actions ob = new Actions (driver);
	ob.moveToElement(DepartureDate).perform();
	Thread.sleep(3000);
	
	DepartureDate.click();
	
}


public void FilDepartureDte() throws InterruptedException {
	
	Actions ob = new Actions (driver);
	ob.moveToElement(DepartureDate).perform();
	Thread.sleep(3000);
	
	DepartureDate.click();
	
	Thread.sleep(3000);
}

}
