package com.example.tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "/Users/annaharutyunyan/Downloads/chromedriver");
	ChromeDriver driver = new ChromeDriver();
		driver.get("http://testwave.qabidder.net/#/page/register-sa");
		String title = driver.getTitle();
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		Thread.sleep(2000);
		WebElement nameTextBox = driver.findElement(By.xpath("html/body/div[2]/div/div/div[1]/div/div[2]/form/div[1]/input"));
		nameTextBox.sendKeys("Anna");
		Thread.sleep(2000);
		WebElement emailTextBox = driver.findElement(By.xpath("html/body/div[2]/div/div/div[1]/div/div[2]/form/div[2]/input"));
		emailTextBox.sendKeys("qatest.er1214@mailinator.com");
		Thread.sleep(2000);
		WebElement passwordTextBox = driver.findElement(By.xpath(".//*[@id='id-password']"));	
        passwordTextBox.sendKeys("123456test");
        Thread.sleep(2000);
        WebElement retypePasswordTextBox = driver.findElement(By.xpath("html/body/div[2]/div/div/div[1]/div/div[2]/form/div[4]/input"));
        retypePasswordTextBox.sendKeys("123456test");
        Thread.sleep(2000);
        WebElement continueRegistrationButton = driver.findElement(By.xpath("html/body/div[2]/div/div/div[1]/div/div[2]/form/button"));
        continueRegistrationButton.click();
        Thread.sleep(2000);
        WebElement signInButton = driver.findElement(By.xpath("html/body/div[2]/div/div/div[1]/div/div[2]/a"));
        signInButton.click();
        
	}
}
