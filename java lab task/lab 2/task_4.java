import java.util.Scanner;
public class task_4 {
    public static float Diameter(float r)   //Defining Diameter funciton
    {
        float  Dm=2*r;
        System.out.println("Diameter is ");
        return Dm;
    }
    
    public static  double Circumferencce(float r)   //Defining Circumference funciton
    {
        double Circum=(3.14*r)*2;
        System.out.println("Circumference is ");
        return Circum;
    }
    
    public static  double Area(float r)         //Defining Area funciton
    {
        double Ar=(r*r)*3.14;
        System.out.println("Area is ");
        return Ar;
    }
    
    public static void main(String[] args){ //main start
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Radius of circle ");  
        float radius=sc.nextFloat();    //Taking input
        System.out.println(Diameter(radius));   //calling Diameter functioin
        System.out.println(""); //for newline
        
        System.out.println(Circumferencce(radius)); //Calling circumference function
        System.out.println("");//for new line
        
        System.out.println(Area(radius));   //calling Area function
        System.out.println(""); //for newline
    }
}
