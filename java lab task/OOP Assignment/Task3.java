class Overloaded
{
    private int age;
    private char gender;

    
    public void print_values(int age , char gender)
    {   this.age=age;
        this.gender=gender;
        System.out.println("Age = "+age +" Gender = "+gender);
    }

    public void print_values(char gender , int age)
    {
        this.age=age;
        this.gender=gender;
        System.out.println("Gender = "+gender+" Age = "+age);
    }
}

public class Task3 {
    public static void main(String[] args)
    {
        Overloaded obj = new Overloaded();
        obj.print_values('M', 20);
        obj.print_values(40, 'F');
    }

}
