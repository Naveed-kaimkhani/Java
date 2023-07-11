interface BasicAnimal
{
    void eat();
    void sleep();
}
class Monkey
{
    void jump()
    {
        System.out.println("we can jump");
    }
    void bite()
    {
        System.out.println("we can bite");
    }
}
class Human extends Monkey implements BasicAnimal
{
    void H()
    {
        System.out.print("we are human");
    }
   public void eat(){
        System.out.println("we can eat");
    }
    public void sleep(){
        System.out.println("We also sleep");
    }
}
public class AbstPrac {
    public static void main(String [] args)
    {
       Human obj=new Human();
       obj.H();
       obj.bite();
       obj.eat();
       obj.jump();
    }
}
