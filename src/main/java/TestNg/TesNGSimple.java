package TestNg;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class TesNGSimple {

    @Test
    public void testMethod1(){
        System.out.println("Ran Method1");
    }
    @Test
    public void testMethod2(){
        
        System.out.println("Ran Method2");
    }
    
}
