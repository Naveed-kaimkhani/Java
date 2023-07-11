class Students
{
    private String name;
    private int roll;

    public void  setname(String n)
    {
        name=n;
    }
    public void setroll(int r)
    {
        roll=r;
    }
}
class undergraduate extends Students
{
    private String Depart;
    private int Batch;

    public void setdepart(String d)
    {
        Depart=d;

    }
    public void setBatch(int b)
    {
        Batch=b;
    }
}
class Graduate extends Students
{
    private String Technology;
    private String Year;

    public void SetTechnology(String t)
    {
        Technology=t;
    }
    public void Setyear(String y)
    {
        Year=y;
    }

}


public class StudentHirechy
{
    public static void main(String[] args){
        
    }
}