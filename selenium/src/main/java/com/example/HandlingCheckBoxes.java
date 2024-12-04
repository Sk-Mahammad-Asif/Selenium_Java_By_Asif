package com.example;

//import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingCheckBoxes {
    public static void main(String[] args) throws InterruptedException {
          System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\skmda\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
          WebDriver driver = new ChromeDriver();

          driver.get("https://testautomationpractice.blogspot.com/");
          driver.manage().window().maximize();

          //select radio button
          driver.findElement(By.xpath("//input[@id = 'male']")).click();

          //select specific checkbox
          driver.findElement(By.xpath("//input[@id='sunday']")).click();

          //select multiple checkboxes
          List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class = 'form-check-input' and @type = 'checkbox']"));

          //selecting the checkboxes
          for(int i = 0; i<checkboxes.size(); i++){

              checkboxes.get(i).click();
              Thread.sleep(2000);
          }

          //unselecting the checkboxes
          for(int i = 0; i<checkboxes.size(); i++){

            if(checkboxes.get(i).isSelected()){
                checkboxes.get(i).click();
            }
            Thread.sleep(2000);
          }
          

          driver.quit();

          

    }
}
