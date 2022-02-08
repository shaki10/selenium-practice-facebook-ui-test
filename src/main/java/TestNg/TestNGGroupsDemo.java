package TestNg;

import org.testng.annotations.Test;

public class TestNGGroupsDemo {
    
    
    @Test(groups = {"smoke"})
    public void test1(){
        System.out.println("This is Test1");
    }
    
    @Test(groups = {"sanity","smoke"})
    public void test2(){
        System.out.println("This is Test2");
    }
    
    @Test(groups = {"sanity","regresion"})
    public void test3(){
        System.out.println("This is Test3");
    }
    @Test
    public void test4(){
        System.out.println("This is Test4");
    }
    
    @Test(groups = {"regresion"})
    public void test5(){
        System.out.println("This is Test5");
    }
}
