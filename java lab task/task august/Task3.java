class Box
{
     double breadth;
     double width;
     double height;

    Box(){}

    Box(double breadth,double width,double height)
    {
        this.breadth=breadth;
        this.width=width;
        this.height=height;


    }
}
public class Task3
 {
    public static void main(String[] args)
    {
        Box Box1=new Box(5.0,7.0,4.0);
        Box Box2=new Box(10.0,12.0,8.0);
        Box Box3=new Box();
        
        Box3.breadth=Box1.breadth+Box2.breadth;
        Box3.width=Box1.width+Box2.width;
        Box3.height=Box1.height+Box2.height;

        System.out.println(Box3.breadth+"\n"+Box3.width+"\n"+Box3.height+"\n");
        
        

    }
}
