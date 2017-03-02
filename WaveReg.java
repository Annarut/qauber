package com.example.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.testng.Assert.*;
public class WaveReg {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://testwave.qabidder.net/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testWaveregis() throws Exception {
    driver.get(baseUrl + "/#/page/login");
    Thread.sleep(5000);
    driver.findElement(By.linkText("Register Now")).click();
    driver.findElement(By.name("account_name")).clear();
    driver.findElement(By.name("account_name")).sendKeys("Anna");
    driver.findElement(By.name("account_email")).clear();
    driver.findElement(By.name("account_email")).sendKeys("qatest.er1214@mailinator.com");
    driver.findElement(By.id("id-password")).clear();
    driver.findElement(By.id("id-password")).sendKeys("123456test");
    driver.findElement(By.name("account_password_confirm")).clear();
    driver.findElement(By.name("account_password_confirm")).sendKeys("123456test");
    driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div/div[2]/form/button")).click();
    // ERROR: Caught exception [Error: Dom locators are not implemented yet!]
    driver.findElement(By.name("name")).clear();
    driver.findElement(By.name("name")).sendKeys("Mac");
    driver.findElement(By.name("phone")).click();
    driver.findElement(By.name("phone")).clear();
    driver.findElement(By.name("phone")).sendKeys("5555555555");
    driver.findElement(By.name("email")).clear();
    driver.findElement(By.name("email")).sendKeys("qatester1214@gmail.com");
    driver.findElement(By.xpath("(//input[@type='text'])[5]")).click();
    driver.findElement(By.xpath("(//input[@type='text'])[5]")).clear();
    driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("2 Market");
    driver.findElement(By.name("state")).click();
    new Select(driver.findElement(By.name("state"))).selectByVisibleText("California");
    driver.findElement(By.name("zip")).clear();
    driver.findElement(By.name("zip")).sendKeys("94121");
    driver.findElement(By.id("registerConfirm")).click();
    driver.findElement(By.id("exampleInputEmail1")).clear();
    driver.findElement(By.id("exampleInputEmail1")).sendKeys("qatest.er1214@gmail.com");
    driver.findElement(By.id("exampleInputPassword1")).clear();
    driver.findElement(By.id("exampleInputPassword1")).sendKeys("123456test");
    driver.findElement(By.xpath("//button[@type='submit']")).click();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
