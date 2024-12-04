package com.example;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {
         public static void main(String[] args) throws InterruptedException, IOException {
          System.setProperty("webdriver.chrome.driver", "C:\\Users\\skmda\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
          WebDriver driver = new ChromeDriver();
 
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
          driver.get("http://www.deadlinkcity.com/");
          driver.manage().window().maximize();


          List<WebElement> links = driver.findElements(By.tagName("a"));
          System.out.println("Total number of Links:" +links.size());
          int noOfBrokenLinks = 0;

          
            for(WebElement linkElement: links){
                String hrefattvalue = linkElement.getAttribute("href");
    
                if(hrefattvalue==null || hrefattvalue.isEmpty()){
                    System.out.println("href attribute value is null or emmpty so not possible to check");
                    continue;
                }
                try
                {
    
                    //hit url to the server
                    URL linkURL = new URL(hrefattvalue);// converted href value from string to URL format
                    HttpURLConnection conn = (HttpURLConnection) linkURL.openConnection(); //open connection to the server
        
                    if(conn.getResponseCode() >= 400){
                        System.out.println(hrefattvalue +"=========> Broken Link");
                        noOfBrokenLinks++;
                    }else{
                        System.out.println(hrefattvalue+"=========>  Not a broken link");
                    }
    
                }catch(Exception e){

                }
            }    
          
          System.out.println(noOfBrokenLinks);
          
          driver.quit();
     }
}
