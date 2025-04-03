package com.course.testng.multiThread;

import org.testng.annotations.Test;

public class MultiThreadTest {

    @Test(invocationCount = 10,threadPoolSize = 3)  //10次测试调用会分配到3个线程中并发执行
    public void test(){
        System.out.println(1);
        System.out.printf("Thread id: %s%n", Thread.currentThread().getId());
    }
}
