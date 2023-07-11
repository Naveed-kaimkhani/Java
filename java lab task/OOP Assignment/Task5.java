class Student 
{
    private String name;
    private int age;
    private String Adress;

    public Student()
    {
        name="unknown";
        age=0;
        Adress="not set";

    }

    public void setinfo(String name, int age)
    {
        this.name=name;
        this.age=age;

    }
    
    public void setinfo(String name,int  age,String Adress)
    {
        this.name=name;
        this.age=age;
        this.Adress=Adress;
    }

    public void getinfo()
    {   System.out.println();
        System.out.print("Name="+name);
        System.out.print("  Age="+age);
        System.out.print("  Address="+Adress);
    }
}
public class Task5 {
    public static void main(String[] args)
    {   

        Student[] students = new Student[5];
    
        for(int i=0; i<students.length; i++)
        {
            students[i]=new Student();
        }    
    
        students[1].setinfo("Naveed", 21,"xyz");
        students[2].setinfo("Asim", 18,"xyz");
        students[3].setinfo("Faizan", 16,"xyz");
        students[4].setinfo("Ahmed", 14,"xyz");
        students[4].setinfo("Rohan", 12, "xyz");
        

        for (Student student : students) {
            student.getinfo();
        }
    }
}
