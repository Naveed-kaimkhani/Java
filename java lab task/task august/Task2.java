import java.util.Scanner;
class Area
{
    private double length;
    private double breadth;

    public void setDimension(double length , double breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }

    public double getArea()
    {
        return length*breadth;
    }
}


public class Task2 {
    public static void main(String[] args)
    {
        Area obj =new Area();
        Scanner sc =new Scanner(System.in);
        
        System.out.println("Enter length");
        double len =sc.nextDouble();

        System.out.println("ENter breadth");
        double bre =sc.nextDouble();

        obj.setDimension(len, bre);
        System.out.println(obj.getArea());
    }

}
