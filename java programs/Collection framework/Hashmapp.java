import java.util.HashMap;
import java.util.*;
/**
Hashmap extends Map interface 
* Hashmap is an data structure that does not maintain order 
 * it saves the values on the basis of key values pair
 * we can store n null values but only one null key value
 * hashmap is not synchronized/thread safe
 */

public class Hashmapp {
    public static void main(String[] args)
    {
        HashMap<String , String > hash = new HashMap<String, String>();
        hash.put("pak","islamabad");
        hash.put("india","new delhi");

        // System.out.println(hash.get("india"));
        // System.out.println(hash.get("pak"));
        
        Iterator<String>it=hash.keySet().iterator();
        while(it.hasNext())
        {   String key=it.next();
            String value=hash.get(key);
            System.out.println("key="+key+" values="+value);
        }
    }
}
