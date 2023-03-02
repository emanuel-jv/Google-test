package com.google.behavior;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Actions {
	
	public static void goToPage(WebDriver driver) {
		driver.manage().window().maximize();
		String url = "https://www.google.com/";
		driver.get(url);
	}
	
	public static void acceptCookies(WebDriver driver) {
		WebElement acceptCookiesBtn = driver.findElement(By.id("L2AGLb"));
		acceptCookiesBtn.click();
	}
	
	public static void searchBar (WebDriver driver, String item) {
		WebElement searchBar = driver.findElement(By.className("gLFyf"));
		searchBar.sendKeys(item);
	}
	
	public static void searchBtn (WebDriver driver) {
		WebElement searchBtn = driver.findElement(By.className("gNO89b"));
		searchBtn.click();
	}
	

}
