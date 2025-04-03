package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "stu")
public class GroupsOnClass3 {

    public void sku1(){
        System.out.println("GroupsOnClass33333中的stu111运行");
    }

    public void sku2(){
        System.out.println("GroupsOnClass33333中的stu222运行");
    }
}
