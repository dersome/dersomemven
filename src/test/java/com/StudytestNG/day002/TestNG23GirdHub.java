package com.StudytestNG.day002;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class TestNG23GirdHub {
    @Test
    public void testGrid001() throws InterruptedException, MalformedURLException {
//        创建一个DesiredCapabilities 类型
        DesiredCapabilities dc = DesiredCapabilities.chrome();
//        实例化一个driver
        WebDriver driver = new RemoteWebDriver(new URL("http://192.168.146.1:7777/wd/hub"),dc);
        driver.get("http://www.baidu.com");
        Thread.sleep(5000);
        driver.quit();

//       以上代码跑脚本从GridHub配置的第一台电脑开始，知道第一个node上面的浏览器使用完了，会在第二个node上执行
//        如果想指定那个node上执行脚本时，把hub地址192.168.146.1：5555改成node地址192.168.146.1：6666，后面还是/wd/hub

        }


/*
        ***（重点）数据驱动
    1、兼容性测试选择多个browser
    2、同一个流程不同数据，ef：登录密码正确密码，和正确密码
    */



//        以下代码是为了既能在火狐上跑，又可以在谷歌上跑
    @DataProvider(name = "data4")
    public Object[][] test1() {
        return new Object[][]{
                {"firefox"},
                {"chrome"}};
    }

    @Test(dataProvider = "data4")
    public void testGrid002(String browser) throws InterruptedException, MalformedURLException {
        DesiredCapabilities dc = null;
        if (browser.contentEquals("firefox")) {
            dc = DesiredCapabilities.firefox();
        } else if (browser.equals("chrome")) {
            dc = DesiredCapabilities.chrome();
        } else {
            System.out.println("error");
        }

//        实例化一个driver
        WebDriver driver = new RemoteWebDriver(new URL("http://192.168.146.1:7777/wd/hub"), dc);
        driver.get("http://www.baidu.com");
        Thread.sleep(5000);
        driver.quit();
    }
}
