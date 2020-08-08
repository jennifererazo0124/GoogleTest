package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResultsPage {
	
	WebDriver driver = null;
	By settingsLinkLocator = By.linkText("Settings");
	
	public ResultsPage (WebDriver driver) {
		this.driver = driver;
	}
	
	public boolean searchSettingsLink() {
		return driver.findElement(settingsLinkLocator).isDisplayed();
	}
}
