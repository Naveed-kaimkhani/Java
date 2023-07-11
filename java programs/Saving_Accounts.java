class accuounts
{
    static public float anunal_interest_rate;
    private int saving_balance;
    
    accuounts(int x)
    {
        saving_balance=x;
    }

    public void cal_mon_interest()
    {
        double profit_per_mon= (saving_balance*anunal_interest_rate)/12;
        saving_balance+=profit_per_mon;
    }
    public static void modify_inter_rate(float AIR)
    {
        anunal_interest_rate=AIR;
    }

    public void show_balance()
    {
        System.out.println("Current balance is "+saving_balance);
    }
}
class c
{

}

public class Saving_Accounts {
    public static void main(String[] args){
        accuounts obj1=new accuounts(2000);
        accuounts obj2=new accuounts(3000);
       obj1.anunal_interest_rate=0.4f;
       obj1.cal_mon_interest();
       obj2.cal_mon_interest();
       obj1.show_balance();
       System.out.println("");
       obj2.show_balance();
       System.out.println(" ");
       obj2.modify_inter_rate(0.5f);
       obj1.show_balance();
       System.out.println("");
       obj2.show_balance();     
    }
}
