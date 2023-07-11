import java.util.*;
class java{
    private int[] array=new int[5];
    
    public void set_values()            //method to fill  values in array
    {   Scanner sc=new Scanner(System.in);
        for(int i=0; i<array.length; i++)
        {   
            array[i]=sc.nextInt();
        }
    }

    
    public void even_odd()            //method to populate array values
    {   
        int even=0;
        int odd=0;

        for(int i=0; i<array.length; i++)
        {   
            if(array[i]%2==0)
            {
                even++;
            }
            else
            {
                odd++;
            }
        }
        System.out.println("Even number="+even+"\nOdd number="+odd);
    }

}

public class Task_2 {
    public static void main(String[] args) {
        java obj=new java();
        System.out.println("Enter five integers");
        obj.set_values();
        obj.even_odd();
    }
}
