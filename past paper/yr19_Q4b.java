import javax.swing.plaf.basic.BasicTreeUI.TreeCancelEditingAction;

class insufficentbalance extends Exception
{
     insufficentbalance(String s)
    {
        super(s);
    }
}

class bank
{
    int balance=0;

    public void deposit(int depo)
    {
        balance+=depo;
    }

    
    public void withdraw(int draw)
    {
       try {
           if(balance<draw)
           {
               throw new insufficentbalance("balance is less than entered amount");
           }
           else{
            balance-=draw;
           System.out.println("new balance is "+balance);
           }
           
       } catch (insufficentbalance e) {
           //TODO: handle exception
           System.out.println(e.getMessage());
       }
    }
}

public class yr19_Q4b {
    public static void main(String[] args) {
    bank obj=new bank();
    obj.deposit(50);
    obj.withdraw(100);        

    }    
}
