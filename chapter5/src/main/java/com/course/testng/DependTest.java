package com.course.testng;

import org.testng.annotations.Test;

/**
 * 依赖测试
 * @Test(dependsOnMethods = {"test1"})：test1作为test2的前置条件，执行test2之前必先执行test1
 * 执行test2时，若test1执行失败，则test2会被跳过不再执行
 */
public class DependTest {

    @Test
    public void test1(){
        System.out.println("test1 run");
        throw new RuntimeException();
    }

    @Test(dependsOnMethods = {"test1"})
    public void test2(){
        System.out.println("test2 run");
    }
}
