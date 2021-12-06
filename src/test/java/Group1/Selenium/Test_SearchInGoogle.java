package Group1.Selenium;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class Test_SearchInGoogle {
	WebDriver driver;
	GooglePage googlePage;
	
	@Before
	public void setUp() throws Exception {
		googlePage = new GooglePage(driver);
		driver = googlePage.Connection();
		googlePage.get("https://google.com");
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	public void test() {
		googlePage.setCriteria("selenium");
		googlePage.clickSearchButton();
		googlePage.checkResults();
	}

}
