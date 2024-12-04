package com.example;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenShots {
         public static void main(String[] args) throws InterruptedException {
          System.setProperty("webdriver.chrome.driver", "C:\\Users\\skmda\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
          WebDriver driver = new ChromeDriver();

          driver.get("https://demo.nopcommerce.com/desktops");
          driver.manage().window().maximize();

          //1) full page screenshot

         /*TakesScreenshot ts = (TakesScreenshot)driver;
          File sourcefiles = ts.getScreenshotAs(OutputType.FILE);
          File targetFile = new File(System.getProperty("user.dir")+"\\selenium\\screenshots\\fullpage.png");
          sourcefiles.renameTo(targetFile);*/



          //2) take screenshot of particular things
          WebElement featuredProduct = driver.findElement((By.xpath("//div[@class='page-body']")));
          
          File sourcefiles = featuredProduct.getScreenshotAs(OutputType.FILE);
          File targetFile = new File(System.getProperty("user.dir")+"\\selenium\\screenshots\\desktop.png");
          sourcefiles.renameTo(targetFile);

          
          driver.quit();
     }
}
