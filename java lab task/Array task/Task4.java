import java.util.ArrayList;

public class Task4 {
    public static void main(String[] args)
    {
        ArrayList<Integer> Arr =new ArrayList<>(); //resizable array 
        Arr.add(1);
        Arr.add(2);
        Arr.add(3);
        Arr.add(4);
        Arr.add(5);

        System.out.print(Arr+" ");   //printing whole array by just single statement
        System.out.println();


        Arr.set(0,6); //setting 6 at index 0
        System.out.print("Array after set 6 at 0 index "+Arr+ " ");
        System.out.println();//for next line

        Arr.remove(2); //array will shrink after removing 2 (size will reduce automatically)
        System.out.println("After removing 3 "+Arr+" ");


    }
}
