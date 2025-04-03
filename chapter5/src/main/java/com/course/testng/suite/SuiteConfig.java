package com.course.testng.suite;

import org.testng.annotations.*;

public class SuiteConfig {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("this is beforesuite");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("this is aftersuite");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("this is beforetest");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("this is aftertest");
    }

}
