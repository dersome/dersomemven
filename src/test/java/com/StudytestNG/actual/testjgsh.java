package com.StudytestNG.actual;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class testjgsh {
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
        driver.get("http://dwh123.e2.luyouxia.net:21352/");
        driver.findElement(By.name("username")).sendKeys("jgsh");
        driver.findElement(By.name("password")).sendKeys("11111");
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/form/div[5]/div/button")).click();
        Thread.sleep(2000);

//        点击一级模块“服务单派审”
        driver.findElement(By.xpath("//*[@class=\"scrollbar-wrapper el-scrollbar__wrap\"]/div/ul/div[2]/li/div/span")).click();

//        点击二级目录“服务单结果审核”
        driver.findElement(By.xpath("//*[@class=\"scrollbar-wrapper el-scrollbar__wrap\"]/div/ul/div[2]/li/ul/a[1]/li/span")).click();
        Thread.sleep(2000);

/*

//        类型强制转换
        int b = Integer.valueOf(a);
        Thread.sleep(3000);

*/
        //        首先获取元素焦距,获取最大页码并输入
        WebElement searchBox01 = driver.findElement(By.xpath("//*[@class=\"el-pagination__jump\"]/div/input"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", searchBox01);
        searchBox01.click();
        Thread.sleep(2000);

        //        点击最后一页
//        ***获取最大页码
        String a;
        a = searchBox01.getAttribute("max");
        System.out.println(a);

        WebElement aa = driver.findElement(By.linkText("标题是测试D1201-1222"));
        String b = "标题是测试D1201-1222";
/*        String i;
        while (i == b) {
//      assertEquals方法：校验两个值相等

            Assert.assertEquals(a, "测试D002", "a不等于b");
            System.out.print("上面的语句抛异常后，这段语句不执行"); // 上面的语句不抛异常时执行

        }*/

    }
    @AfterMethod
    public void closeFirefox() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}
