import java.util.*;
/**
 * problems statement:
 * ----------------------------------------
 * compare the of two hashmap on basis of values 
 * 1 duplicate values are allowed
 * 2 duplicates are not allowed
 * -----------------------------------------
 * 
 * Solution:
 * ---------------------------------------
 * in case duplicates values are allowed use ArrayLIst
 * use hashset if duplicates values are not allowed
 * ---------------------------------------------
 */
public class HashMap_comp_values {
    public static void main(String[] args)
    {
        HashMap<Integer, String> hash1 = new HashMap<Integer, String>();
        HashMap<Integer, String> hash2 = new HashMap<Integer, String>();
        HashMap<Integer, String> hash3 = new HashMap<Integer, String>();
       
       
       hash1.put(1,"A");
       hash1.put(2,"B");
       hash1.put(3,"C");
       
       hash2.put(1, "A");
       hash2.put(2, "C");
       hash2.put(3, "C");
       
        //in case duplicates are not allowed
       System.out.println(new ArrayList<>(hash1.values()).equals(new ArrayList<>(hash2.values())));
       
       //use hashset if duplicates are allowed
       System.out.println(new HashSet<>(hash1.values()).equals(new HashSet<>(hash2.values())));
    
    }
}
