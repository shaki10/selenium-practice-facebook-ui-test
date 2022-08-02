package TestNg;

import org.testng.annotations.*;

public class ChaseHomePage {
    
    @Test(groups = {"smoke"}, priority = 1)
    public void method1() {
        System.out.println("Hi this is method1");
    }
    
    @BeforeTest
    public void method2() {
        System.out.println("Hi I am BeforeTest");
    }
    
    @AfterTest
    public void method3() {
        System.out.println("Hi I am AfterTest");
    }
    
    @BeforeMethod
    public void method4() {
        System.out.println("Hi I am BeforeMethod");
    }
    
    @AfterMethod
    public void method5() {
        System.out.println("Hi I am AfterMethod");
    }
    
    @Test
    public void method6() {
        System.out.println("Hi I am method 6");
    }
    
    @BeforeClass
    public void method7() {
        System.out.println("Hi i am BeforeClass");
    }
    
    @AfterClass
    public void method8() {
        System.out.println("Hi I am AfterClass");
    }
    
    @BeforeGroups(value ="smoke")
    public void method9() {
        
        System.out.println("Hi I am BeforeGroups");
    }
    
    @AfterGroups(value ="regression")
    public void method10() {
        System.out.println("Hi I am AfterGroups");
    }
    
    @BeforeSuite
    public void method11() {
        System.out.println("Hi I am BeforeSuits");
    }
    
    @AfterSuite
    public void method12() {
        System.out.println("Hi I am AfterSuits");
    }
    
    @Test(dataProvider = "method15", groups = {"smoke"})
    public void method13(String a, String b, String c, String d, String e) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println("Hi I am method 13 and worked with data provider");
        
    }
    
    @Test(groups = {"smoke"})
    public void method14() {
        System.out.println("I am method 14: depends on method 13");
    }
    
    @DataProvider
    public Object[][] method15() {
        Object[][] data = new Object[2][5];
        data[0][0] = "firstname";
        data[0][1] = "lastname";
        data[0][2] = "email@gmail.com";
        data[0][3] = "email@gmail.com";
        data[0][4] = "password";
        
        data[1][0] = "firstname2";
        data[1][1] = "lastname2";
        data[1][2] = "email@gmail.com2";
        data[1][3] = "email@gmail.com2";
        data[1][4] = "password2";
        
        System.out.println("I am data provider with return type Object[][]");
        return data;
    }
    
    @AfterGroups("smoke")
    public void method17() {
        
        System.out.println("AfterGroups-smoke");
    }
    
    @BeforeGroups("smoke")
    public void method16() {
        System.out.println("BeforeGroups- smoke");
        
        
    }
    
    @Test(enabled = false, groups = {"smoke"})
    public void method18() {
        System.out.println("I am method18");
    }
    
    @Test(timeOut = 5000, enabled = true, groups = "smoke")
    public void method19() {
        System.out.println("I am method 18");
    }
    
    
    
    
}
