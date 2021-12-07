package Group1.Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumConfig {
	protected WebDriver driver;
	
	public SeleniumConfig(WebDriver driver) {
		this.driver=driver;
	}
public WebDriver Connection() {
	System.setProperty("webdriver.chrome.driver", "D:\\TOOLS\\Automation\\chromedriver.exe");
	driver = new ChromeDriver();
	return driver;
}

public WebElement findElement(By locator) {
	return driver.findElement(locator);
}

public List<WebElement> findElements(By locator) {
	return driver.findElements(locator);
}

public String getText(WebElement element) {
	return element.getText();
}

public String getText(By locator) {
	return driver.findElement(locator).getText();
}

public void type(String inputText, By locator) {
	driver.findElement(locator).sendKeys(inputText);
}

public void sendKeys(By locator) {
	driver.findElement(locator).click();
}

public boolean isDisplayed(By locator) {
	try {
		return driver.findElement(locator).isDisplayed();
	}catch (org.openqa.selenium.NoSuchElementException e) {
		return false;
	}
}

public void get(String url) {
	driver.get(url);
}



}
