package com.StudytestNG.day002;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.testng.annotations.Test;

public class TestNG22Phantomjs {
//    Phantomjs是非页面显示的脚本，只跑代码，没有任何显示
    @Test
    public void pjsTest() throws InterruptedException {
        System.setProperty("phantomjs.binary.path","D:\\IDEA Study\\selenium_one\\drivers\\phantomjs.exe");
        WebDriver driver = new PhantomJSDriver();
        driver.get("http://www.baidu.com");
        driver.findElement(By.id("kw")).sendKeys("testNG");

        Thread.sleep(2000);
        String a = driver.getTitle();

        System.out.println(a);
        driver.quit();
    }
}
