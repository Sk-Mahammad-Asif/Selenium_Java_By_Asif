package com.example;

//import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverGetMethods {
    
    public static void main(String[] args) {
          System.setProperty("webdriver.chrome.driver", "C:\\Users\\skmda\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
          WebDriver driver = new ChromeDriver();
          WebDriver driver1 = new ChromeDriver();
          driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
       
          driver.manage().window().maximize();

          //getTitles() -- returns the title of the page
          System.out.println(driver.getTitle());


          //getCurrentUrl() --- returns the current url of the page
          System.out.println(driver.getCurrentUrl());


          //getPageSource() --- returns the current url of the page
         // System.out.println(driver.getPageSource());


          //getWindowHandle() -- return ID's of the single Browser window
          String windowID = driver.getWindowHandle();
          System.out.println(windowID);

          driver1.get("https://www.lambdatest.com/selenium-playground/window-popup-modal-demo");
       
          driver1.manage().window().maximize();


          //getWindowHandles() -- return ID's of the Multiple Browser window
          driver1.findElement(By.xpath("//a[@id = 'followboth']")).click();
          Set<String> windowIDs = driver1.getWindowHandles();
          System.out.println(windowIDs);





          driver.close();
    }
}
