package com.example.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FaceBook {
	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		WebElement emailTextBox = driver.findElement(By.id("email"));
		emailTextBox.sendKeys("qatester1214@gmail.com");
		Thread.sleep(2000);
		WebElement passwordTextBox = driver.findElement(By.id("pass"));
		passwordTextBox.sendKeys("123456test");
		Thread.sleep(2000);
		WebElement logInButton = driver.findElement(By.id("loginbutton"));
		logInButton.click();
		WebElement homeLink = driver.findElement(By.id("u_0_5"));
		homeLink.click();
		WebElement postTextBox = driver.findElement(By.className("_3en1 _480e"));
		postTextBox.sendKeys("The people who are crazy enough to think they can change the world are the ones who do");
		WebElement postButton = driver.findElement(By.className("_1mf7 _4jy0 _4jy3 _4jy1 _51sy selected _42ft"));
		postButton.click();
		
	}
}
