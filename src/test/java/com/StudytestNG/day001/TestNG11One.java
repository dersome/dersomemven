package com.StudytestNG.day001;

/*
    *impo rt org.testng.annotations.Test;//用例编写执行，执行顺序不是从上到下，是根据方法名的ask码
    *import org.testng.annotations.BeforeTest;//所有case执行前，先执行完所有的BeforeTest（相当于信息头管理器）
    *import org.testng.annotations.BeforeMethod;//每个case执行前，先执行一次BeforeMethod(相当于前置处理器)
    *import org.testng.annotations.AfterTest;//所有的case执行完后，最后执行AfterTest
    *import org.testng.annotations.AfterMethod;//每个case执行之后，再执行一次AfterMethod(相当于后置处理器)
 * */

import org.testng.annotations.*;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG11One {
    @BeforeTest     //任何一个方法执行之前必须先执行这个方法,无论BeforeTest在什么位置
    public void beforeTest01(){
        System.out.println("这是@beforeTest注释,BeforeTestcase1");
    }
    @Test
    public void testCase1(){
        System.out.println("这是@Test的注解,testCase1");
    }
    @Test
    public void testCase2(){
      System.out.println("这是@Test的注解,testCase2");
    }
    @BeforeTest
    public void beforeTest02(){
        System.out.println("这是@beforeTest注释,BeforeTestcase2");
    }
    @BeforeMethod
    public void beforeMethod01(){
        System.out.println("这是@beforeMethod注释,BeforeMethodcase1");
    }
    @AfterTest
    public void afterTest01(){
        System.out.println("这是@AfterTset注解，AfterTestcase1");
    }
    @AfterMethod
    public void afterMethod01(){
      System.out.println("这是@AfterMethod注释，AfterMethodcase1");
  }
}
