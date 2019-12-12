package com.StudytestNG.day002;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG21JS {
        WebDriver driver;
        @BeforeMethod
        public void openChrome(){
            System.setProperty("webdriver.chrome.driver","D:\\IDEA Study\\selenium_one\\drivers\\chromedriver.exe");
            driver = new ChromeDriver();
        }
/*//        火狐启动成功
        public void openFireFox(){
            System.setProperty("webdriver.gecko.driver","D:\\IDEA Study\\selenium_one\\drivers\\geckodriver.exe");
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
        }*/
        /*//    火狐启动未成功
    public void openFireFox(){
        System.setProperty("webdriver.firefox.driver","D:\\IDEA Study\\selenium_one\\drivers\\geckodriver.exe");
        WebDriver webdriver = new FirefoxDriver();
    }*/


        @Test
//    js的使用
        public void testCase2() {
            driver.get("http://www.baidu.com/");
//            强制转换driver的类型
            JavascriptExecutor js = (JavascriptExecutor)driver;
//            用id查找输入框，并在输入框输入testNG
//            document.getElementById("kw").setAttribute("value","testNG")
//            undefined
            js.executeAsyncScript("document.getElementById(\"kw\").setAttribute(\"value\",\"testNG\")");
        }


        @AfterMethod
        public void quitChrome() throws InterruptedException {
            Thread.sleep(2000);
            driver.quit();
        }
}
