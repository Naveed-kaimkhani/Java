class Base
{
    private int n;
    Base()
    {
        n=12;
        System.out.println("Contructor of base class with n value "+n);
    }
  
    Base(int x,int y)
    {
        System.out.println("the value of x and y is "+x+" "+y);
    }

}


class Derived extends Base
{
    private int m;
    Derived()
    {   super(2,3);
        System.out.println("Constructor in derived class with value of m is ");

    }

    Derived(int x , int y)
    {   super(x,y);
        System.out.println("COns of derived class with value of x and y "+x+y);
    }
}





public class Constructor 
{
    public static void main(String [] args)
    {


        //Base b =new Base();
        Derived d=new Derived();

    }
    
}
