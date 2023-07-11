import java.util.*;
public class Array_List {
    public static void main(String[] args)
    {
        ArrayList<Integer> l1=new ArrayList<>();
        //System.out.println(l1.size());
         l1.add(2);
        
         l1.add(0,3);
         l1.add(7);
        
        //l1.remove(1);
        //l1.set(0,3);
        //l1.get(0);
       // l1.ensureCapacity(3); it can be resize later once you created
        System.out.println(l1);
        l1.sort(Comparator.naturalOrder());
        System.out.println(l1);
    }
}
