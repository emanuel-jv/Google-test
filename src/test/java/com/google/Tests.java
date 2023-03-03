package com.google;

import com.google.behavior.Actions;
import com.google.utils.Utils;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Tests {

	@Test
	public void loginTest() {
		WebDriver driver = Utils.setUp();
		Actions.goToPage(driver);
		Actions.acceptCookies(driver);
		Actions.searchBar(driver, "Solera");
		Actions.searchBtn(driver);
		Utils.tearDown(driver);
	}

}
