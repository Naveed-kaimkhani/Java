class Course
{
    private String name;    
    private String code;
    private int ch;

    public Course(String name, String code, int ch)
    {
        this.name=name;
        this.code=code;
        this.ch=ch;
    }

    public String getname()
    {
        return name;
        //System.out.println(name);
    }

    
}

class Student{
    private int rollno;
    private String name_of_student;
    private Course course;
    private final String depart="SW";
    private static int count;

    public Student(int  rollno, String name_of_student, Course course)
    {
        this.rollno=rollno;
        this.name_of_student=name_of_student;
        this.course=course;
    }

    public void setCourse(Course course)
    {
        this.course=course;
    }

    public String getname()
    {
        return name_of_student;
    }

    public Course getcourse()
    {
        return course;
    }
}

public class main
{
    public static void main(String[] args){
        Course oop=new Course("opp","121",12);
        Student s1=new Student(60,"naveed",oop);
        Course S1course=s1.getcourse();
        System.out.println(S1course.getname());
    }
}