package com.StudytestNG.actual;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class actualCSY {
    WebDriver driver;
    @BeforeMethod
    public void openFirefox(){
        System.setProperty("webdriver.gecko.driver","D:\\IDEA Study\\selenium_one\\drivers\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }


        @Test
//    初审员进入系统
    public void testCase2() throws InterruptedException {
        driver.get("http://192.168.1.109:9527/login");
//        输入用户名和密码
        driver.findElement(By.name("username")).sendKeys("csy");
        driver.findElement(By.name("password")).sendKeys("11111");

//        点击登录//*[@id="app"]/div/div/div[2]/form/div[5]/div/button
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/form/div[5]/div/button")).click();
        Thread.sleep(1000);

//       点击进入待办列表
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div[2]/section/div/div[1]/div/div[1]/div[1]/div[1]/div[2]/div[1]/a")).click();
        Thread.sleep(1000);

//        点击工单
         driver.findElement(By.linkText("测试D1128-8002标题")).click();
         Thread.sleep(2000);

//         交办部门
          driver.findElement(By.xpath("//*[@class=\"scroll-container app-main-wrapper el-scrollbar\"]/div[1]/div/div[1]/div[3]/button[4]/span")).click();
//          主办部门
          driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div[2]/section/div/div[1]/div/div[1]/div[6]/div/div[2]/form/div[2]/div[1]/div/div/div/div/input")).click();
          Thread.sleep(2000);
//          选择主办部门
            WebElement searchBox = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/ul/li[8]/span"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", searchBox);
            searchBox.click();
//            处理意见//*[@id="app"]/div[2]/div[2]/section/div/div[1]/div/div[1]/div[6]/div/div[2]/form/div[3]/div/div/div[1]/textarea
            driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div[2]/section/div/div[1]/div/div[1]/div[6]/div/div[2]/form/div[3]/div/div/div[1]/textarea")).sendKeys("初审交办意见测试D1128-8002");

//            点击确认
            driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/section/div/div[1]/div/div[1]/div[6]/div/div[3]/div/button[2]/span")).click();
        }


@AfterMethod
public void quitChrome() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
        }
}
