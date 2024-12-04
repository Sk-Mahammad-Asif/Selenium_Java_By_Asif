package com.example;

//import java.util.List;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\skmda\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
 
         WebDriver driver = new ChromeDriver();
         
         driver.get("https://www.lambdatest.com/selenium-playground/input-form-demo");
       
         driver.manage().window().maximize();

         //tag id  tag#id
          driver.findElement(By.cssSelector("input#name")).sendKeys("Junead");
          driver.findElement(By.cssSelector("#company")).sendKeys("Infosys");

         // driver.get("https://www.lambdatest.com/selenium-playground/table-search-filter-demo");
         
         //tag class tag.class
         // driver.findElement(By.cssSelector("input.task-table-filter")).sendKeys("Testing");
         // driver.findElement(By.cssSelector(".form-control")).sendKeys("Testing");


         //tag attribute  =>  tag[attribute = "value"]
         driver.findElement(By.cssSelector("input[placeholder = 'City']")).sendKeys("panskura");
        // driver.findElement(By.cssSelector("[placeholder = 'Company']")).sendKeys("Infosys");




         //tag class attribute
         //driver.findElement(By.cssSelector("input.block[placeholder = 'State']")).sendKeys("West Bengal");
         driver.findElement(By.cssSelector(".block[placeholder = 'State']")).sendKeys("West Bengal");
         System.out.println("pass");

         driver.close();
        
    }
}

/* tag id    =>   tag#id
 * tag class   =>  tag.classname
 * tag attribute  =>  tag[attribute = "value"]
 * tag class attribute  =>  tag.classname[attribute = "value"]
 */