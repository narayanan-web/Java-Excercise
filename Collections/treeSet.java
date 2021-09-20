package Collections;

import java.util.Iterator;
import java.util.TreeSet;

public class treeSet {
    public static void main(String[] args) {
        TreeSet<Object> ts = new TreeSet<>();

        ts.add("Phoenix");
        ts.add("Saltie & Tamil");
        ts.add("Abi");
        ts.add("Kavin");
        ts.add("Keerthi");
        ts.add("Kavin");
        // ts.add(23);
        
        System.out.println(ts);
        
        Iterator<Object> it = ts.iterator(); 
        while (it.hasNext()) {
            System.out.println(it.next());            
        }
    }
    
}