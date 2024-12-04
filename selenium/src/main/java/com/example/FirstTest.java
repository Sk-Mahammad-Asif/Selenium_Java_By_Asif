package com.example;
import java.time.Duration;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {
    public static void main(String[] args) {
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\skmda\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.zoho.com/meeting/");
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        String actualTitle =  "Online Meeting Software & Platform - Zoho Meeting";
        String recivedTitle = driver.getTitle();


        if(recivedTitle.equals(actualTitle)){
           System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }
        driver.close();

    }
}
