class Shape
{
    public double Area(double side)
{   System.out.println("Area of Square");
    return 4*side;
}

public double Area(double length, double width)
{   System.out.println("Area of Rectangle");
    return length*width;
}

}
public class Task4 {
    public static void main(String[] args)
    {
        Shape obj = new Shape();
        System.out.println(obj.Area(4.0)); 
        System.out.println(obj.Area(3.2, 4.8));        
        
    }    
}
