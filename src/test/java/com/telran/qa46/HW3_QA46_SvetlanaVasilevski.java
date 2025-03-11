package com.telran.qa46;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class HW3_QA46_SvetlanaVasilevski {
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
    public void findElementByXpath() {

        driver.findElement(By.xpath("//h2"));
        driver.findElement(By.xpath("//h3"));

        driver.findElement(By.xpath("//input[@id='small-searchterms']"));
        driver.findElement(By.xpath("//span[@id='poll-voting-progress-1']"));

        driver.findElement(By.xpath("//*[@class='bar-notification']"));
        driver.findElement(By.xpath("//div[@class='footer']"));


        driver.findElement(By.xpath("//h3[contains(.,'Information')]"));
        driver.findElement(By.xpath("//*[contains(.,'Customer service')]"));


        driver.findElement(By.xpath("//strong[text()='Featured products']"));
        driver.findElement(By.xpath("//strong[.='Featured products']"));


        driver.findElement(By.xpath("//input[starts-with(@value,'Vo')]"));
        driver.findElement(By.xpath("//label[starts-with(@for,'pol')]"));
        driver.findElement(By.xpath("//input[starts-with(@id,'pol')]"));


        driver.findElement(By.xpath("//a[@class='ico-login']/.."));
        driver.findElement(By.xpath("//a[@class='nivo-imageLink']/.."));


        //parent
        driver.findElement(By.xpath("//a/parent::*"));
        driver.findElement(By.xpath("//h2/parent::div"));
        driver.findElement(By.xpath("//h3/.."));

        //ancestor
        driver.findElement(By.xpath("//h2/ancestor::*"));
        driver.findElement(By.xpath("//h3/ancestor::div"));
        driver.findElement(By.xpath("//a/ancestor::div[2]"));

        //following-sibling
        driver.findElement(By.xpath("//a/following-sibling::*"));
        //preceding
        driver.findElement(By.xpath("//a/preceding-sibling::*"));




    }


}
