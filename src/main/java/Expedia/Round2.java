package Expedia;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Round2 {
	
	public static WebDriver driver;	
	
	
	@FindBy(xpath="(//*[@class='uitk-fake-input uitk-form-field-trigger'])[2]") WebElement GoingTo;

	

public Round2(WebDriver driver) {
	Round2.driver=driver;
	PageFactory.initElements(driver, this);
}	
	

public void FilRound2() throws InterruptedException {
	GoingTo.click();
	GoingTo.sendKeys("Fort Lauderdale (FLL - Fort Lauderdale-Hollywood Intl.)");   
	Thread.sleep(3000);
	Actions ob = new Actions (driver);
	ob.sendKeys(GoingTo,Keys.ENTER).perform();
	Thread.sleep(3000);
}


}
