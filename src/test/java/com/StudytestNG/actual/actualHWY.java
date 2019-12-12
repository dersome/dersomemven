package com.StudytestNG.actual;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;



public class actualHWY {
    WebDriver driver;
    @BeforeMethod
    public void openChrome(){
        System.setProperty("webdriver.chrome.driver","D:\\IDEA Study\\selenium_one\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }


    @Test
//    话务员进入系统
    public void testCase1() throws InterruptedException {
//        输入IP地址
        driver.get("http://192.168.1.109:9527/login");

//        输入用户名和密码
        driver.findElement(By.name("username")).sendKeys("hwy");
        driver.findElement(By.name("password")).sendKeys("11111");
//        点击登录//*[@id="app"]/div/div/div[2]/form/div[5]/div/button
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/form/div[5]/div/button")).click();
        Thread.sleep(3000);
//        点击登进进入登记页面
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div[2]/section/div/div[1]/div/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/a")).click();
        Thread.sleep(3000);



//        登记表填写服务对象//*[@id="pane-order"]/form/div[1]/div[2]/div/div/div/div/input
        driver.findElement(By.xpath("//*[@id=\"pane-order\"]/form/div[1]/div[2]/div/div/div/div/input")).sendKeys("测试D1128-8002");
        driver.findElement(By.xpath("//*[@id=\"pane-order\"]/form/div[1]/div[3]/div[2]/div/div/div/input")).sendKeys("13000000000");


//        选择诉求类型
//        选中下拉框并点击（未用select方法，直接用页面点击）
//        定位元素target = driver.find_element_by_xxxx()    driver.execute_script("arguments[0].scrollIntoView();", target)
        WebElement aa = driver.findElement(By.xpath("//*[@id=\"pane-order\"]/form/div[1]/div[5]/div[1]/div/div/div/div/input"));
        //        聚焦元素
//        driver.execute_script("arguments[0].scrollIntoView();", aa);
        aa.click();
        Thread.sleep(1000);
//        选中下拉框里面的数据
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/ul/li[2]")).click();
        Thread.sleep(1000);





//        归口类型
        driver.findElement(By.xpath("//*[@id=\"pane-order\"]/form/div[1]/div[5]/div[2]/div/div/div[1]/input")).click();
        Thread.sleep(1000);
//        选中页面里面的数据
        driver.findElement(By.xpath("//*[@id=\"pane-index-0\"]/div/div[1]/div/div[1]/div[2]/label[1]/span[2]")).click();
        Thread.sleep(1000);
//        确认
        driver.findElement(By.cssSelector("body > div.el-dialog__wrapper > div > div.el-dialog__footer > div > button.el-button.el-button--primary.el-button--medium")).click();
//      详细地址
        driver.findElement(By.xpath("//*[@id=\"pane-order\"]/form/div[1]/div[6]/div[2]/div/div/div/input")).sendKeys("测试D1128-8002详细地址");

//        事件发生地（焦距元素）
        WebElement a = driver.findElement(By.xpath("//*[@id=\"pane-order\"]/form/div[1]/div[6]/div[1]/div[3]/div/div/div[1]/input"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", a);
        a.click();
//        driver.findElement(By.xpath("//*[@id=\\\"pane-order\\\"]/form/div[1]/div[6]/div[1]/div[3]/div/div/div[1]/input")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@class=\"el-cascader-menu__wrap el-scrollbar__wrap\"]/ul/li[1]/label/span[1]/span")).click();


//        获取元素焦距(邮箱位置)
/*        WebElement searchBox = driver.findElement(By.xpath("//*[@id=\"pane-order\"]/form/div[1]/div[10]/div[1]/div/div/div/input"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", searchBox);*/


//        标题内容意见

        driver.findElement(By.xpath("//*[@id=\"pane-order\"]/form/div[1]/div[7]/div/div/div/div/input")).click();
        driver.findElement(By.xpath("//*[@id=\"pane-order\"]/form/div[1]/div[7]/div/div/div/div/input")).sendKeys("测试D1128-8002标题");
//        derbiaoti.sendKeys("测试D1128-8002标题");
        driver.findElement(By.xpath("//*[@id=\"pane-order\"]/form/div[1]/div[8]/div/div/div/div/textarea")).sendKeys("测试D1128-8002诉求内容");
//        dersuqiu.sendKeys("测试D1128-8002诉求内容");
        driver.findElement(By.xpath("//*[@id=\"pane-order\"]/form/div[2]/div[6]/div/div/div/div/textarea")).sendKeys("测试D1128-8002处理意见");

//        点击“处理完成”//*[@id="pane-order"]/div[1]/button[2]/span
        driver.findElement(By.xpath("//*[@id=\"pane-order\"]/div[1]/button[2]/span")).click();
//        driver.findElement(By.xpath("/html/body/div[5]/div/div[3]/button[2]/span")).click();
    }


    @AfterMethod
    public void quitChrome() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}
