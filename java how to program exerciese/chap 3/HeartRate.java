import java.util.Scanner;

class Heart
{
    String name;
    int year;
    int month;
    int day;
    int age;
    int rate;
    Heart(String n, int y,int m,int d)
    {
        name=n;
        year=y;
        month=m;
        day=d;

    }
    void info()
    {
        System.out.println("Name : "+name);
        System.out.println("Date of Birth : "+day+"/"+month+"/"+year);
    }
    int CalAge()
    {
         age=2021-year;
        System.out.print("Your age is ");
        return age;
    }
    int Cal_HeartRate()
    {
         rate=220-age;
        System.out.print("Maximum heart beats per minute is ");
        return rate;
    }
    void Target_rate()
    {
        float target=rate*0.5f;
        float tar=rate*0.85f;
        System.out.println("Your Heart Rate must be in between  "+target+"-"+tar);
        //return target + tar;
    }
}



public class HeartRate
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name");
        String na=sc.next();
        System.out.println("Enter Date of birth");
        int da=sc.nextInt();
        System.out.println("Enter month");
        int mo=sc.nextInt();
        System.out.println("Enter Year");
        int ye=sc.nextInt();
       
        Heart obj=new Heart(na, ye, mo, da);
        obj.info();
       System.out.println(obj.CalAge());
        System.out.println(obj.Cal_HeartRate()); 
        obj.Target_rate();
    



    }
}