package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "teach")
public class GroupsOnClass1 {

    public void teach1(){
        System.out.println("GroupsOnClass11111中的teach1运行");
    }

    public void teach2(){
        System.out.println("GroupsOnClass11111中的teach2运行");
    }
}
