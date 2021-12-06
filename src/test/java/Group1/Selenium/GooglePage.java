package Group1.Selenium;

//import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GooglePage extends SeleniumConfig{
	
	
	By criteria = By.tagName("input");
	By searchBtn = By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[3]/center[1]/input[1]");
	By resultList;


	public GooglePage(WebDriver driver) {
		super(driver);
		
		} 
	
	public void setCriteria(String criteriaNew) {
		driver.findElement(criteria).sendKeys(criteriaNew);
		
	}
	
	public void clickSearchButton() {
		driver.findElement(searchBtn).click();

	}
	
	public String checkResults() {
		
		resultList = By.tagName("h3");
		return "";
		
	}
	
	} 		