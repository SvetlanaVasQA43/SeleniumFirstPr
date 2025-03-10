package com.telran.qa46;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class HW1_SvetlanaVasilevski {

    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.navigate().to("https://www.asos.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @Test
    public void openAsosTest(){
        System.out.println("open Asos page");

    }
    @AfterMethod
   public void tearDown(){
       driver.quit();


    }



}
