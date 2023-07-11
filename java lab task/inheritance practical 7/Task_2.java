class person
{
     String name;
     String address;

    person(String name, String address)
    {
        this.name=name;
        this.address=address;
    }

    public String getName()
    {
        return name;
    }

    public String getaddress()
    {
        return address;
    }
    
    public void setaddress(String address)
    {
        this.address=address;
    }

    public String toString ()
    {
        return "name: "+name+"\nAddress: "+address;
    }
}

class Student extends person
{
    private String program;
    private int year;
    private double fee;

    Student(String name, String address, String program ,int year ,double fee  )
    {
        super(name,address);
        this.program=program;
        this.year=year;
        this.fee= fee;

    }
    public String getprogram()
    {
        return program;
    }
    public void setProgram(String program)
    {
        this.program=program;
    }
    public int getYear()
    {
        return year;
    }
    
    public void setYear(int year)
    {
        this.year=year;
    }
    
    public double getFee()
    {
        return fee;
    }

    public void setFee(double fee)
    {
        this.fee=fee;
    }

    public String toString ()
    {
        return "\nname: "+name+"\nAddress: "+address+"\nprogram: "+program+"\nyear: "+year+"\nFee: "+fee;
    }
}
class staff extends person
{
    private String school;
    private double pay;

    staff(String name, String address, String school, double pay)
    {
        super(name,address);
        this.school=school;
        this.pay=pay;
    }

    public void setSchool(String school)
    {
        this.school=school;
    }
    
    public void setPay(int pay)
    {
        this.pay=pay;
    }

    
    public int getPay(int pay)
    {
        return pay;
    }
    
    public String getSchool(String school)
    {
        return school;
    }

    public String toString()
    {
        return "\nname: "+name+"\naddress: "+address+"\nSchool: "+school+"\npay: "+pay;
    }
}
public class Task_2 {
    public static void main(String[] args) 
    {
        System.out.print("--------------------Student----------------------");
        Student student= new Student("Naveed","yyyyyyyyyyyy","B.E Software",2020,38000.0);
        System.out.println(student);

        System.out.print("--------------------Staff----------------------");
        staff staf = new staff("Naeem mahoto","yyyyyyyyyyyy","Software",10);
        System.out.println(staf);
        
    }   
}
