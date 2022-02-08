package listners.Ireport;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ReporterManager.class)
public class IReporterTest {

    @Test
    public void test1(){
        int a = 2/0;
        System.out.println("I am test one");
    }
    
    @Test
    public void test2(){
        System.out.println("I want to try this");
        Assert.assertEquals(2,3);
    }
    @Test
    public void test3(){
        System.out.println("I am test three");
        throw new SkipException("skip this test");
    }
    @Test
    public void test4(){
        System.out.println("I am test four");
    }
    @Test
    public void test5(){
        System.out.println("I am test five");
    }
    
    
    
    
}
