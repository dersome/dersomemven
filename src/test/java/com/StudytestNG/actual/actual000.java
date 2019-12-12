package com.StudytestNG.actual;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class actual000 {
    WebDriver driver;
    @BeforeMethod
    public void openFirefox(){
        System.setProperty("webdriver.gecko.driver","D:\\IDEA Study\\selenium_one\\drivers\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void case001hwy() throws InterruptedException {
//        输入IP地址
        driver.get("http://192.168.1.109:9527/login");
//        输入用户名和密码
        driver.findElement(By.name("username")).sendKeys("hwy");
        driver.findElement(By.name("password")).sendKeys("11111");
//        点击登录//*[@id="app"]/div/div/div[2]/form/div[5]/div/button
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/form/div[5]/div/button")).click();
        Thread.sleep(2000);

//        点击登进进入登记页面
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div[2]/section/div/div[1]/div/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/a/div/img")).click();
        Thread.sleep(2000);


//        登记表填写服务对象//*[@id="pane-order"]/form/div[1]/div[2]/div/div/div/div/input
        driver.findElement(By.xpath("//*[@id=\"pane-order\"]/form/div[1]/div[2]/div/div/div/div/input")).sendKeys("测试D1205-8001");
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
        driver.findElement(By.xpath("//*[@id=\"pane-order\"]/form/div[1]/div[6]/div[2]/div/div/div/input")).sendKeys("测试D1205-8001详细地址");

//        事件发生地
        WebElement a = driver.findElement(By.xpath("//*[@id=\"pane-order\"]/form/div[1]/div[6]/div[1]/div[3]/div/div/div[1]/input"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", a);
        a.click();
//        driver.findElement(By.xpath("//*[@id=\\\"pane-order\\\"]/form/div[1]/div[6]/div[1]/div[3]/div/div/div[1]/input")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@class=\"el-cascader-menu__wrap el-scrollbar__wrap\"]/ul/li[1]/label/span[1]/span")).click();


//        获取元素焦距()
/*        WebElement searchBox = driver.findElement(By.xpath("//*[@id=\"pane-order\"]/form/div[1]/div[10]/div[1]/div/div/div/input"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", searchBox);*/


//        标题内容意见
        driver.findElement(By.xpath("//*[@id=\"pane-order\"]/form/div[1]/div[7]/div/div/div/div/input")).click();
        driver.findElement(By.xpath("//*[@id=\"pane-order\"]/form/div[1]/div[7]/div/div/div/div/input")).sendKeys("测试D1205-8001标题");
        driver.findElement(By.xpath("//*[@id=\"pane-order\"]/form/div[1]/div[8]/div/div/div/div/textarea")).sendKeys("测试D1205-8001诉求内容");
        driver.findElement(By.xpath("//*[@id=\"pane-order\"]/form/div[2]/div[6]/div/div/div/div/textarea")).sendKeys("测试D1205-8001处理意见");

//        点击“处理完成”//*[@id="pane-order"]/div[1]/button[2]/span
        driver.findElement(By.xpath("//*[@id=\"pane-order\"]/div[1]/button[2]/span")).click();
//       点击确认
        driver.findElement(By.xpath("/html/body/div[5]/div/div[3]/button[2]/span")).click();
    }

    @Test
    public void case002csy() throws InterruptedException {
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
        driver.findElement(By.linkText("测试D1205-8001标题")).click();
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
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div[2]/section/div/div[1]/div/div[1]/div[6]/div/div[2]/form/div[3]/div/div/div[1]/textarea")).sendKeys("初审交办意见测试D1205-8001");

//            点击确认
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/section/div/div[1]/div/div[1]/div[6]/div/div[3]/div/button[2]/span")).click();
    }

    @Test
    public void case003slrl() throws InterruptedException {
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
            driver.findElement(By.xpath("//*[@class=\"el-col el-col-12\"]/div/div[1]/div/input")).sendKeys("标题是测试D1205-8001");
            driver.findElement(By.xpath("//*[@class=\"el-button btn-style el-button--primary el-button--medium\"]/span")).click();
            Thread.sleep(2000);

//        进入工单详情页
            driver.findElement(By.linkText("标题是测试D1205-8001")).click();
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
            driver.findElement(By.xpath("//*[@class=\"el-input el-input--medium el-input--suffix\"]/input")).sendKeys("标题是测试D1205-8001");
            driver.findElement(By.xpath("//*[@class=\"el-col el-col-12\"]/div/div[2]/button/span")).click();
            Thread.sleep(2000);



//        进入任务单详情页
            WebElement searchBox03 = driver.findElement(By.linkText("标题是测试D1205-8001"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", searchBox03);
            searchBox03.click();
//        driver.findElement(By.linkText("标题是测试D1201-1218")).click();
            Thread.sleep(2000);
//        交办反馈
            driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div[2]/section/div/div[1]/div/div/div[20]/button[5]/span")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div[2]/section/div/div[1]/div/div/div[7]/div/div[2]/form/div[5]/div/div/textarea")).sendKeys("反馈意见标题是测试D1205-8001");
            driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div[2]/section/div/div[1]/div/div/div[7]/div/div[2]/form/div[7]/div/button[2]/span")).click();
            Thread.sleep(2000);
//        弹窗确认
            driver.findElement(By.xpath("//*[@class=\"el-dialog__wrapper jbReback\"]/div/div[3]/span/button/span")).click();
            Thread.sleep(2000);

//        处理完成
            driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div[2]/section/div/div[1]/div/div/div[20]/button[2]/span")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@class=\"total-detail-list router-main el-row\"]/div[2]/div/div[2]/form/div[5]/div/div/textarea")).sendKeys("处理意见是标题是测试D1205-8001");
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
    
    @Test
    public void case004jgsh() throws InterruptedException {
        //        登录进入首页
        driver.get("http://192.168.1.109:9527/login");
        driver.findElement(By.name("username")).sendKeys("jgsh");
        driver.findElement(By.name("password")).sendKeys("11111");
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/form/div[5]/div/button")).click();
        Thread.sleep(2000);

//        点击一级模块“服务单派审”
        driver.findElement(By.xpath("//*[@class=\"scrollbar-wrapper el-scrollbar__wrap\"]/div/ul/div[2]/li/div/span")).click();

//        点击二级目录“服务单结果审核”
        driver.findElement(By.xpath("//*[@class=\"scrollbar-wrapper el-scrollbar__wrap\"]/div/ul/div[2]/li/ul/a[1]/li/span")).click();
        Thread.sleep(2000);


//        搜索栏搜索工单并查询
        driver.findElement(By.xpath("//*[@class=\"el-col el-col-12\"]/div/div[1]/div/input")).sendKeys("标题是测试D1205-8001");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@class=\"el-col el-col-12\"]/div/div[2]/button/span")).click();
        Thread.sleep(2000);


//        工单审核（承办办结申请）
//        进入工单详情页
        driver.findElement(By.linkText("标题是测试D1205-8001")).click();
        Thread.sleep(2000);


//         提交疑难工单
        //*[@id="dissatisfied-order-detail"]/div[2]/button[7]/span
        WebElement searchBox03 = driver.findElement(By.xpath("//*[@id=\"dissatisfied-order-detail\"]/div[2]/button[7]/span"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", searchBox03);
        searchBox03.click();
//        疑难工单意见
        driver.findElement(By.xpath("//*[@class=\"el-dialog__body\"]/form/div[5]/div/div/textarea")).sendKeys("疑难工单意见标题是测试D1205-8001");
        driver.findElement(By.xpath("//*[@class=\"el-dialog__body\"]/div/button[2]/span")).click();
        Thread.sleep(2000);

//        弹窗确认
        driver.findElement(By.xpath("//*[@id=\"dissatisfied-order-detail\"]/div[10]/div/div[3]/span/button/span")).click();

    }

    @Test
    public void case005zsy() throws InterruptedException {
//        地址、账号、密码，并登录
            driver.get("http://192.168.1.109:9527/login");
            driver.findElement(By.name("username")).sendKeys("zsy");
            driver.findElement(By.name("password")).sendKeys("11111");
            driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/form/div[5]/div/button")).click();
            Thread.sleep(2000);

//        点击一级模块“服务单派审”
            driver.findElement(By.xpath("//*[@class=\"scrollbar-wrapper el-scrollbar__wrap\"]/div/ul/div[2]/li/div/span")).click();
            Thread.sleep(2000);
//        点击二级模块“待办服务单”
            driver.findElement(By.xpath("//*[@class=\"scrollbar-wrapper el-scrollbar__wrap\"]/div/ul/div[2]/li/ul/a[1]/li/span")).click();
            Thread.sleep(2000);

//        搜索栏所有工单，并查询
            driver.findElement(By.xpath("//*[@class=\"el-input el-input--medium el-input--suffix\"]/input")).sendKeys("标题是测试D1205-8001");
            driver.findElement(By.xpath("//*[@class=\"el-icon-search\"]")).click();
            Thread.sleep(2000);

//        击进入工单详情页
            driver.findElement(By.linkText("标题是测试D1205-8001")).click();
            Thread.sleep(2000);

//        点击退回
            driver.findElement(By.xpath("//*[@id=\"wait-for-handle-detail\"]/div[2]/button[2]/span")).click();
            Thread.sleep(2000);

//        退回下拉框焦距元素
            WebElement searchBox01 = driver.findElement(By.xpath("//*[@id=\"wait-for-handle-detail\"]/div[3]/div/div[2]/form/div[1]/div/div/div[1]/input"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", searchBox01);
            searchBox01.click();

/*
//        选择退回原因下拉框
        driver.findElement(By.xpath("://[@class=\"el-input el-input--medium el-input--suffix\"]/input")).click();
*/
            Thread.sleep(2000);
//        选择退回原因
            driver.findElement(By.xpath("//*[@class=\"el-popup-parent--hidden\"]/div[3]/div[1]/div[1]/ul/li[1]/span")).click();
//        填写退回描述
            driver.findElement(By.xpath("//*[@class=\"el-dialog__body\"]/form/div[2]/div/div/textarea")).sendKeys("标题是测试D1205-8001");
            driver.findElement(By.xpath("//*[@class=\"el-dialog__body\"]/div/button[2]/span")).click();
            Thread.sleep(2000);

//        弹窗点击确认
            driver.findElement(By.xpath("//*[@class=\"el-message-box__btns\"]/button/span")).click();
    }
    @AfterMethod
    public void closeFirefox() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}
