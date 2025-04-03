package com.course.testng.multiThread;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultiThreadOnXml {

    @Test
    @Parameters({"testTag"})
    public void test1(String testTag){
        System.out.printf(testTag+"测试标签下的test1执行的Thread id: %s%n", Thread.currentThread().getId());
    }

    @Test
    @Parameters({"testTag"})
    public void test2(String testTag){
        System.out.printf(testTag+"测试标签下的test2执行的Thread id: %s%n", Thread.currentThread().getId());
    }

    @Test
    @Parameters({"testTag"})
    public void test3(String testTag){
        System.out.printf(testTag+"测试标签下的test3执行的Thread id: %s%n", Thread.currentThread().getId());
    }
}
