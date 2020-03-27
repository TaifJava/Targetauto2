package allTests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class TestHomePage {

	MasterTest instance = MasterTest.getInstance();

	@Test
	public void validateTitle() {
		instance.getTaxi("Chrome");
		instance.getHomePage().url();
		String title = instance.getHomePage().gettitle();
		System.out.println(title);

		Assert.assertEquals("Target : Expect More. Pay Less.", title);
	}

	@Test
	public void validateSearching() {
		instance.getTaxi("Chrome");
		instance.getHomePage().url();
		instance.getHomePage().searching();
		String result = instance.getHomePage().searchResult();

		System.out.println(result);
	}

	@AfterClass
	public void coolOff() {
		instance.taxi.close();
	}

}
