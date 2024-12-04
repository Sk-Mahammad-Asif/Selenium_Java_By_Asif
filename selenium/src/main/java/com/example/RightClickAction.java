package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickAction {
     public static void main(String[] args) throws InterruptedException {
          System.setProperty("webdriver.chrome.driver", "C:\\Users\\skmda\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
          WebDriver driver = new ChromeDriver();

          driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
          driver.manage().window().maximize();
          Thread.sleep(5000);

          WebElement rightclick = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));

         // WebElement onlineBrowserTesting = driver.findElement(By.xpath("//p[normalize-space()='Online Browser Testing']"));

          Actions act = new Actions(driver);

          //Mouse hover 

          //another approach newer version
          act.contextClick(rightclick).perform();

          driver.findElement(By.xpath("//li[@class='context-menu-item context-menu-icon context-menu-icon-copy']")).click();;
          Thread.sleep(3000);
          
          driver.switchTo().alert().accept();

          driver.quit();
     }
}
