package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsOnMethod {

    @Test(groups = "server")
    public void test1(){
        System.out.println("服务端组11111");
    }

    @Test(groups = "server")
    public void test2(){
        System.out.println("服务端组22222");
    }

    @Test(groups = "client")
    public void test3(){
        System.out.println("客户端组11111");
    }

    @Test(groups = "client")
    public void test4(){
        System.out.println("客户端组22222");
    }

    @BeforeGroups("server")
    public void beforeGroupsOnServer(){
        System.out.println("在服务端组之前运行的方法1111111");
    }

    @AfterGroups("server")
    public void adterGroupsOnServer(){
        System.out.println("在服务端组之后运行的方法222222");
    }
}
