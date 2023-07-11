/**
Hasshing techniqe : makes searching and insertion fast 
in hashing we works with key values and indexes
hashset provides a function hash that defines which kv store on whcih index
hashing function : f(x)= x % size of array
if the size of araay is 5 and kv is 12 then 12 will store on index 2 
But there is a fault with hasing what  if 2 values carring same index number this situation called collision
to avoid collision we have open addressing teachnique and we can store values next of that index  
*/
import java.util.*;
public class set  {
    
    public static void main(String[] args){
        HashSet<Integer> l1 = new HashSet<>();
        l1.add(2);
        l1.add(3);
        l1.add(5);
        l1.add(5);
        System.out.println(l1); //hashset provides fast searching
    }
}
