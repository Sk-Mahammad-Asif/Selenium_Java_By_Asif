package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAction {
         public static void main(String[] args) throws InterruptedException {
          System.setProperty("webdriver.chrome.driver", "C:\\Users\\skmda\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
          WebDriver driver = new ChromeDriver();

          driver.get("https://www.lambdatest.com/selenium-playground/");
          driver.manage().window().maximize();
          Thread.sleep(5000);

          WebElement platform = driver.findElement(By.xpath("//a[normalize-space()='Platform']"));

          WebElement onlineBrowserTesting = driver.findElement(By.xpath("//p[normalize-space()='Online Browser Testing']"));

          Actions act = new Actions(driver);

          //Mouse hover 

          //one approach older version
          act.moveToElement(platform).moveToElement(onlineBrowserTesting).click().build().perform();

          //another approach newer version
          act.moveToElement(platform).moveToElement(onlineBrowserTesting).click().perform();
          

          driver.quit();
     }
}