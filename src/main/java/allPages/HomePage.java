package allPages;

import org.openqa.selenium.WebDriver;

public class HomePage extends MasterPage{

	
	String searchBar="//input[@id='search']";
	String resulttosearch= "spam[text()='computer']";
	public HomePage(WebDriver taxi) {
		super(taxi);
		// TODO Auto-generated constructor stub
	}

	public void url() {
	getURL("http://www.target.com");//("http://www.target.com");
	}

	public String gettitle() {
		return taxi.getTitle();
	}

	public void searching() {
		typeElement(searchBar, "computers");
	}

	public String searchResult() {
		return getText(resulttosearch);
	
	}


}

