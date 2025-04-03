package com.course.testng;

import org.testng.annotations.*;

public class BasicAnnotation {

    @Test
    public void testCase1(){
        System.out.println("this is testcase1");
    }

    @Test
    public void testCase2(){
        System.out.println("this is testcase2");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("this is beforemethod");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("this is aftermethod");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("this is beforeclass");
    }

    @AfterClass
    public void aferClass(){
        System.out.println("this is afterclass");
    }
}
