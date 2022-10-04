package main.java.com.qa;

import java.util.ArrayList;
import java.util.List;

// The collections interface provides an alternative to using Arrays which is more simplistic and uses less memory
// From the collections interface, three other interfaces are extended directly:
// Sets - makes no changes and simply implements Collections
// Lists - allows for non-unique values in a collection, as well as sorting a shuffling
// Queue - places importance on the order of items, and uses first-in first-out rule implementations

public class Collections {
    
    public static void ArrayLists(){
        List<Object> list = new ArrayList<>();
        Object dog = new Object();
        Object book = new Object();
        list.add(dog);
        list.add(book);
        System.out.println(list);
    }

}
