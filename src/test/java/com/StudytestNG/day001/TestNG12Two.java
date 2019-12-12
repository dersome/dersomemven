package com.StudytestNG.day001;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG12Two {
//    校验 a == a；
    @Test
    public void testEquals () {
        String a = "asd";
        String b = "asdf";
//        java脚本的校验方法
/*        if(a.equals(b)){
            System.out.println("正确");
        }else{
            System.out.println("错误");
        }*/
//      assertEquals方法：校验两个值相等
        Assert.assertEquals(a,b,"a不等于b");
        System.out.print("上面的语句抛异常后，这段语句不执行"); // 上面的语句不抛异常时执行
    }
    @Test
//    assertEquals方法：校验两个值相等
    public void testNotEquals(){
        String a = "aa";
        String b = "aa";
        Assert.assertNotEquals(a,b,"a等于b");
    }
    @Test
    public void testNull(){
        String a = "aa";
        Assert.assertNull(a,"a不是空值");
    }
    @Test
    public void testNotNull(){
        String a = null;
        Assert.assertNotNull(a,"a是空值");
    }
}
