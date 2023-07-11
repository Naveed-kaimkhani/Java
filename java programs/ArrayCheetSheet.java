import java.util.Arrays;
public class ArrayCheetSheet
{
    public static void main(String[] args){
        int [] arr={1,3,4,2,5};
        int [] arr2={1,4,2,5};
        
        //Arrays.binarySearch it will check if the element is present or not in an array
         System.out.println(Arrays.binarySearch(arr, 3));
        
        //Arrays.copyof method
        int [] array=Arrays.copyOf  (arr,10);
        for (int i : array) {
           System.out.println(i);
        }

        //copyOfRange 
        System.out.println(Arrays.toString(Arrays.copyOfRange(arr,1,3)));

            //deepequalmethod
           System.out.println(Arrays.deepEquals(arr, arr2));
    }
}