

public class Exception_handling {
    public static void exception(int a , int b) throws ArithmeticException
{
    try{
        System.out.println(a/b);
    }

    catch(ArithmeticException e)
    {   System.out.println("denominator must be less than zero");
       // throw new ArithmeticException("hahhh");
        //System.out.println(e);
    }   

    catch(IllegalArgumentException e)
    {
        System.out.println("illegal argument");
    }
    
}



    public static void main(String[] args)
    {
        exception(2,0);

    }
}
