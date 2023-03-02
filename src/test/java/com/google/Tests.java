package com.google;

import com.google.behavior.Actions;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tests {

	@Test
	public void loginTest() {
		
		// Create driver
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		
		Actions.goToPage(driver);
		sleep(2000);
		Actions.acceptCookies(driver);
		sleep(2000);
		Actions.searchBar(driver, "Solera");
		sleep(2000);
		Actions.searchBtn(driver);
		driver.quit();
	}

	private void sleep(long m) {
		// sleep for 3 seconds
		try {
			Thread.sleep(m);
		} catch (InterruptedException e) {
			// TODO Auto-generate catch block
			e.printStackTrace();
		}
	}
}
