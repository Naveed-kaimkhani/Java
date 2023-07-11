import java.util.Scanner;

class Solution
{
    
        String item_no;
        String name;
        int Quantity;
        double pri_per_item;

        public Solution()
        {
            item_no="";
            name="";
            pri_per_item=0;
            Quantity=0;
        }
        void setdata(String nu, String n, int pi,int q)
        {
            item_no=nu;
            name=n;
            pri_per_item=pi;
            Quantity=q;
        }
        double invoice()
        {
            System.out.println("item no     "+item_no);
            System.out.println("name        "+name);
            System.out.println("price per item      "+pri_per_item);
            System.out.println("Quantity        "+Quantity);
            double total=Quantity*pri_per_item;
            System.out.println("Your total is ");
            return total;           
        }
    
}
public class Invoice
{
    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name");
        String na=sc.next();
        System.out.println("Enter No");
        String num=sc.next();
        System.out.println("Enter price ");
        int pri=sc.nextInt();
        System.out.println("Enter Quantity");
        int Qua=sc.nextInt();
        Solution obj=new Solution();
        obj.setdata(num,na,pri,Qua);
        System.out.println(obj.invoice()); 
    }
}