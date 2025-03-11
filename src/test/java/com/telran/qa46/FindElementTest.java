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
        WebElement a2 = driver.findElement(By.linkText("Let the car work"));
        System.out.println(a2.getText());
        driver.findElement(By.partialLinkText("car"));
    }

    @Test
    public void findElementByCssSelectorTest(){
        //tagName==css
        driver.findElement(By.cssSelector("h1"));
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
        //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        //tag+id
        driver.findElement(By.cssSelector("input#city"));
        //tag+class
        driver.findElement(By.cssSelector("div.search-card"));
        //tag+id+[attr='value']
        driver.findElement(By.cssSelector("input#city[type='text']"));

    }

    //          //*[@attr='value']    ili   //tag[@attr='value']

    @Test
    public void findElementByXpath(){
        //tag->xpath//tag
       // driver.findElement(By.tagName("h1"));
        driver.findElement(By.xpath("//h1"));

        //id->xpath//*[@id='value']
       // driver.findElement(By.id("#city"));
        driver.findElement(By.xpath("//input[@id='city']"));

        //className->xpath //*[@class='value']
        //driver.findElement(By.className("mobile-header"));
        driver.findElement(By.xpath("//*[@class='mobile-header']"));
        //driver.findElement(By.xpath("//div[@class='mobile-header']"));

        //contains->//*[contains(.,'Text')]
        driver.findElement(By.xpath("//h2[contains(.,'Yalla')]"));
        //equal->//*[text()='FoolText']
        driver.findElement(By.xpath("//h2[text()='Type your data and hit Yalla!']"));
        driver.findElement(By.xpath("//h2[.='Type your data and hit Yalla!']"));

        //start->//*[starts-with(@attr,'StartText')]
        driver.findElement(By.xpath("//label[starts-with(@for,'ci')]"));
        //move up
        driver.findElement(By.xpath("//a[@class='navigation-link']/.."));
        // || ili or
        //driver.findElement(By.xpath("//a[@class='navigation-link'||]/.."));
       // driver.findElement(By.xpath("//a[@class='navigation-link'or]/.."));


        //parent
        driver.findElement(By.xpath("//h1/parent::*"));
        driver.findElement(By.xpath("//h1/parent::div"));
        driver.findElement(By.xpath("//h1/.."));

        //ancestor
        driver.findElement(By.xpath("//h1/ancestor::*"));   //vse
        driver.findElement(By.xpath("//h1/ancestor::div"));  //only div
        driver.findElement(By.xpath("//h1/ancestor::div[2]"));//only vtoroy div

        //following-sibling
        driver.findElement(By.xpath("//h1/following-sibling::form"));
        //preceding
        driver.findElement(By.xpath("//h2/preceding-sibling::*"));








    }


}
