/**
 * how to synchronized arraylist in java?
 * there are two ways to synchronized arraylist 
 *  Collection.Synchronizedlist()
 * copyOnWriteArrayList         //its an variant form of arraylist
 * 
 * when adding and removing values we dont need synchronization
 * its needed when to travers the values
 */
import java.util.*;
import java.util.ArrayList;

public class Synchronized_list {
    public static void main(String[] args)
    {
   /*   Synchronization by Collections.synchronizecd method 
       List<Integer> arr1 = Collections.synchronizedList(new ArrayList<Integer>());
        arr1.add(2);
        arr1.add(3);
        arr1.add(4);

        synchronized(arr1){
            Iterator<Integer> it = arr1.iterator();
            while(it.hasNext())
            {
                System.out.println(it.next());
            }
        }
    */

        //Synchronization by using copyonwriteArrayList which is a builtin class
        //and also called synchrozied arraylist

        CopyOnWriteArrayList<Integer> mylist = new CopyOnWriteList<Integer>();
        CopyOnWriteArrayList<Integer> mylist = new CopyOnWriteArrayList<Integer>();
    }
}
