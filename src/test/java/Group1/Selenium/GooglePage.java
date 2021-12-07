package Group1.Selenium;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GooglePage extends SeleniumConfig {

	By criteria = By.tagName("input");
	By searchBtn = By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[3]/center[1]/input[1]");
	List<WebElement> linkList;
	String link;

	public GooglePage(WebDriver driver) {
		super(driver);

	}

	// Para pasar el criterio al campo Search
	public void setCriteria(String criteriaToSearch) {
		driver.findElement(criteria).sendKeys(criteriaToSearch);

	}

	// Para hacer click en el boton Search
	public void clickSearchButton() {
		driver.findElement(searchBtn).click();
	}

	/*
	 * Para verificar los resultados que coinciden con el criterio
	 */
	public void checkResults(String criteriaToSearch) {
		try {
			List<WebElement> auxlinkList = driver.findElements(By.tagName("a"));
			linkList = new ArrayList<WebElement>();
			for (WebElement webElement : auxlinkList) {
				if (webElement.getAttribute("href") != null
						&& webElement.getText().toLowerCase().contains(criteriaToSearch)) {
					linkList.add(webElement);
				}
			}
			if (linkList.size() > 0) {
				System.out.println("Al menos un elemento coincide");

			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

//Para visitar el primer elemento que coincida con el criterio de búsqueda
	public String visitFirstLink() {
		if (linkList.size() > 0) {
			link = linkList.get(0).getAttribute("href");
			System.out.println(linkList.get(0).getText());
			// System.out.println(link);
			driver.get(link);
		}
		return link.toString();
	}

}
