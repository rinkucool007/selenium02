package com.java.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
public class AppTest  {
    public void testBrowser() {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();        
        driver.get("https://google.com");
        String title = driver.getTitle();
        System.out.println(title);      
        driver.quit();      
    }
}