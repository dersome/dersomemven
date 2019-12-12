package com.StudytestNG.day001;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG13Three {
    WebDriver driver;    //相当于new了一个对象，等同于：WebDriver driver = new ChromeDriver();
/*//    未成功
    @Test
    public void openFireFox(){
        System.setProperty("webdriver.firefox.driver","D:\\IDEA Study\\selenium_one\\drivers\\geckodriver.exe");
        WebDriver webdriver = new FirefoxDriver();
    }*/

    @BeforeMethod
    public void openChrome(){
        System.setProperty("webdriver.chrome.driver","D:\\IDEA Study\\selenium_one\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
    }
    @Test
    public void ingChrome() {
        driver.get("http://www.baidu.com");     //浏览器输入百度地址并进入
//        Thread.sleep(2000);     //等待两秒
        driver.navigate().refresh();        //浏览器刷新
//        Thread.sleep(2000);     //等待两秒
        String testurl = driver.getCurrentUrl();
        System.out.println("获取到当前页面的url是："+ testurl);
        Assert.assertEquals(testurl,"https://www.baidu.com/","实际url和期望url不符");
        String testtitle = driver.getTitle();
        System.out.println("获取到当前的title是："+ testtitle);
        Assert.assertEquals(testtitle,"百度一下，你就知道","实际title和期望title不符");
    }
    @AfterMethod
    public void quitChrom(){
        driver.quit();
/*        driver.close();     //只关闭浏览器，未关闭进程*/
    }
}
