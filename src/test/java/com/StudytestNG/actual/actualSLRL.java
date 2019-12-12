package com.StudytestNG.actual;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class actualSLRL {
    WebDriver driver;
    @BeforeMethod
    public void openFirefox(){
        System.setProperty("webdriver.gecko.driver","D:\\IDEA Study\\selenium_one\\drivers\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
/*        System.setProperty("webdriver.chrome.driver","D:\\IDEA Study\\selenium_one\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();*/
    }

    @Test
    public void caseslrl() throws InterruptedException {
        driver.get("http://192.168.1.109:9527/login");
//        输入用户名和密码
        driver.findElement(By.name("username")).sendKeys("slrl02");
        driver.findElement(By.name("password")).sendKeys("11111");
//        点击登录//*[@id="app"]/div/div/div[2]/form/div[5]/div/button
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/form/div[5]/div/button")).click();
        Thread.sleep(2000);




//        进入待签收列表
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div[2]/section/div/div[1]/div/div/div[1]/div[1]/div[2]/ul[1]/li[1]/div/div/a/div[1]")).click();
        Thread.sleep(3000);
/*        WebElement searchBox01 = driver.findElement(By.linkText("标题是测试D1201-1218"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", searchBox01);
        searchBox01.click();
        Thread.sleep(2000);*/
//        搜索栏查找工单、
        driver.findElement(By.xpath("//*[@class=\"el-col el-col-12\"]/div/div[1]/div/input")).sendKeys("标题是测试D1201-1218");
        driver.findElement(By.xpath("//*[@class=\"el-button btn-style el-button--primary el-button--medium\"]/span")).click();
        Thread.sleep(2000);

//        进入工单详情页
        driver.findElement(By.linkText("标题是测试D1201-1218")).click();
        Thread.sleep(2000);

//        签收
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div[2]/section/div/div[1]/div/div/div[12]/button[2]/span")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@class=\"el-dialog__wrapper received recived-order last-tooltip\"]/div/div[3]/span/button/span")).click();
        Thread.sleep(3000);


        System.out.println("0000000000000");


/*//        点击承办单位
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div[1]/div[1]/div/ul/div[6]/li/div/span")).click();
        Thread.sleep(2000);*/
//        System.out.println("111111111111");


//        点击待办
        WebElement searchBox02 = driver.findElement(By.xpath("//*[@class=\"scrollbar-wrapper el-scrollbar__wrap\"]/div/ul/div[6]/li/ul/a[8]/li/span"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", searchBox02);
        searchBox02.click();
        Thread.sleep(2000);

        System.out.println("2222222222222");

//        搜索栏查找工单、
        driver.findElement(By.xpath("//*[@class=\"el-input el-input--medium el-input--suffix\"]/input")).sendKeys("标题是测试D1201-1218");
        driver.findElement(By.xpath("//*[@class=\"el-col el-col-12\"]/div/div[2]/button/span")).click();
        Thread.sleep(2000);



//        进入任务单详情页
        WebElement searchBox03 = driver.findElement(By.linkText("标题是测试D1201-1218"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", searchBox03);
        searchBox03.click();
//        driver.findElement(By.linkText("标题是测试D1201-1218")).click();
        Thread.sleep(2000);
//        交办反馈
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div[2]/section/div/div[1]/div/div/div[20]/button[5]/span")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div[2]/section/div/div[1]/div/div/div[7]/div/div[2]/form/div[5]/div/div/textarea")).sendKeys("反馈意见标题是测试D1201-1218");
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div[2]/section/div/div[1]/div/div/div[7]/div/div[2]/form/div[7]/div/button[2]/span")).click();
        Thread.sleep(2000);
//        弹窗确认
        driver.findElement(By.xpath("//*[@class=\"el-dialog__wrapper jbReback\"]/div/div[3]/span/button/span")).click();
        Thread.sleep(2000);

//        处理完成
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div[2]/section/div/div[1]/div/div/div[20]/button[2]/span")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@class=\"total-detail-list router-main el-row\"]/div[2]/div/div[2]/form/div[5]/div/div/textarea")).sendKeys("处理意见是标题是测试D1201-1218");
        driver.findElement(By.xpath("//*[@class=\"el-dialog__body\"]/form/div[7]/div/button[2]/span")).click();
        Thread.sleep(2000);
//        弹窗确定
        driver.findElement(By.xpath("//*[@class=\"total-detail-list router-main el-row\"]/div[10]/div/div[3]/span/button/span")).click();



////        交办下级
//        driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div[2]/section/div/div[1]/div/div/div[20]/button[3]/span")).click();
////        延时申请
//        driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div[2]/section/div/div[1]/div/div/div[20]/button[4]/span")).click();
////        退回上级
//        driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div[2]/section/div/div[1]/div/div/div[20]/button[6]/span")).click();
////        退回下级
//        driver.findElement(By.xpath("")).click();
    }

    @AfterMethod
    public void closeFirefox() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}
