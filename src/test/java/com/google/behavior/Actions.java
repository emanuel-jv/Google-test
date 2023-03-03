package com.google.behavior;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.utils.LoadProperties;

public class Actions {
	
	private static Properties properties = LoadProperties.getProperties();
	
	public static void goToPage(WebDriver driver) {
		driver.manage().window().maximize();
		String url = properties.getProperty("googleUrl");
		driver.get(url);
	}
	
	public static void acceptCookies(WebDriver driver) {
		String idBtn = properties.getProperty("AcceptCookiesBtnId");
		WebElement acceptCookiesBtn = driver.findElement(By.id(idBtn));
		acceptCookiesBtn.click();
	}
	
	public static void searchBar (WebDriver driver, String item) {
		String searchClass = properties.getProperty("searchClassName");
		WebElement searchBar = driver.findElement(By.className(searchClass));
		searchBar.sendKeys(item);
	}
	
	public static void searchBtn (WebDriver driver) {
		String searchBtnClass = properties.getProperty("searchBtnClassName");
		new WebDriverWait(driver, Duration.ofSeconds(2)).until(ExpectedConditions.elementToBeClickable(By.className(searchBtnClass)));
		WebElement searchBtn = driver.findElement(By.className(searchBtnClass));
		searchBtn.click();
	}
	

}
