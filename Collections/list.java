package Collections;

import java.util.ArrayList;
import java.util.Iterator;

class User {
    String name;
    long mobile; 
}

public class list {
    public static void main(String[] args) {
        ArrayList<Object> li = new ArrayList<>();
        
        li.add("Narayanan");
        li.add("Guna");  
        li.add(88);

        User u1 = new User();
        u1.name = "Narayanan";
        u1.mobile = 1234567890;

        li.add(u1);
        // li.remove(2);
        li.set(2, 100);

        System.out.println(li);

        System.out.println("~~Using Iterator~~");
        Iterator<Object> itr = li.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        li.clear();
    }
}
