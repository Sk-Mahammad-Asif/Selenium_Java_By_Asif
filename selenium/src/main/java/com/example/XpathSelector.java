package com.example;
//import java.util.List;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathSelector {
    public static void main(String[] args) {
          System.setProperty("webdriver.chrome.driver", "C:\\Users\\skmda\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
 
          WebDriver driver = new ChromeDriver();
         
          driver.get("https://www.lambdatest.com/selenium-playground/input-form-demo");
       
          driver.manage().window().maximize();


         //tag[@attribute = 'value'] --- single attribute
          driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Junead");


          //tag[@attribute = 'value'][@attribute = 'value'] --- Multiple attribute
          driver.findElement(By.xpath("//input[@placeholder='Company'][@name='company']")).sendKeys("TCS");
          
  

          //xpath with 'Or' operator
          driver.findElement(By.xpath("//input[@placeholder='Zip' or @name='zip']")).sendKeys("721152");


          //xpath with 'and' operator
          driver.findElement(By.xpath("//input[@placeholder='Zip code' and  @name='zip']")).sendKeys("721152");


          //xpath with text() - inner text
          boolean isDisplayed = driver.findElement(By.xpath("//a[text() = 'Login']")).isDisplayed();
          System.out.println(isDisplayed);

          String recivedString = driver.findElement(By.xpath("//h1[text() = 'Form Demo']")).getText();
          System.out.println(recivedString);

          String recivedString1 = driver.findElement(By.xpath("//*[text() = 'Get Started Free']")).getText();
          System.out.println(recivedString1);




          //xpath contains() and starts-with()
          driver.findElement(By.xpath("//*[contains(@id, 'website')]")).sendKeys("mysirg");
          
          driver.findElement(By.xpath("//*[starts-with(@id, 'website')]")).sendKeys("mysirg1");

          //driver.findElement(By.xpath("//*[starts-with(text(), 'website')]")).sendKeys("mysirg1");


          //chained xpath
          boolean isLogo = driver.findElement(By.xpath("//div[@class = 'tools_logo']/a/img")).isDisplayed();
          System.out.println(isLogo);


          System.out.println("Pass");
          driver.close();
    }
}
