import java.util.ArrayDeque;

/*
 Queue : IN queue every element is add at last and deletion start from the first element
 Deques: means double ended queue its an data structure it allows us to insertion and deletion from both side
 irrespective of starting and ended


 */

 public class Array_Deque
 {
    public static void main(String[] args)
    {
        ArrayDeque<Integer> l1 =new ArrayDeque<>();
        l1.add(3);
        l1.add(4);
        l1.add(5);
        System.out.println(l1);

        l1.addFirst(100);   //adding 100 at start
        //System.out.println(l1);
        
        l1.addLast(200);  //adding at last
        //System.out.println(l1);
        
        l1.removeFirst();
        l1.removeLast();
        //System.out.println(l1);
        

    }
 }