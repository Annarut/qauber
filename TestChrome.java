package com.example.tests;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestChrome {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "/Users/annaharutyunyan/Downloads/chromedriver");
		ChromeDriver cd = new ChromeDriver();
		cd.get("http://testwave.qabidder.net/#/page/login");
		Thread.sleep(3000);
		WebElement enterEmailTextBox = cd.findElement(By.xpath(".//*[@id='exampleInputEmail1']"));
		enterEmailTextBox.sendKeys("qatester1214@gmail.com");
		WebElement passwordTextBox = cd.findElement(By.xpath(".//*[@id='exampleInputPassword1']"));
		passwordTextBox.sendKeys("123456test");
		Thread.sleep(3000);
		WebElement logInButton = cd.findElement(By.xpath("html/body/div[2]/div/div/div[1]/div[2]/form/button"));
		logInButton.click();
		
		
		Thread.sleep(3000);
		Navigation navigate = cd.navigate();
		navigate.back();
		Thread.sleep(3000);
		navigate.forward();
		Thread.sleep(3000);
		navigate.refresh();
		
		WebElement username = cd.findElement(By.xpath("html/body/div[2]/header/nav/div[2]/ul[2]/li/a/span"));
		Thread.sleep(3000);	
		String text = username.getText();
		System.out.println(text);

	}

}
