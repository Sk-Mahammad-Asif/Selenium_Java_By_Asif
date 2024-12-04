package com.example;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicPaginationWebTable {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\skmda\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
 
         WebDriver driver = new ChromeDriver();
         
         driver.get("https://demo.opencart.com/admin/index.php?route=common/login"); //accept url only string format
         

         driver.manage().window().maximize();
  
         WebElement username = driver.findElement(By.xpath("//input[@id = 'input-username']"));
         username.clear();
         username.sendKeys("demo");

         WebElement password = driver.findElement(By.xpath("//input[@id = 'input-password']"));
         password.clear();
         password.sendKeys("demo");

         driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

         //close window if it is available

         if(driver.findElement(By.xpath("//button[@class='btn-close']")).isDisplayed()){
            driver.findElement(By.xpath("//button[@class='btn-close']")).click();
         }

         
         driver.findElement(By.xpath("//a[@class='parent collapsed'][normalize-space()='Customers']")).click(); //click on customer
         driver.findElement(By.xpath("//ul[@id='collapse-5']//a[contains(text(),'Customers')]")).click(); //click on tables


         String text = driver.findElement(By.xpath("(//div[@class='col-sm-6 text-end'])[1]")).getText();

         int total_pages =Integer.parseInt(text.substring(text.indexOf("(")+1, text.indexOf("Pages")-1));

         for(int p = 1; p<=total_pages; p++){

            if(p > 1){
                WebElement active_page = driver.findElement(By.xpath("//a[normalize-space()="+p+"]"));
                active_page.click();
            }

            //reading data from the page when row is changeable

            int noOfRows = driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr")).size();

            for(int row = 1; row <= noOfRows; row++){
                //find one by one data from table row is changeable dynamically
                String name = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+row+"]/td[2]")).getText();
                System.out.println(name);
            }
         }
         

         driver.quit();

    }
}
