package Group1.Selenium;


//import javax.xml.xpath.XPath;

import org.openqa.selenium.WebDriver;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchInGoogle {
	WebDriver driver;
	GooglePage googlePage;
	
	public static void main(String[] args) {}

	public void setup() {
		googlePage = new GooglePage(driver);
		driver = googlePage.Connection();
		googlePage.get("https://google.com");
		}
	
	public void Search() {

		googlePage = new GooglePage(driver);
		googlePage.setCriteria("selenium");
		googlePage.clickSearchButton();
		
	}

}
