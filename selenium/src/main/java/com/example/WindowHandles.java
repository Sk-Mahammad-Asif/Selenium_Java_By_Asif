package com.example;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {
        public static void main(String[] args) throws MalformedURLException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\skmda\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
 
         WebDriver driver = new ChromeDriver();
         
         driver.get("https://www.lambdatest.com/selenium-playground/window-popup-modal-demo"); //accept url only string format

         driver.manage().window().maximize();

         driver.findElement(By.xpath("//a[@id = 'followboth']")).click();

         Set<String> windowIds = driver.getWindowHandles();

         //approach 1
         List<String> windowList = new ArrayList<>(windowIds);

         String parentId = windowList.get(0);
         String childId = windowList.get(1);

         //switch to child window
         driver.switchTo().window(childId);
         System.out.println(driver.getTitle());


        //switch to parent window
        driver.switchTo().window(parentId);
        System.out.println(driver.getTitle());
  



         driver.quit();

        }
    
}
