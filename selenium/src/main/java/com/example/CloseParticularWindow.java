package com.example;

import java.net.MalformedURLException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseParticularWindow {
    public static void main(String[] args) throws MalformedURLException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\skmda\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
 
         WebDriver driver = new ChromeDriver();
         
         driver.get("https://www.lambdatest.com/selenium-playground/window-popup-modal-demo"); //accept url only string format

         driver.manage().window().maximize();

         driver.findElement(By.xpath("//a[@id = 'followboth']")).click();

         Set<String> windowIds = driver.getWindowHandles();

         for(String winid: windowIds){
            String title = driver.switchTo().window(winid).getTitle();
            System.out.println(title);

            if(title.equals(("Profile / X"))){
                driver.close();
            }
         }

    }
}
