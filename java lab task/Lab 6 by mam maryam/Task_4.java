class Student
{
    private String name;
    private String depart;
    private int age;

    public Student(){}

    public Student(String name, String depart, int age)
    {
        this.name=name;
        this.depart=depart;
        this.age=age;
    }

    public void set_Data(String name, String depart, int age)
    {
        this.name=name;
        this.depart=depart;
        this.age=age;
    }

    public void show_Data()
    {
        System.out.println("Name : "+name+"\nDepart : "+depart+"\nAge : "+age);
    }
}

public class Task_4 {
    public static void main(String[] args) 
    {
        Student obj = new Student();
        obj.set_Data("naveed","Software",22);        
        obj.show_Data();
    }
}
