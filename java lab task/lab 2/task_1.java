import java.util.Scanner;
public class task_1     
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();         //Taking input
        System.out.println(s);
        sc.close();
        System.out.println(s.charAt(0));    //charAt function return the 0 index of string
    }
}