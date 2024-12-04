package com.example;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
    
      public static void main(String[] args) throws InterruptedException {
          System.setProperty("webdriver.chrome.driver", "C:\\Users\\skmda\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
          WebDriver driver = new ChromeDriver();

          WebDriverWait myWait = new WebDriverWait(driver, Duration.ofSeconds(10)); //Declaration

          driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

          driver.manage().window().maximize();
          
          WebElement txtusername = myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder = 'Username']")));
          txtusername.sendKeys("Admin");

          WebElement txtpassword = myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder = 'Password']")));
          txtpassword.sendKeys("admin123");

          WebElement loginBnn = myWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Login']")));
          loginBnn.click();


          System.out.println("Pass");
       
         
          driver.close();
          
      }
}