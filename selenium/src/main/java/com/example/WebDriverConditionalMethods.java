package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverConditionalMethods {
      public static void main(String[] args) throws InterruptedException {
          System.setProperty("webdriver.chrome.driver", "C:\\Users\\skmda\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
          WebDriver driver = new ChromeDriver();

          driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
       
          driver.manage().window().maximize();
          Thread.sleep(5000);

          //isDisplayed()
          WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
          System.out.println("Logo is displayed : " +logo.isDisplayed());


          boolean isVisible = driver.findElement(By.xpath("//h1[normalize-space()='Register']")).isDisplayed();
          System.out.println(isVisible);


          //isEnable
          boolean status = driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();
          System.out.println("isEnabled:  " +status);

          //isSelected -- before selected.
          boolean male_rd = driver.findElement(By.xpath("//input[@id = 'gender-male']")).isSelected();
          boolean female_rd = driver.findElement(By.xpath("//input[@id = 'gender-female']")).isSelected();

          System.out.println("Before isSelected");
          System.out.println(male_rd);
          System.out.println(female_rd);

         //isSelected -- after selected.
         driver.findElement(By.xpath("//input[@id = 'gender-male']")).click();
         Thread.sleep(3000);
         boolean male_rd1 = driver.findElement(By.xpath("//input[@id = 'gender-male']")).isSelected();


         driver.findElement(By.xpath("//input[@id = 'gender-female']")).click();
         Thread.sleep(3000);
         boolean female_rd1 = driver.findElement(By.xpath("//input[@id = 'gender-female']")).isSelected();

         System.out.println("After isSelected");
         System.out.println(male_rd1);
         System.out.println(female_rd1);


         //checkbox
        boolean checkBox =  driver.findElement(By.xpath("//input[@id = 'Newsletter']")).isSelected();
        System.out.println("Check Box Selected :" +checkBox);

        driver.close(); //close single browser in window which are focused first.
        driver.quit(); //close all browser open in window

      }
}
