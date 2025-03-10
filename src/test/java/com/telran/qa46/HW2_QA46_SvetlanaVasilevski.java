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

public class HW2_QA46_SvetlanaVasilevski {

    WebDriver driver;

    @BeforeMethod

    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }


    @Test
    public void findElementByTagName(){
        WebElement  h = driver.findElement(By.tagName("h2"));
        System.out.println(h.getText());

        List<WebElement> a = driver.findElements(By.tagName("a"));
        System.out.println(a.size());
    }
    @Test
    public void findElementBySimpleLocators(){

        driver.findElement(By.id("bar-notification"));
        driver.findElement(By.id("dialog-notifications-success"));

        driver.findElement(By.className("page-body"));
        driver.findElement(By.className("header"));

        WebElement element = driver.findElement(By.linkText("Digital downloads"));
        System.out.println(element.getText());
        WebElement element1 = driver.findElement(By.linkText("Apparel & Shoes"));
        System.out.println(element1.getText());

        driver.findElement(By.partialLinkText("Digital"));
        driver.findElement(By.partialLinkText("Shoes"));
    }
    @Test
    public void findElementByCssSelectorTest(){

        driver.findElement(By.cssSelector("h2"));

        driver.findElement(By.cssSelector("#bar-notification"));
        driver.findElement(By.cssSelector("#dialog-notifications-success"));

        driver.findElement(By.cssSelector(".page-body"));
        driver.findElement(By.cssSelector(".header"));

        driver.findElement(By.cssSelector("[href='/login']"));
        driver.findElement(By.cssSelector("[href='/Themes/DefaultClean/Content/styles.css']"));
        driver.findElement(By.cssSelector("[href*='/Themes/']"));
        driver.findElement(By.cssSelector("[href^='/Themes/']"));
        driver.findElement(By.cssSelector("[href$='search']"));




    }



}
