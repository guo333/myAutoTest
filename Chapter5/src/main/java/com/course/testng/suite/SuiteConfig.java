package com.course.testng.suite;

import org.testng.annotations.*;

public class SuiteConfig {
    @BeforeSuite
    public  void beforeSuite(){
        System.out.println("before Suite运行啦！");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("after Suite运行啦！");
    }
    @BeforeTest
    public void beforetest(){
        System.out.println("beforeTest");
    }
    @AfterTest
    public void aftertest(){
        System.out.println("afterTest");
    }
}
