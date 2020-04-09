package com.course.testng.paramter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DateProviderTest {
    @Test(dataProvider = "date")
    public void testDateProvider(String name,int age){
        System.out.println("name="+name+";age="+age);
    }
    @DataProvider(name="date")
    public Object[][] provierDate(){
        Object[][] o =new Object[][]{
                {"张三",10},
                {"李四",20},
                {"王五",30}
        };
        return o;
    }
    @Test(dataProvider ="methodData")
    public void test1(String name,int age){
        System.out.println("test1111方法 name="+name+";age="+age);
    }
    @Test(dataProvider="methodData")
    public void test2(String name,int age){
        System.out.println("test2222方法 name="+name+";age="+age);
    }
    @DataProvider(name="methodData")
    public Object[][] methodDataTest(Method method){
        Object[][] result=null;
        if (method.getName().equals("test1")){
            result=new Object[][]{
                    {"zhagnsan",20},
                    {"lisi",25}
            };
        }else if(method.getName().equals("test2")){
            result=new Object[][]{
                    {"wangwu",50},
                    {"zhaoliu",60}
            };
        }
        return result;
    }
}
