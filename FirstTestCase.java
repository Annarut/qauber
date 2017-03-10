package com.example.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/annaharutyunyan/Downloads/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");

		WebElement imageLink = driver.findElement(By.linkText("Images"));
		imageLink.click();
		String url = driver.getCurrentUrl();
		System.out.println(url);
		boolean b = url.contains("google");

		if (b) {
			System.out.println("PASSED");

		} else {
			System.out.println("FAILD");
		}

	}
}
