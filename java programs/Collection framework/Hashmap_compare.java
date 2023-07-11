import java.util.*;
import java.util.HashMap;

/**
 * Problem:
 * ------------------------------------
 * make 2 hashmap 
 * add the keys of both in a hashset
 * print the distinct key
 * 
 * solution:
 * ------------------------------------------
 * first make 2 hashmap 
 * then make a hashset and initialize the constructor with keys of 1st one
 * use the object of hashset to call  addall method and pass keys of 2nd hashmap
 * use removeall method to find only distinct keys
 * --------------------------------------------
 */
public class Hashmap_compare {
    public static void main(String[] args)
    {
        HashMap<Integer, String> hash1 = new HashMap<Integer, String>();
        HashMap<Integer, String> hash2 = new HashMap<Integer, String>();
        HashMap<Integer, String> hash3 = new HashMap<Integer, String>();
       
        //step1
       hash1.put(1,"A");
       hash1.put(2,"C");
       hash1.put(3,"D");
       hash1.put(3,"E");
    
       hash2.put(1, "A");
       hash2.put(2, "B");
       hash2.put(3, "C");
       hash2.put(4, "D");
        
       
       hash3.put(1,"A");
       hash3.put(2,"C");
       hash3.put(3,"D");
       hash3.put(3,"E");
       //step2
        HashSet<Integer> addkeys = new HashSet<Integer>(hash1.keySet());
        addkeys.addAll(hash2.keySet());//it will add the keys of both hashmap
        System.out.println(addkeys);

        //step3
        addkeys.removeAll(hash3.keySet());
        System.out.println(addkeys);


        
    }
}
