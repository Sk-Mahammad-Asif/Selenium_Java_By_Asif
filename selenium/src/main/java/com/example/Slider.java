package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {
       public static void main(String[] args) throws InterruptedException {
          System.setProperty("webdriver.chrome.driver", "C:\\Users\\skmda\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
          WebDriver driver = new ChromeDriver();

          driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
          driver.manage().window().maximize();

          Thread.sleep(5000);

         

          Actions act = new Actions(driver);

          //min_slider
          WebElement min_slider = driver.findElement(By.xpath("//div[@id='slider-range']//span[1]"));
          System.out.println("Default slider Range : "+ min_slider.getLocation()); // (58, 249) //before slider
          act.dragAndDropBy(min_slider, 100, 249).perform();
          System.out.println("Minimum slider Range : "+ min_slider.getLocation()); //after slider


           //max_slider
           WebElement max_slider = driver.findElement(By.xpath("//span[2]"));
           System.out.println("Default slider Range : "+ max_slider.getLocation()); // (876, 249) //before slider
           act.dragAndDropBy(max_slider, -100, 249).perform();
           System.out.println("Maximum slider Range : "+ max_slider.getLocation()); //after slider

          
          driver.quit();
     }
}
