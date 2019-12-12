package com.StudytestNG.day001;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TestNG16Six {
    WebDriver driver;

    //    打开浏览器
    @BeforeMethod
    public void openChrome() {
        System.setProperty("webdriver.chrome.driver", "D:\\IDEA Study\\selenium_one\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
    }

//    下拉框的元素定位
    @Test
    public void ingChrome() throws InterruptedException {
//        打开页面
        driver.get("file:///C:/Users/Administrator/Desktop/index.html");
        Thread.sleep(2000);
//        定位下拉框、点击下拉框
        WebElement testmoreselect = driver.findElement(By.id("moreSelect"));
        testmoreselect.click();
//        new 一个select对象,并且指定是哪个下拉框testmoreselect
        Select testselect = new Select(testmoreselect);
        testselect.selectByIndex(2);
    }

    @AfterMethod
    public void quitChrome() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}
