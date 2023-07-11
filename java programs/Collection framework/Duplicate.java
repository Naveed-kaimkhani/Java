
import java.util.*;
import java.util.ArrayList;
public class Duplicate {
    public static void main(String[] args)
    {
      //  ArrayList<Integer> arr=new ArrayList<Integer>(Arrays.asList(1,1,2,2,3,3));
        // ArrayList<Integer> arr=new ArrayList<Integer>(Arrays.asList(1,2,2,3,4,3,4));
        // LinkedHashSet<Integer> arr2 = new LinkedHashSet<Integer>(arr);
        // ArrayList<Integer> arr3=new ArrayList<Integer>(arr2);
        // System.out.println(arr3);

        List<Integer> mylist= arr.stream().distinct().collect(Collector.toList());
        System.out.println(mylist);

          // LinkedHashSet<Integer> arr2 = new LinkedHashSet<Integer>(arr);
          // ArrayList<Integer> mylist = new ArrayList<Integer>(arr2);
            

      }

}
