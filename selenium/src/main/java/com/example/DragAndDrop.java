package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
       public static void main(String[] args) throws InterruptedException {
          System.setProperty("webdriver.chrome.driver", "C:\\Users\\skmda\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
          WebDriver driver = new ChromeDriver();

          driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
          driver.manage().window().maximize();


          Thread.sleep(5000);

          WebElement target_Rome = driver.findElement(By.xpath("//div[@id='box6']"));

          WebElement dest_Italy = driver.findElement(By.xpath("//div[@id='box106']"));

          Actions act = new Actions(driver);
          Thread.sleep(3000);

          //drag and drop
          act.dragAndDrop(target_Rome, dest_Italy).perform();
          Thread.sleep(3000);

          

        

          
          driver.quit();
     }
}
