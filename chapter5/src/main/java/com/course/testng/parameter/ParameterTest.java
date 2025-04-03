package com.course.testng.parameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * 通过xml文件传参（parameter.xml）
 */
public class ParameterTest {

    @Test
    @Parameters({"name","age"})
    public void paramTest1(String name,int age){
        System.out.println("name="+name+"; age="+age);
    }
}
