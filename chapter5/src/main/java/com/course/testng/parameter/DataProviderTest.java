package com.course.testng.parameter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

/**
 * 使用DateProvider传数据
 */
public class DataProviderTest {

    @Test(dataProvider = "data")
    public void testDataProvider(String name,int age){
        System.out.println("name="+name+"; age="+age);
    }

    @DataProvider(name="data")
    public Object[][] providerData(){
        Object[][] data = new Object[][]{
                {"zhangsan",10},
                {"lisi",20},
                {"wangwu",50}
        };
        return data;
    }

    //针对不同方法进行相应赋值
    @Test(dataProvider = "methodData")
    public void test1(String name,int age){
        System.out.println("test1111方法 name="+name+"; age="+age);
    }

    @Test(dataProvider = "methodData")
    public void test2(String name,int age){
        System.out.println("test2222方法 name="+name+"; age="+age);
    }

    @DataProvider(name="methodData")
    public Object[][] methodDataTest(Method method){
        Object[][] result = null;

        if(method.getName().equals("test1")){
            result = new Object[][]{
                    {"zhangsan",20},
                    {"lisi",40}
            };
        }else if(method.getName().equals("test2")){
            result = new Object[][]{
                    {"wangwu",22},
                    {"zhaoliu",45}
            };
        }
        return result;
    }
}
