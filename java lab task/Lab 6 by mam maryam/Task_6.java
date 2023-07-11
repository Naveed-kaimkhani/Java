
//Student Class
class Student
{
    public String name;
    public  String depart;
    public int age;

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

}   //Student class end


class Marksheet //Marksheet class
{
    public float oop_marks;
    public float ISE_marks;
    public float Laag_marks;

    public void set_marks(float oop_marks,float ISE_marks,float Laag_marks)
    {
        this.ISE_marks=ISE_marks;
        this.Laag_marks=Laag_marks;
        this.oop_marks=oop_marks;
    }

    public void Total_marks()
    {
        float total=oop_marks+ISE_marks+Laag_marks;
        System.out.println("Total marks="+total);
    }

    
    public void Cal_perct()
    {   float total=oop_marks+ISE_marks+Laag_marks;
        float per=(total/300)*100;
        System.out.println("Percentage marks="+per);
    }

    
    public void Grade()
    {
        float per=(300/oop_marks+ISE_marks+Laag_marks)*100;
        if(per>=90.0)
        {
            System.out.println("Grade 'A");
        }

        if(per>=80.0 && per<90.0)
        {
            System.out.println("Grade 'B");
        }

        
        if(per>=70.0 && per<80.0)
        {
            System.out.println("Grade 'C");
        }
    }
}   //Marksheet class End

public class Task_6 {
   private Student student;
   private Marksheet sheet;
   
   public Task_6(){}
   
   public Task_6(Student student , Marksheet sheet)
   {
        this.student=student;
        this.sheet=sheet;
   }

   public void create_student_result()
   {    
       System.out.println("-------------------Bio Data----------------");
       System.out.println("Name : "+student.name+"\nDepart : "+student.depart+"\n"+"Age : "+student.age);

       System.out.println("-------------------Mark Sheet----------------");
       sheet.Total_marks();
       sheet.Cal_perct();
       sheet.Grade();
 
   }

   public static void main(String[] args) 
   {
       Student student=new Student("Naveed","Software",21);
        Marksheet sheet=new Marksheet();
        sheet.set_marks(70.0f, 85.5f, 99.9f);

        Task_6 obj= new Task_6(student,sheet);
        obj.create_student_result();
    }
}
