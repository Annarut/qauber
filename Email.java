package com.example.tests;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Email{
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "/Users/annaharutyunyan/Downloads/chromedriver");
		ChromeDriver cd = new ChromeDriver();
		cd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		cd.get("http://www.gmail.com");
		Thread.sleep(3000);
		WebElement emailTextBox = cd.findElement(By.id("Email"));
		emailTextBox.sendKeys("qatester1214@gmail.com");
		Thread.sleep(3000);
		WebElement nextButton = cd.findElement(By.id("next"));
		nextButton.click();
		Thread.sleep(3000);
		WebElement passwordTextBox = cd.findElement(By.id("Passwd"));
		passwordTextBox.sendKeys("123456test");
		Thread.sleep(3000);
		WebElement signInButton = cd.findElement(By. id("signIn"));
		signInButton.click();
		WebElement composeButton = cd.findElement(By.xpath(".//div[text()='COMPOSE']"));
		composeButton.click();
		WebElement toTextBox = cd.findElement(By.className("vO"));
		toTextBox.sendKeys("yagna.bitspilani@gmail.com");
		Thread.sleep(3000);
		WebElement subjectTextBox = cd.findElement(By.className("aoT"));
		subjectTextBox.sendKeys("This is Automated mail");
		Thread.sleep(3000);
		WebElement sendButton = cd.findElement(By.xpath("//div[text()='Send']"));
		sendButton.click();
		
		
}
}
