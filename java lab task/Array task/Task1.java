import java.util.*;
public class Task1
{
    public static void main(String[] args)
    {
        String[] str = {"Naveed", "Asim","Faizan"};
        
       for(int i=0; i<str.length; i++)
            {
                for(int j=0; j<str.length-1-i; j++)
                {
                    if(str[i].compareTo(str[j+1])>0) //comparing string lexographically
                    {   String temp;
                        temp=str[i];
                        str[i]=str[j+1];
                        str[j+1]=temp;
                    }
                   
                }
            }

            System.out.println(Arrays.toString(str)); //To print array in a single statement
                 
    }

}