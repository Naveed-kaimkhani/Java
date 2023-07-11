abstract class Shape
{
    abstract void RectArea(int n,int m);
    abstract void SqrArea(int n);
    abstract void CirArea(int n);
}
class Area extends Shape{
    @Override
    void RectArea(int n, int m) {
        System.out.println("Area of rectangle is "+ n*m);
    }
    @Override
    void SqrArea(int n) {
        System.out.println("Area of square is "+4*n);
    }
    @Override
    void CirArea(int n)
    {
        System.out.println("Area of Circle is "+(n*n)*3.14);
    }
}



public class AbstractClass {
    public static void main(String [] args)
    {
        Area obj=new Area();
        obj.RectArea(2, 3);
        obj.CirArea(4);
        obj.SqrArea(5);
    }
}
