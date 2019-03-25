package co.uk.staTravel.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;



public class HomeImplementation extends TestBase implements Home{

	public void HomePageAssertions() {
	    
		//Verifying if Tag line is displayed
		WebElement Tagline= staTravelDriver.findElement(By.id("tagline"));
		
		//Assert.assertTrue("The Tag line text is verfied",Tagline.isDisplayed());
		
		//Verifying if the Logo is displayed
		WebElement Logo= staTravelDriver.findElement(By.id("logo"));
	//	Assert.assertTrue("The Tag line text is verfied",Logo.isDisplayed());
		
		//Verifying if Telephone number is displayed
		WebElement TelephoneNumber= staTravelDriver.findElement(By.id("call_us_on_no"));
		//assertTrue("The Telephone number is verfied",TelephoneNumber.getText().equals("0333 321 0099*"));	
		
		//Verifying if Flights tab is present in Home Page	
		WebElement FlightsTab= staTravelDriver.findElement(By.xpath("(//a[contains(text(),'flights')])[4]"));
	//	assertTrue("The Flights tab presence in Home Page is verified",FlightsTab.isDisplayed());
		
		//Verifying if Hotels tab is present in Home Page
		WebElement HotelsTab= staTravelDriver.findElement(By.xpath("//a[contains(text(),'hotels')]"));
		//assertTrue("The Hotels tab presence in Home Page is verified",HotelsTab.isDisplayed());
		
		//Verifying if Tours tab is present in Home Page
		WebElement ToursTab= staTravelDriver.findElement(By.xpath("(//a[contains(text(),'tours')])[5]"));
		//assertTrue("The Tours tab presence in Home Page is verified",ToursTab.isDisplayed());
		
		//Verifying if Insurance tab is present in Home Page
		WebElement InsuranceTab= staTravelDriver.findElement(By.xpath("(//a[contains(text(),'insurance')])[7]"));
		//assertTrue("The Insuranc tab presence in Home Page is verified",InsuranceTab.isDisplayed());
		
	}

	@Override
	public void Test() {
		// TODO Auto-generated method stub
		
	}

	
	
}
