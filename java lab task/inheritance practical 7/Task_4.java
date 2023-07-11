abstract class Shape
{
    String color;
    boolean filled;

    Shape(){}
    Shape(String color, boolean filled)
    {
        this.color=color;
        this.filled=filled;
    }
    public String getColor()
    {
        return color;
    }
    
    public boolean isFill()
    {
        return filled;
    }
    
    public void setColor(String color)
    {
        this.color=color;
    }
    
    public void setFilled(boolean filled)
    {
        this.filled=filled;
    }

   abstract public String toString();
   abstract public double getArea();
  
}
class Circle extends Shape
{
    double radius;

    Circle(){}
    
    Circle(double radius)
    {
        this.radius=radius;
    }

    Circle(double radius,String color, boolean filled)
    {   super(color,filled);
        this.radius=radius;
    }
    
    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double radius)
    {
        this.radius=radius;
    }
    
    public double getArea() //implementation of abstract method
    {
        return 3.14*radius*radius;
    }

    public String toString()    //implementation of abstract method
    {
        return "color: "+color+"\nfilled: "+filled+"\nRadius: "+radius;
    }

}

class Rectangle extends Shape{
    double width;
    double length;

    Rectangle(){}
    
    Rectangle(double width,double length)
    {
        this.width=width;
        this.length=length;
    }

    
    Rectangle(double width,double length,String color,Boolean filled)
    {   super(color,filled);
        this.width=width;
        this.length=length;
    }
    
    public void setLength(double length)
    {
        this.length=length;
    }
    
    public void setWidth(double width)
    {
        this.width=width;
    }
    
    public double getLength()
    {
        return length;
    }

    public double getWidth()
    {
        return width;
    }

    public String toString()        //implementation of abstract method
    {
        return "Color: "+color+"\nFilled: "+filled+"\nLength: "+length+"\nWidth: "+width;
    }

    public double getArea(){
        return length*width;
    }

}
class Square extends Rectangle{
    double side;

    Square(){}
    Square(double side)
    {
        this.side=side;
    }
    Square(double side,double length, double width,String color,boolean filled)
    {   super(length,width,color,filled);
        this.side=side;
    }

    public double getSide()
    {
        return side;
    }

    public void setSide(double side)
    {
        this.side=side;
    }

    public void setlenght(double length)
    {
        this.length=length;
    }

    public void setWidth(double width)
    {
        this.width=width;
    }   

    public String toString()
    {
        return "Color: "+color+"\nfilled: "+filled+"\nSide: "+side+"\n Length: "+length+"\nWidth: "+width;
    }
}

public class Task_4 {
    public static void main(String[] args) {
        System.out.println("------------------Circle--------------------------");
        Circle Cir=new Circle(1.8,"Red",true);
        System.out.println(Cir);
    
        System.out.println("------------------Rectangle--------------------------");
        Rectangle Rect=new Rectangle(3.8,2.5,"Red",true);
        System.out.println(Rect);

        System.out.println("------------------Square--------------------------");
        Square Sqr=new Square(2.5,3.5,2.7,"Red",true);
        System.out.println(Sqr);


    }
}
