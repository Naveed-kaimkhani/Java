/*
Anonymous class are enable us to make our code more concise. they enable us to declare and instantiate the class
at the same time
--> they have no name
--> use them if you need to use a class only once
-->  they are always inner class
--> they have refernce of the parent class 


what if i said you have to make a class that implements an interface 
first you will make a class and then its object to call methods
Anonymous classes overcome this headache in anonymous class we can implements a interface using an object 
that have its refernce , object initiate at the same time and defines interface methods
 
*/

class Anodemo
{
    public void greeting()
    {
        System.out.println("Hello");
    }
    public void over()
    {
        System.out.println("heheeh");
    } 
}

class pak
{
    Anodemo obj = new Anodemo()
    {
        public void hello()
        {
            System.out.println("A/w");
        }
        public void over()
        {
            System.out.println("hahhah");
        }
    };

}

public class Anonymous{
    public static void main(String[] args)
    {
   
        pak OBJ=new pak();
        OBJ.obj.over();
    }
}
