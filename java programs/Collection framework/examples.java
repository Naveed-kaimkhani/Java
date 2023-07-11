import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;
class examples
{
    public static void main(String[] args)
    {                   //Synchronized arraylist
        // List<Integer> arr = Collections.synchronizedList(new ArrayList<Integer>());
        // //Synchronized arryalist using collection.synchronized

        // CopyOnWriteArrayList<Integer> arr2= new CopyOnWriteArrayList<Integer>(); 
        // //Synchronized arryalist using CopyOnWriteArrayList


        //removed duplicates values
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(2);
        arr.add(2);
        arr.add(4);

        //it will a arraylist without duplicates values
        List<Integer> arr1 = arr.stream().distinct().collect(Collectors.toList());
        System.out.println(arr1);

    }
}