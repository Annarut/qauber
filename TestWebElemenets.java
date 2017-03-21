package com.example.tests;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestWebElemenets {
	public static void main(String[] args) throws InterruptedException {

		// Create WebDriver Object
		System.setProperty("webdriver.chrome.driver", "/Users/annaharutyunyan/Downloads/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		// Go to Login Page of TestWave
		driver.get("http://testwave.qabidder.net/#/page/login");

		// Login into TestWave
		WebElement usernameTextBox = driver.findElement(By.id("exampleInputEmail1"));
		usernameTextBox.sendKeys("qauber.sa1@mailinator.com");
		WebElement passwordTextBox = driver.findElement(By.id("exampleInputPassword1"));
		passwordTextBox.sendKeys("123456");
		Thread.sleep(3000);
		WebElement loginButton = driver.findElement(By.tagName("button"));
		loginButton.click();

		// Wait for next page to appear and Click on "Add Report"
		Thread.sleep(3000);
		WebElement reports = driver.findElement(By.linkText("Add Report"));
		reports.click();

		// Select Dep1 using Radio Button
		List<WebElement> radioButtonLabels = driver.findElements(By.xpath("//fieldset/*[@class='ng-scope']//label"));
		for (int i = 0; i < radioButtonLabels.size(); i++) {
			WebElement radioButtom = radioButtonLabels.get(i);
			System.out.println(radioButtom.getText());
			if (radioButtom.getText().equals("Dep 1")) {
				WebElement radioButton1 = radioButtom.findElement(By.xpath("span"));
				radioButton1.click();
				break;
			}
		}

		// Go to Next page
		List<WebElement> nextButtons = driver.findElements(By.xpath("//a[text()='Next']"));
		for (int i = 0; i < nextButtons.size(); i++) {
			WebElement nextButton = nextButtons.get(i);
			if (nextButton.isDisplayed()) {
				nextButton.click();
				break;
			}
		}
		Thread.sleep(4000);
		// Enter Case ID Number
		WebElement caseId = driver.findElement(By.xpath("//input[@name='caseNumber']"));
		caseId.sendKeys("333");

		Thread.sleep(4000);
		// Suspect Type using DROPDOWN
		WebElement suspectType = driver.findElement(By.xpath("//select[@ng-model='wizard.report.suspectType']"));
		suspectType.findElement(By.xpath("option[text()='Victim']")).click();

		Thread.sleep(4000);
		// Last Name
		WebElement lastName = driver.findElement(By.xpath("//input[@name='lastName']"));
		lastName.sendKeys("Brown");

		Thread.sleep(4000);
		// First Name
		WebElement firstName = driver.findElement(By.xpath("//input[@name='firstName']"));
		firstName.sendKeys("Sam");

		Thread.sleep(4000);
		// Age
		WebElement age = driver.findElement(By.xpath("//input[@name='Age']"));
		age.sendKeys("30");

		Thread.sleep(4000);
		// Select sex using DROPDOWN
		WebElement sex = driver.findElement(By.xpath("//select[@ng-model='wizard.report.sex']"));
		sex.findElement(By.xpath("option[text()='M']")).click();

		Thread.sleep(4000);
		// Select Build using Dropdown

		WebElement buildDropDown = driver.findElement(By.xpath("//select[@ng-model='wizard.report.build']"));
		buildDropDown.findElement(By.xpath("option[text()='Obese']")).click();

		Thread.sleep(4000);
		// Go to Next page
		for (int i = 0; i < nextButtons.size(); i++) {
			WebElement nextButton = nextButtons.get(i);
			if (nextButton.isDisplayed()) {
				nextButton.click();
				break;
			}
		}
		Thread.sleep(4000);

		// Select Checkbox Tattoos
		driver.findElement(By.xpath("//*[@ng-model='wizard.report.tattoos']")).click();

		Thread.sleep(4000);
		// Select Checkbox Glasses
		driver.findElement(By.xpath("//*[@ng-model='wizard.report.glasses']")).click();

		Thread.sleep(4000);
		// Goto Next page
		for (int i = 0; i < nextButtons.size(); i++) {
			WebElement nextButton = nextButtons.get(i);
			if (nextButton.isDisplayed()) {
				nextButton.click();
				break;
			}
		}

		Thread.sleep(4000);
		// Social security
		WebElement ssn = driver.findElement(By.xpath("//input[@name='socialSecurity']"));
		ssn.sendKeys("123-45-6789");

		Thread.sleep(4000);
		// State
		WebElement state = driver.findElement(By.xpath("//select[@ng-model='wizard.report.dlState']"));
		state.findElement(By.xpath("option[text()='California']")).click();

		Thread.sleep(4000);
		// Go to the next page
		for (int i = 0; i < nextButtons.size(); i++) {
			WebElement nextButton = nextButtons.get(i);
			if (nextButton.isDisplayed()) {
				nextButton.click();
				break;
			}
		}

		Thread.sleep(4000);
		// Select in gang membership
		driver.findElement(By.xpath("//*[@ng-model='wizard.report.robbery']")).click();

		Thread.sleep(4000);
		// Stop Location
		WebElement stopLoc = driver.findElement(By.xpath("//input[@name='locationOfStop']"));
		stopLoc.sendKeys("San Francisco");

		Thread.sleep(4000);
		// Go to next page
		for (int i = 0; i < nextButtons.size(); i++) {
			WebElement nextButton = nextButtons.get(i);
			if (nextButton.isDisplayed()) {
				nextButton.click();
				break;

			}
		}
		Thread.sleep(4000);
		// Vehicle Make
		WebElement vehicleMake = driver.findElement(By.xpath("//input[@name='vehicleMake']"));
		vehicleMake.sendKeys("Toyota");

		Thread.sleep(4000);
		// Vehicle model
		WebElement vehicleModel = driver.findElement(By.xpath("//input[@name='vehicleModel']"));
		vehicleModel.sendKeys("Camry");

		Thread.sleep(4000);
		// Go to next page
		for (int i = 0; i < nextButtons.size(); i++) {
			WebElement nextButton = nextButtons.get(i);
			if (nextButton.isDisplayed()) {
				nextButton.click();

			}
		}

		Thread.sleep(4000);
		// Go to next page
		for (int i = 0; i < nextButtons.size(); i++) {
			WebElement nextButton = nextButtons.get(i);
			if (nextButton.isDisplayed()) {
				nextButton.click();

			}
		}

		Thread.sleep(4000);
		// Publish report
		driver.findElement(By.cssSelector("button[ng-click='wizard.commitReport()']")).click();
	}
}