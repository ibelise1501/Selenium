package Group1.Selenium;
import org.openqa.selenium.WebDriver;

public class FirstElement extends SeleniumConfig {
	//String link = "";
	
	public FirstElement(WebDriver driver) {
		super(driver);
	}
	
	public String CurrentURL() {
		return getCurrentURL().toString();
	}

	public void FirstOpenElement(String linkOpened) {
		if (CurrentURL().equals(linkOpened)) {
			System.out.println("Las URLs coinciden");
		} else {
			System.out.println("Las URLs NO coinciden");
		}

	}

}
