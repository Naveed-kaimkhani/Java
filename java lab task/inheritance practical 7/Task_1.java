class Circle
{
    double radius;
    String color;

    Circle(){}

    Circle(double radius)
    {
        this.radius=radius;
        color="red";
    }

    Circle(double radius , String color)
    {
        radius = this.radius;
        color=this.color;
    }

    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double radius)
    {
        this.radius =radius;
    }

    public String getColor()
    {
        return color;
    }

    
    public void setColor(String color)
    {
        this.color =color;
    }

    public double getArea()
    {
        return radius*radius*3.14;
    }
    
    public String toString()
    {
        return radius+" "+color;
    }

}

class Cylinder extends Circle
{
    double height;
    
    Cylinder(){}

    Cylinder(double radius)
    {
        this.radius=radius;
        color="red";
        height=1.0;
    }

    Cylinder(double radius , double height)
    {
        this.radius = radius;
        this.height=height;
        color="red";
    }

    Cylinder(double radius , double height,String color)
    {
        this.radius =radius;
        this.height=height;
        this.color=color;
    }

    public double getHeight()
    {
        return height;
    }

    public void setHeight(double height)
    {
        this.height=height;
    }

    public double getVolume()
    {
         return (radius*radius*3.14)*height;
    }
    
    public String toString()
    {
        return "Radius: "+radius+"\nHeight: "+height+"\nColor: "+color;
    }

}

public class Task_1
{
    public static void main(String[] args) 
    {
        Cylinder obj=new Cylinder(2.5,3.5,"red");
        System.out.println(obj);
        System.out.println(obj.getVolume());

    }
}