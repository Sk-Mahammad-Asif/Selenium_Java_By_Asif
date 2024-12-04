package com.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {
    public static void main(String[] args) throws InterruptedException {
          System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\skmda\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
          WebDriver driver = new ChromeDriver();

          driver.get("https://the-internet.herokuapp.com/javascript_alerts");
          driver.manage().window().maximize();

          /*Normal alert with ok button
          driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();

          Thread.sleep(5000);

          //one approach
          //driver.switchTo().alert().accept();

          Alert myalert = driver.switchTo().alert();
          System.out.println(myalert.getText());
          myalert.accept();


          //alert ok and cancel

          driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']"));
          Thread.sleep(3000);
          driver.switchTo().alert().accept(); //accept
          driver.switchTo().alert().dismiss(); //cancel

          */


          driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();

          Thread.sleep(5000);

          Alert myalert = driver.switchTo().alert();
          myalert.sendKeys("Hello Guys");
          myalert.accept();


          driver.quit();
    }
}
