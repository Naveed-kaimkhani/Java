class Lamp
{
    boolean state;
    public void Switch_ON()
    {
        state=true;
    }

    public void Switch_OFF()
    {
        state=false;
    }

    public void checkstate()
    {
        if(state==true)
        {
            System.out.println("lamp is switched on");
        }

        
        if(state==false)
        {
            System.out.println("lamp is switched off");
        }
    }


}



public class Task1
{
    public static void main(String[] args)
    {
        Lamp obj =new Lamp();
        obj.Switch_ON();
        obj.checkstate();
        
        System.out.println("");

        obj.Switch_OFF();
        obj.checkstate();
        

    }
}