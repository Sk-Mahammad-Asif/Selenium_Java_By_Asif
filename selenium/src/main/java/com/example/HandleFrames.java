package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrames {
     public static void main(String[] args) throws InterruptedException {
          System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\skmda\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
          WebDriver driver = new ChromeDriver();

          driver.get("https://ui.vision/demo/webtest/frames/");
          driver.manage().window().maximize();

          //Frame1
          WebElement frame1 = driver.findElement(By.xpath("//frame[@src = 'frame_1.html']"));
          driver.switchTo().frame(frame1); //passed frame as a web element //switch to frame1

          driver.findElement(By.xpath(("//input[@name='mytext1']"))).sendKeys("Welcome");
          Thread.sleep(3000);

          //switch to orginal page means outside of frame
          driver.switchTo().defaultContent();

          //frame 2
          WebElement frame2 = driver.findElement(By.xpath("//frame[@src = 'frame_2.html']"));
          driver.switchTo().frame(frame2); //passed frame as a web element //switch to frame1

          driver.findElement(By.xpath(("//input[@name='mytext2']"))).sendKeys("Hello Guys");
          Thread.sleep(3000);


          //switch to orginal page means outside of frame
          driver.switchTo().defaultContent();


          //frame 3
          WebElement frame3 = driver.findElement(By.xpath("//frame[@src = 'frame_3.html']"));
          driver.switchTo().frame(frame3); //passed frame as a web element //switch to frame1

          driver.findElement(By.xpath(("//input[@name='mytext3']"))).sendKeys("Hello Bhaisahab");
          Thread.sleep(3000);


          //inner iframe - part of frame 3 //one approach
          driver.switchTo().frame(0);

          driver.findElement(By.xpath("//div[@id='i9']//div[@class='vd3tt']")).click();
          Thread.sleep(3000);


          //second approach
          
          WebElement rdbtn =  driver.findElement(By.xpath("//div[@id='i6']//div[@class='AB7Lab Id5V1']"));
          JavascriptExecutor js = (JavascriptExecutor)driver;
          js.executeScript("arguments[0].click();", rdbtn);

          Thread.sleep(3000);


          
          driver.quit();
     }

}