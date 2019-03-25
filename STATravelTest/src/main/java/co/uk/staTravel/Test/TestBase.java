package co.uk.staTravel.Test;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	static String applicationURL = "http://www.statravel.co.uk/tours-worldwide.htm";
	static WebDriver staTravelDriver = null;
	
	//This method is used to initialize the Chrome Browser
	public static void main(){
	//Change the Path to chrome driver in local machine
	File file = new File("C:\\Users\\Kiranmai.adams\\Downloads\\STATravelTest\\WebDrivers\\chromedriver.exe");
	System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
	staTravelDriver = new ChromeDriver();
	staTravelDriver.manage().window().maximize();
	
	}
	
	//This method is used to Launch the aplication
	public void openUrl(){
		staTravelDriver.navigate().to(applicationURL);
	}
	
	//This method is used to close the driver
	public void quitDriver(){
		staTravelDriver.quit();
	}
	
	
}
