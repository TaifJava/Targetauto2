package allPages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class MasterPage {


	WebDriver taxi;
	public MasterPage(WebDriver taxi) {
		this.taxi=taxi;
		}

	public void getURL(String url) {
		taxi.get(url);
	}


	public void clickElement(String element) {
		taxi.findElement(By.xpath(element)).click();
		
	}

	public void typeElement(String element,String value) {
		taxi.findElement(By.xpath(element)).sendKeys(value,Keys.ENTER);
	}


	public String getText (String element) {
		return taxi.findElement(By.xpath(element)).getText();
	}
	





}
