package ExpediaTest;

import org.testng.annotations.Test;

import Expedia.Round;
import Expedia.Round2;
import Expedia.Round3;
import Expedia.flights;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class Expediatest {
	public static WebDriver driver;	
	 @BeforeTest
	  public void beforeTest() throws InterruptedException {
			
		 
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\taghs\\eclipse-workspace\\traingtwo\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.expedia.com");
			//driver.manage().window().maximize();
		Thread.sleep(5000);
		 
		 
	  }
	@Test(priority=1)
public void Flights() {
		 WebElement ClickOnFlights=driver.findElement(By.xpath("(//*[@class='uitk-tab-text'])[2]"));
		 ClickOnFlights.click();
		
	}
	@Test(priority=2)
  public void StartPlace() throws InterruptedException {
		 WebElement LeavingFrom=driver.findElement(By.xpath("(//*[@class='uitk-fake-input uitk-form-field-trigger'])[1]"));
		 LeavingFrom.click();
		 LeavingFrom.sendKeys("Denver (DEN - Denver Intl.)");   
			Thread.sleep(3000);
			Actions ob = new Actions (driver);
			ob.sendKeys(LeavingFrom,Keys.ENTER).perform();
			Thread.sleep(3000);
	Thread.sleep(5000);	
		
  }
	

	@Test(priority=3)	
	
	public void EndPlace() throws InterruptedException {
		 WebElement GoingTo=driver.findElement(By.xpath("(//*[@class='uitk-fake-input uitk-form-field-trigger'])[2]"));
		 GoingTo.click();
		 GoingTo.sendKeys("Fort Lauderdale (FLL - Fort Lauderdale-Hollywood Intl.)");   
			Thread.sleep(3000);
			Actions ob = new Actions (driver);
			ob.sendKeys(GoingTo,Keys.ENTER).perform();
			Thread.sleep(3000);	
	}	
	
	
@Test(priority=4)	
	
	public void Departing() throws InterruptedException {
	 WebElement LeavingDate=driver.findElement(By.xpath("(//*[@class='uitk-faux-input uitk-form-field-trigger'])[1]"));
	 LeavingDate.click();
		Thread.sleep(3000);
		
		WebElement Next=driver.findElement(By.xpath("(//*[@class='uitk-button uitk-button-medium uitk-button-only-icon uitk-flex-item uitk-button-paging'])[2]"));
		Next.click();
}
@Test(priority=5)
public void GoingDate() throws InterruptedException {

		 WebElement CheckIN=driver.findElement(By.xpath("//*[@aria-label='Mar 10, 2022']"));	
		 Actions ob= new Actions(driver);
		ob.moveToElement(CheckIN).perform();
		 
		 CheckIN.click();
		 Thread.sleep(5000);
		 
	}	
@Test(priority=6)
	public void Donebutton() throws InterruptedException {
	 WebElement Donebutton=driver.findElement(By.xpath("//*[@data-stid='apply-date-picker']"));
	 
	 Donebutton.click();
	 Thread.sleep(5000);
	}


@Test(priority=7)

public void Returning() throws InterruptedException {

	 WebElement Leaving=driver.findElement(By.xpath("(//*[@data-stid='open-date-picker'])[2]"));	
	 Actions ob= new Actions(driver);
	ob.moveToElement(Leaving).perform();
	 
	Leaving.click();
	 Thread.sleep(5000);
	 
}


@Test(priority=8)
public void ComimgBackDate() throws InterruptedException {

		 WebElement LeavingDate=driver.findElement(By.xpath("//*[@aria-label='Mar 31, 2022']"));	
		 Actions ob= new Actions(driver);
		ob.moveToElement(LeavingDate).perform();
		 
		LeavingDate.click();
		 Thread.sleep(5000);
		 
	}	

@Test(priority=9)
public void Donebutton2() throws InterruptedException {
 WebElement Donebutton=driver.findElement(By.xpath("//*[@data-stid='apply-date-picker']"));
 
 Donebutton.click();
 Thread.sleep(5000);
}


@Test(priority=10)
public void SearchButton() throws InterruptedException {
 WebElement Donebutton=driver.findElement(By.xpath("//*[@data-testid='submit-button']"));
 
 Donebutton.click();
 Thread.sleep(5000);
}
// manual testing click on verify then select what ever needed


  @AfterTest
  public void afterTest() {
  }

}

