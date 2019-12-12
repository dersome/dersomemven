package com.StudytestNG.day003;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGPO001 {
    WebDriver driver;
    @BeforeMethod
    public void openFirefox(){
        /*System.setProperty("webdriver.gecko.driver","D:\\IDEA Study\\selenium_one\\drivers\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();*/
        System.setProperty("webdriver.chrome.driver","D:\\IDEA Study\\selenium_one\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void caseslrl()  {
        driver.get("https://mail.163.com/");
        driver.findElement(TestNG31PO.emailInput).sendKeys("dersome");
        driver.findElement(TestNG31PO.pwdInput).sendKeys("daiwenhua123");
        driver.findElement(TestNG31PO.loginButton).click();
    }

    @AfterMethod
    public void closeFirefox() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}
