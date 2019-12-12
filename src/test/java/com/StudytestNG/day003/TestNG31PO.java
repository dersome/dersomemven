package com.StudytestNG.day003;


import org.openqa.selenium.By;
//      PO（Page-object）理念

public class TestNG31PO {
//    定义email文本框的定位方式
    public static By emailInput = By.name("email");
//    定义密码输入框的定位方式
    public static By pwdInput = By.name("password");
//    定义登录按钮的定位方式
    public static By loginButton = By.id("dologin");

//    去注册
    public static By zhuceButton = By.id("dologin");
}
