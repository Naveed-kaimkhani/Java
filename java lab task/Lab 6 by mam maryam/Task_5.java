class Marksheet
{
    private float oop_marks;
    private float ISE_marks;
    private float Laag_marks;

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
}

public class Task_5 {
    public static void main(String[] args) {
        Marksheet obj=new Marksheet();
        obj.set_marks(80.5f, 70.0f, 90.2f);
        obj.Total_marks();
        obj.Cal_perct();
        obj.Grade();
    }
}
