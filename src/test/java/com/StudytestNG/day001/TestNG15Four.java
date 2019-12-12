package com.StudytestNG.day001;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG15Four {
    WebDriver driver;
    @BeforeMethod
    public void openChrome(){
        System.setProperty("webdriver.chrome.driver","D:\\IDEA Study\\selenium_one\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
    }
    @Test
    public void byIDTset(){
        driver.get("http://192.168.1.109:9527/login");
        driver.findElement(By.id("su"));        //用id获取元素
    }
    @AfterMethod
    public void quitChrome(){
        driver.quit();
    }
}
/*//        页面截图代码，未成功
    public void shotTset(){
        File testFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(File,new File("D:/jietu.png"));
        }catch (IOException e){
            e.printStackTrace();
        }
    }*/
