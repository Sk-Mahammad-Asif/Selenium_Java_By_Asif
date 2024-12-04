package com.example;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethods {
    public static void main(String[] args) throws MalformedURLException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\skmda\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
 
         WebDriver driver = new ChromeDriver();
         
         //driver.get("https://www.zoho.com/meeting/"); //accept url only string format

        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); // accept string & object both format

        URL myurl = new URL("https://www.lambdatest.com/selenium-playground/table-search-filter-demo"); //object flavour
        driver.navigate().to(myurl);

        System.out.println(driver.getTitle());


        driver.navigate().back(); //back to previous url
        System.out.println(driver.getCurrentUrl());


        driver.navigate().forward(); //forward to second url
        System.out.println(driver.getCurrentUrl());


        driver.navigate().refresh();//refresh the page


        

        driver.quit();
    }
}
