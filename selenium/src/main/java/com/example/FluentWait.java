/*package com.example;

import java.time.Duration;
import java.util.NoSuchElementException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

public class FluentWait {
    
      public static void main(String[] args) throws InterruptedException {
          System.setProperty("webdriver.chrome.driver", "C:\\Users\\skmda\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
          WebDriver driver = new ChromeDriver();


          //Fluent Wait Declaration
          Wait<WebDriver> wait = new FluentWait<WebDriver>(driver) 
               .withTimeout(Duration.ofSeconds(30)) // Maximum wait time 
               .pollingEvery(Duration.ofSeconds(5)) // Interval to check condition 
               .ignoring(NoSuchElementException.class); // Ignore exceptions

          

          driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

          

          driver.manage().window().maximize();
          
          
       
         
          driver.close();
          
      }
}*/
