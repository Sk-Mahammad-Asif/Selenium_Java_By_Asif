package com.example;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebTable {
     public static void main(String[] args) throws MalformedURLException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\skmda\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
 
         WebDriver driver = new ChromeDriver();
         
         driver.get("https://testautomationpractice.blogspot.com/"); //accept url only string format

         driver.manage().window().maximize();

         //1) Number of Rows Of a table
  
         int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
         System.out.println("Numbers of Rows:" + rows);


         //2) Number of Coloumns of a table
         int cols = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
         System.out.println("Numbers of Rows:" + cols);


         //3) Read data from specific row aand column (ex: 5th Row and 1st Column)
         String bookName = driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]/td[1]")).getText();
         System.out.println(bookName);


         //4 ) all table data 
         for(int row=2; row <= rows; row++){

            for(int col=1; col <= cols; col++){

                String tableData = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+row+"]/td["+col+"]")).getText();
                System.out.println(tableData);

            }
         }

         


         driver.quit();

     }

}
