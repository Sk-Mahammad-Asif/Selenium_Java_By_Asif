package com.example;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {
    
      public static void main(String[] args) throws InterruptedException {
          System.setProperty("webdriver.chrome.driver", "C:\\Users\\skmda\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
          WebDriver driver = new ChromeDriver();

          driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //Implicit Wait

          driver.manage().window().maximize();
          
          driver.findElement(By.xpath("//input[@placeholder = 'Username']")).sendKeys("Admin");
          System.out.println("Pass");
       
         
          driver.close();
          
      }
}
