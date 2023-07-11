public class Time_class
{
    public static void main(String[] args)
    {
        System.out.println("milli Secondds passed from 1970 "+System.currentTimeMillis());
        System.out.println("seoncds "+System.currentTimeMillis()/1000);
        System.out.println("Hour "+System.currentTimeMillis()/1000/3600);
        System.out.println("Days "+System.currentTimeMillis()/1000/3600/24);
        System.out.println("years "+System.currentTimeMillis()/1000/3600/24/365);
    }
}