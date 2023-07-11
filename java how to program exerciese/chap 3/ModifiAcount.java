import java.util.Scanner;

class Acount{
    private int amount;
    public Acount(int a)
    {
        amount=a;
    }
    
    public void  withdraw()
    {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter to be withdraw");
        int draw=sc.nextInt();
        if(draw>amount)
        {
            System.out.println("Withdrawal amount exceed current balance");
        }
        else
        {
            amount-=draw;
            System.out.println("transaction done");
            System.out.println("Your new balace is "+amount);
        }
    }
}



public class ModifiAcount
{
    
    public static void main(String[] args)
    {
        Acount obj1 = new Acount(5000);
        obj1.withdraw();
    }
}