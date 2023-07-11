import java.util.Scanner;
public class Task_1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("whats your first name");
        String name=sc.next();

        System.out.println("whats your last name");
        String last=sc.next();

        System.out.println(name+" "+last);
    }
}