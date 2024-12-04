package com.example;

import java.util.List;

//import java.time.Duration;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicLocator {
    public static void main(String[] args) {
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\skmda\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.lambdatest.com/selenium-playground/input-form-demo");
      
        driver.manage().window().maximize();
        
        //driver id to find elements
        driver.findElement(By.id("inputEmail4")).sendKeys("xyz@gmail.com");
        System.out.println("Passed Id");

        //driver name to find elements
        driver.findElement(By.name("name")).sendKeys("Soumen Deb");
        System.out.println("Passed Name");


       //link text to find elements
       driver.findElement(By.linkText("Automation Testing Cloud")).click();
       System.out.println("Passed Linktest");


       //partial linktext to find elements
       driver.findElement(By.partialLinkText("XCUITe")).click();
       System.out.println("Partial Linktext");

       //tag element is basically use for group of a element (in a website have multiple tags so we not prefer to use tag)
       List<WebElement> alinks= driver.findElements(By.tagName("a"));
       System.out.println(alinks.size());

       List<WebElement> imgLinks= driver.findElements(By.tagName("img"));
       System.out.println(imgLinks.size());

       //className element is basically use for group of a element (in a website have same class  multiple LI or UL)
       List<WebElement> elements= driver.findElements(By.className("footer-menu"));
       System.out.println(elements.size());

        driver.close();




    


    }
}
