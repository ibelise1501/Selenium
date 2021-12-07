package Group1.Selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class Test_SearchInGoogle {
	WebDriver driver;
	GooglePage googlePage;
	FirstElement firstElement;
	final String criteriaToSearch = "selenium";

	@Before
	public void setUp() throws Exception {
		googlePage = new GooglePage(driver);
		driver = googlePage.Connection();
		googlePage.get("https://google.com");
		Thread.sleep(2000);
	}

	@After
	public void tearDown() throws Exception {
		 driver.quit();
	}

	@Test
	public void test() {
		googlePage.setCriteria(criteriaToSearch);
		googlePage.clickSearchButton();
		// Thread.sleep(2000);
		googlePage.checkResults(criteriaToSearch);
		String link = googlePage.visitFirstLink();
		firstElement = new FirstElement(driver);
		firstElement.FirstOpenElement(link);
	}

}
