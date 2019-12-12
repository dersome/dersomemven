package com.StudytestNG.day001;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG14Fire {
    WebDriver driver;

//    打开浏览器
    @BeforeMethod
    public void openChrome(){
        System.setProperty("webdriver.chrome.driver","D:\\IDEA Study\\selenium_one\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
    }
    @Test
    public void ingChrome(){
//        打开百度页面
        driver.get("http://192.168.1.109:9527/login");
//        输入关键字aa
        WebElement keyFile = driver.findElement(By.name("username"));
//        点击“百度一下”进行搜索
        keyFile.click();
//        等待3秒
//        Thread.sleep("3000");
//        获取页面数据.//*[@id='1']/h3/a
        WebElement text = driver.findElement(By.xpath(".//*[@id='1']/h3/a)"));
//        校验第一搜索结果显示“AA_百度翻译”
        Assert.assertEquals(text,"AA_百度翻译","与预期结果不符");
    }
    @AfterMethod
    public void quitChrome(){
        driver.quit();
    }
}
