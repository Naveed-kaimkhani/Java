class Employee{
    private String FirstName;
    private String LastName;
    private String CellNo;

    void setFirstName(String fn)
    {
        FirstName=fn;

    }
    void setLastName(String ln)
    {
        LastName=ln;

    }
    void setCellNo(String cn)
    {
        CellNo=cn;

    }
    String getFirstName()
    {
        return FirstName;
    }
    
    String getLastName()
    {
        return LastName;
    }
    
    String getCellNo()
    {
        return CellNo;
    }
}

class PartTimeEmployee extends Employee
{
    private String Enter;
    private String Leave;

    public void setEnter(String e)
    {
        Enter =e ;
    }
    public void setLeave(String l)
    {
        Leave=l;
    }

    void Enter_leave()
    {
        System.out.println("Entering time : "+Enter);
        System.out.println("Leaving time : "+Leave);
    }
}


public class EmployeeHirerachy {
    public static void main(String[] args){
        PartTimeEmployee obj=new PartTimeEmployee();
        obj.setFirstName("Naveed");
        obj.setLastName("KK");
        obj.setCellNo("310344527");
        obj.setEnter("2:30");
    }
}
