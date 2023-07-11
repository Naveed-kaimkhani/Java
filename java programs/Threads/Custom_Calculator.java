class DividedbyZeroException extends Exception
{
    public String toString()
    {
        return "Denominator must be non zero";
    }
} 

class GraterThanException extends Exception
{   @Override
    public String toString()
    {
        return "values is greater than 100";
    }    
} 

class cal
{
    public int mul(int a, int b) throws GraterThanException 
    {
        if(a>100 || b>100)
        {
            throw new GraterThanException();
        }
        return a*b;
    }
    
    
    public double divide(int a, int b) throws DividedbyZeroException 
    {
        if(b==0)
        {
            throw new DividedbyZeroException();
        }
        return a/b;
    }
}

public class Custom_Calculator {
        

    
    public static void main(String[] args)
    {
                
        cal obj =new cal();
        System.out.println(obj.mul(102,3));
       
    }
}
