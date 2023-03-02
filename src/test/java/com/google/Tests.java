package com.google;

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


		// maximize browser window
		driver.manage().window().maximize();

		// open page
		String url = "https://www.google.com/";
		driver.get(url);

		// sleep for 3 second
		sleep(2000);
		
		//click on okay cookies
		WebElement acceptCookiesBtn = driver.findElement(By.id("L2AGLb"));
		acceptCookiesBtn.click();
		sleep(2000);
		
		//enter solera on search 
		WebElement searchBar = driver.findElement(By.className("gLFyf"));
		searchBar.sendKeys("Solera");
		sleep(2000);
		
		//click enter
		WebElement searchBtn = driver.findElement(By.className("gNO89b"));
		searchBtn.click();
		sleep(3000);
		
		//Close Driver
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
