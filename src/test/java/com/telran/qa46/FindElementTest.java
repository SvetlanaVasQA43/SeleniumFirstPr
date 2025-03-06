package com.telran.qa46;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class FindElementTest {
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://ilcarro.web.app/search");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();

    }

    @Test
    public void findElementByTagName(){
        WebElement h1 = driver.findElement(By.tagName("h1"));//odin element
        System.out.println(h1.getText()); //raspezatca texta

        WebElement a = driver.findElement(By.tagName("a"));
        System.out.println(a.getText());

        //find list of elements
       List<WebElement> a1 = driver.findElements(By.tagName("a")); //list elementov
        System.out.println(a1.size());

       // List<WebElement> a1 = driver.findElements(By.tagName("")); //delaem oschibky
       // System.out.println(a1.size());
    }

    @Test
    public void findElementBySimpleLocators(){
        //by id
        driver.findElement(By.id("city"));
        //by classname
        driver.findElement(By.className("mobile-header"));
        //by linkText
       // WebElement a2 = driver.findElement(By.linkText(" Let the car work "));
       // System.out.println(a2.getText());
        driver.findElement(By.partialLinkText("car"));
    }

    @Test
    public void findElementByCssSelectorTest(){
        //tagName==css

        //id=>css(#)
        //driver.findElement(By.id("city")
        driver.findElement(By.cssSelector("#city"));
        //className=>css(.)
        //driver.findElement(By.cssSelector("mobile-header"));
        driver.findElement(By.cssSelector(".mobile-header"));

        //[attr = 'value']
        driver.findElement(By.cssSelector("[href='/login?url=%2Fsearch']"));
        //contains->*
        driver.findElement(By.cssSelector("[href*='login']"));
        //start->^
        driver.findElement(By.cssSelector("[href^='/log']"));
        //end on->$
        driver.findElement(By.cssSelector("[href$='search']"));

    }


}
