package co.uk.staTravel.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

public class ToursImplementation extends TestBase implements Tours{

	String destination = "(//input[@type='text'])[12]";
	
	//This method is used to select Destination from the dropdown populated	
	public void selectDestination(String Country) throws InterruptedException {
		staTravelDriver.findElement(By.xpath(destination)).clear();
		staTravelDriver.findElement(By.xpath(destination)).sendKeys(Country);
		Thread.sleep(3000);
		staTravelDriver.findElement(By.linkText(Country)).click();
	}

	//This method is for Accepting Cookies
	public void acceptCookies() {
		staTravelDriver.findElement(By.id("sta-cookie-save-all-button")).click();
	}

	//This method is to click on Find a Tour Button
	public void submitDestination() {
	   staTravelDriver.findElement(By.xpath("(//button[@type='submit'])[7]")).click();		
	}

	//This method is used to sort the results 
	public void sortOrderOnSearch(String Value) {
		staTravelDriver.findElement(By.id("sortSelect")).sendKeys(Value);		
	}

	//This method is to click on View More button
	public void selectViewMore() {		
		staTravelDriver.findElement(By.id("btnViewMore")).click();
	}

	//This method is used the verify the results count
	public void verifyResultCount() {
		String ResultsLabelDisplayed = staTravelDriver.findElement(By.id("lblTotalSearchResult")).getText();
		int TotalResults = staTravelDriver.findElements(By.xpath("//div[@id='products']/div")).size();
		String value = ResultsLabelDisplayed;
		String intValue = value.replaceAll("[^0-9]", "");
		System.out.println(ResultsLabelDisplayed);
		System.out.println("The value displayed in the Label is: " + intValue);
		System.out.println("The Totatl number of products displayed are: " + TotalResults);
		int valueInLabel = Integer.parseInt(intValue);
		
		if(valueInLabel==TotalResults){			
			System.out.println("Results Match Properly");
		}
		else{
			System.out.println("Results Doesn't Match Properly");
			staTravelDriver.findElement(By.id("NoIDPresent")).click();
		}
	}
	
}

