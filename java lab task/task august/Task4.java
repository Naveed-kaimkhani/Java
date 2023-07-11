import java.util.Scanner;
public class Task4
 {
    public static void main(String[] args)
    {       
        Scanner sc=new Scanner (System.in);
        
        System.out.println("Enter First Distance");
        Double inch1=sc.nextDouble();
        Double feet1=sc.nextDouble();
        
        System.out.println("Enter Second Distance");
        Double inch2=sc.nextDouble();
        Double feet2=sc.nextDouble();

        Double sum__of_inch=inch1+inch2;
        Double sum__of_feet=feet1+feet2;

        while(sum__of_inch>12)
        {
            sum__of_feet++;
            sum__of_inch-=12;
        }
        
        System.out.println("Total Distance is "+sum__of_feet);

        
    }
}
