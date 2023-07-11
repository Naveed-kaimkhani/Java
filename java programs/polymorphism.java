interface TvRemote
{   
    void simpletv();
}
interface SmartTv 
{
    void SmartT();
}
class Tv implements TvRemote,SmartTv    //this is called multiple inheritance
{
    public void simpletv()
    {
        System.out.println("remote of an simple tv");
    }
    public void SmartT()
    {
        System.out.println("Remote of an smart tv");
    }

}

public class polymorphism {
    public static void main(String [] args)
    {
        Tv ojb=new Tv();
        ojb.SmartT();
        ojb.simpletv();
    }
}
