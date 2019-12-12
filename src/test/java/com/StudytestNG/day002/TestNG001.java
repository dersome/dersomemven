package com.StudytestNG.day002;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class TestNG001 {
    WebDriver driver;
    @BeforeMethod
    public void openFireFox(){
        System.setProperty("webdriver.gecko.driver", "D:\\IDEA Study\\selenium_one\\drivers\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void case001() throws InterruptedException {
        driver.get("http://www.baidu.com");
        Thread.sleep(1000);
        driver.findElement(By.id("kw")).sendKeys("test");
        driver.findElement(By.id("su")).click();
    }
    @Test
    public void case002() throws InterruptedException {
        driver.get("http://baidu.com");
        Thread.sleep(1000);
        driver.findElement(By.id("kw")).sendKeys("自动化测试");
        driver.findElement(By.id("su")).click();
    }
    @AfterMethod
    public void closeFireFox() throws InterruptedException {
        Thread.sleep(1000);
        driver.quit();
    }
}
