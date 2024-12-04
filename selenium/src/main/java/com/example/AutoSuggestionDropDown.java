package com.example;

import java.net.MalformedURLException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoSuggestionDropDown {
    public static void main(String[] args) throws MalformedURLException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\skmda\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
 
         WebDriver driver = new ChromeDriver();
         
         driver.get("https://www.google.co.in/"); //accept url only string format

         driver.manage().window().maximize();

         // Find the search input field
        WebElement searchBox = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));

        // Enter search query
        searchBox.sendKeys("SSC MTS");

        // Wait for suggestions to appear (adjust wait time as needed)
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//b[normalize-space()='result 2024']")));

        // Select the first suggestion one approach
         WebElement firstSuggestion = driver.findElement(By.xpath("//b[normalize-space()='result 2024']"));
        //firstSuggestion.click();

        //another approach
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", firstSuggestion);

       
        driver.quit();


    }
}
