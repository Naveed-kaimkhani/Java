import java.lang.annotation.Target;
import java.util.Scanner;

class Cylinder
{
    int r;
    int h;

    public void setter(int re, int hi)
    {
        r=re;
        h=hi;
    }
    public void getter()
    {
        System.out.println("Radius is " +r);
        System.out.println("height is "+h);
    }

    public void get_volume()
    {
        float v=(r*r*h)*3.14f;
        System.out.println("Volume of this cylinder is  " + v );
    }
    
    public void get_surface_area()
    {
        float v=(r*r*h)*3.14f;
        float surface=(r*h)*6.28f;
        float total=v+surface;
        System.out.println("Surface area  of this cylinder is  " + total );
    }
}


public class cylinder prob
{   
   public static void main(String [] args) 
{  

    Scanner sc=new Scanner(System.in);
     	System.out.println("Starting with oop");
    Cylinder obj =new Cylinder();
    obj.setter(2,3);
    obj.getter();
    obj.get_volume();
    obj.get_surface_area();    	 
   
   }
}