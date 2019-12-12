package com.StudytestNG.actual;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class actualJGSH {
    WebDriver driver;
    @BeforeMethod
    public void openFirefox(){
        System.setProperty("webdriver.gecko.driver","D:\\IDEA Study\\selenium_one\\drivers\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void case01() throws InterruptedException {
//        登录进入首页
        driver.get("http://192.168.1.109:9527/login");
        driver.findElement(By.name("username")).sendKeys("jgsh");
        driver.findElement(By.name("password")).sendKeys("11111");
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/form/div[5]/div/button")).click();
        Thread.sleep(2000);

//        点击一级模块“服务单派审”
        driver.findElement(By.xpath("//*[@class=\"scrollbar-wrapper el-scrollbar__wrap\"]/div/ul/div[2]/li/div/span")).click();

//        点击二级目录“服务单结果审核”
        driver.findElement(By.xpath("//*[@class=\"scrollbar-wrapper el-scrollbar__wrap\"]/div/ul/div[2]/li/ul/a[1]/li/span")).click();
        Thread.sleep(2000);


//        搜索栏搜索工单并查询
        driver.findElement(By.xpath("//*[@class=\"el-col el-col-12\"]/div/div[1]/div/input")).sendKeys("标题是测试D1201-1222");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@class=\"el-col el-col-12\"]/div/div[2]/button/span")).click();
        Thread.sleep(2000);


//        工单审核（承办办结申请）
//        进入工单详情页
        driver.findElement(By.linkText("标题是测试D1201-1222")).click();
        Thread.sleep(2000);


//         提交疑难工单
        //*[@id="dissatisfied-order-detail"]/div[2]/button[7]/span
        WebElement searchBox03 = driver.findElement(By.xpath("//*[@id=\"dissatisfied-order-detail\"]/div[2]/button[7]/span"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", searchBox03);
        searchBox03.click();
//        疑难工单意见
        driver.findElement(By.xpath("//*[@class=\"el-dialog__body\"]/form/div[5]/div/div/textarea")).sendKeys("疑难工单意见标题是测试D1201-1222");
        driver.findElement(By.xpath("//*[@class=\"el-dialog__body\"]/div/button[2]/span")).click();
        Thread.sleep(2000);

//        弹窗确认
        driver.findElement(By.xpath("//*[@id=\"dissatisfied-order-detail\"]/div[10]/div/div[3]/span/button/span")).click();
    }
    @AfterMethod
    public void closeFirefox() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}
