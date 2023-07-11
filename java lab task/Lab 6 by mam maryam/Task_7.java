import java.util.*;
public class Task_7 {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.nextLine();
 
        System.out.println("Student 1");
        String[] student1=str.split(",");
               for(int i=0; i<student1.length; i++)
            {
                if(i==0)
                {
                    System.out.println("Name :"+student1[i]);
                }

                if(i==1)
                {
                    System.out.println("Age :"+student1[i]);
                }

                if(i==2)
                {
                    System.out.println("program :"+student1[i]);
                }
            }
    
        
    }
}
