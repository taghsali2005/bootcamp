package Expedia;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Round {

	public static WebDriver driver;	
	
	@FindBy(xpath="(//*[@class='uitk-fake-input uitk-form-field-trigger'])[1]") WebElement LeavingF;
	

public Round(WebDriver driver) {
	Round.driver=driver;
	PageFactory.initElements(driver, this);
}	
public void FilRound() throws InterruptedException {
	LeavingFrom.click();
	LeavingFrom.sendKeys("Denver (DEN - Denver Intl.)");   
	Thread.sleep(3000);
	Actions ob = new Actions (driver);
	ob.sendKeys(LeavingFrom,Keys.ENTER).perform();
	Thread.sleep(3000);
}



}