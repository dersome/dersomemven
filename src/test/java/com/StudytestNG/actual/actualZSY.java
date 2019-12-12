package com.StudytestNG.actual;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class actualZSY {
    WebDriver driver;
    @BeforeMethod
    public void openFirefox(){
        System.setProperty("webdriver.gecko.driver","D:\\IDEA Study\\selenium_one\\drivers\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void case01() throws InterruptedException {
//        地址、账号、密码，并登录
        driver.get("http://192.168.1.109:9527/login");
        driver.findElement(By.name("username")).sendKeys("zsy");
        driver.findElement(By.name("password")).sendKeys("11111");
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/form/div[5]/div/button")).click();
        Thread.sleep(2000);

//        点击一级模块“服务单派审”
        driver.findElement(By.xpath("//*[@class=\"scrollbar-wrapper el-scrollbar__wrap\"]/div/ul/div[2]/li/div/span")).click();
        Thread.sleep(2000);
//        点击二级模块“待办服务单”
        driver.findElement(By.xpath("//*[@class=\"scrollbar-wrapper el-scrollbar__wrap\"]/div/ul/div[2]/li/ul/a[1]/li/span")).click();
        Thread.sleep(2000);

//        搜索栏所有工单，并查询
        driver.findElement(By.xpath("//*[@class=\"el-input el-input--medium el-input--suffix\"]/input")).sendKeys("标题是测试D1201-1222");
        driver.findElement(By.xpath("//*[@class=\"el-icon-search\"]")).click();
        Thread.sleep(2000);

//        击进入工单详情页
        driver.findElement(By.linkText("标题是测试D1201-1222")).click();
        Thread.sleep(2000);

//        点击退回
        driver.findElement(By.xpath("//*[@id=\"wait-for-handle-detail\"]/div[2]/button[2]/span")).click();
        Thread.sleep(2000);

//        退回下拉框焦距元素
        WebElement searchBox01 = driver.findElement(By.xpath("//*[@id=\"wait-for-handle-detail\"]/div[3]/div/div[2]/form/div[1]/div/div/div[1]/input"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", searchBox01);
        searchBox01.click();

/*
//        选择退回原因下拉框
        driver.findElement(By.xpath("://[@class=\"el-input el-input--medium el-input--suffix\"]/input")).click();
*/
        Thread.sleep(2000);
//        选择退回原因
        driver.findElement(By.xpath("//*[@class=\"el-popup-parent--hidden\"]/div[3]/div[1]/div[1]/ul/li[1]/span")).click();
//        填写退回描述
        driver.findElement(By.xpath("//*[@class=\"el-dialog__body\"]/form/div[2]/div/div/textarea")).sendKeys("标题是测试D1201-1222");
        driver.findElement(By.xpath("//*[@class=\"el-dialog__body\"]/div/button[2]/span")).click();
        Thread.sleep(2000);

//        弹窗点击确认
        driver.findElement(By.xpath("//*[@class=\"el-message-box__btns\"]/button/span")).click();

    }
    @AfterMethod
    public void closeFirefox() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}
