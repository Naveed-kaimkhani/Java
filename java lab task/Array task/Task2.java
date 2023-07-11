import java.util.*;
public class Task2 {
    public static void main(String[] args)
    {
        String[] str = {"Naveed", "Asim","Faizan"};
        Scanner sc=new Scanner(System.in);
        String search = sc.next();
        sc.close();
        Boolean flag=false;
        for(int i=0; i<str.length; i++)
             {
                     if(search.equals(str[i]))
                      {  
                         System.out.println(search+" found at index "+i);
                         flag=true;
                         break;
        
                        }
                     
            }
            if(flag==false)
            {
                System.out.println(search + " Not found");
            }
}
}