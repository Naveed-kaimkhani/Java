//what is i said implement a method of interface
//first you will definetly make an class that implement interface then you to make an object of that class
//but using lambda expression you can implement method in a single line without making an class

//this is how it is possible

interface F1
{
    void method1();
}


public class lambda{
    public static void main(String[] args){
        F1 obj=()->{System.out.println("hey liilly");};
        obj.method1();
    }

}
