package com.StudytestNG.day002;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG24DataDriver {
    @DataProvider(name = "loginCase")
    public Object[][] data001(){
        return new Object[][]{
                {"user01","pwd01"},
                {"user02","pwd02"}
        };
    }

    @Test(dataProvider = "loginCase")
    public void loginTest(String user,String pwd){
        System.out.println("user="+user);
        System.out.println("pwd="+pwd);
    }
}
