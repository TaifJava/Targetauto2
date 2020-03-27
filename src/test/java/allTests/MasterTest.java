package allTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import allPages.HomePage;

public class MasterTest {

	private static MasterTest instance;

	WebDriver taxi;
	HomePage fromHomeMHP;
	
	private MasterTest() {

	}

	public WebDriver getTaxi(String driverValue) {
		if (taxi == null) {
			if (driverValue.contains("Chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"/Users/MdSiY/eclipse-workspace/com.Targetauto2/Browser/chromedriver");
				taxi = new ChromeDriver();
			} else if (driverValue.contains("firefox")) {
				System.setProperty("webdriver.gecko.driver", "/Users/MdSiY/eclipse-workspace/com.Targetauto2/Browser/geckodriver");
				taxi = new FirefoxDriver();
			}
		}

		return taxi;
	}

	
	public static MasterTest getInstance() {
		if (instance == null) {
			instance = new MasterTest();
		}
		return instance;
	}

	public  HomePage getHomePage() {
		if (fromHomeMHP == null) {
			fromHomeMHP = new HomePage(taxi);
		}
		return fromHomeMHP;
	}

}
