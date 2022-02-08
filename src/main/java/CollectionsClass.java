import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionsClass {
    
    public static void main(String[]args) throws Exception{
    
        int values[] = new int[2];
        Object values1[] = new Object[4];
        values1[0] = "shaki";
        values1[1] = 6;
    
    
        Collection Values  = new ArrayList();
        Values.add(3);
        Values.add("shaki");
        Values.add(4.5f);
    
        Iterator i = Values.iterator();
        System.out.println(i.next());
        System.out.println(i.next());
        System.out.println(i.next());
        
    }
}
