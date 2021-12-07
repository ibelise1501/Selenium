package Group1.Selenium;
import org.openqa.selenium.WebDriver;

public class FirstElement {
	String link = "";
	
	public FirstElement(WebDriver driver) {
		link = driver.getCurrentUrl().toString();
	}

	public void FirstOpenElement(String linkOpened) {
		if (link.equals(linkOpened)) {
			System.out.println("Las URLs coinciden");
		} else {
			System.out.println("Las URLs NO coinciden");
		}

	}

}
