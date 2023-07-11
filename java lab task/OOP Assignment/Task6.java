import java.util.*;
class Triangle
{
    private double hypotenuse;
    private double base;
    private double perpendicular;

   public  Triangle()
    {
        hypotenuse=0;
        base=0;
        perpendicular=0;
    }

    public Triangle(double hypotenuse , double base, double perpendicular) {
        this.base=base;
        this.hypotenuse=hypotenuse;
        this.perpendicular=perpendicular;
    }
    public double getHyp()
    {
        double hyp=Math.sqrt(base*base+perpendicular*perpendicular);
        System.out.print("Hypotenues = ");
        return hyp;
    }

    public double getperp()
    {
        double perp=Math.sqrt(hypotenuse*hypotenuse-base*base);
        System.out.print("perpendicular = ");
        return perp;
    }

    public double getbase()
    {
        double base=Math.sqrt(hypotenuse*hypotenuse-perpendicular*perpendicular);
        System.out.print("Base = ");
        return base;

    }
}



public class Task6 {
    public static void main(String[] args){
        Triangle T1= new Triangle(3.5,2.5,1.5);
         System.out.println(T1.getHyp());
         System.out.println(T1.getperp());
         System.out.println(T1.getbase());
         
        
    }
}
