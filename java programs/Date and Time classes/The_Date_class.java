import java.util.*;
public class The_Date_class {
    public static void main(String[] args)
    {
        Date d =new Date();
        //System.out.println(d);   //returns date
        // System.out.println(d.getTime()); //returns millisecond
        //System.out.println(d.getDate());
      //  System.out.println(d.getDay());
     // System.out.println(d.getYear());
      System.out.println(d.getHours()+":"+d.getMinutes()+":"+d.getSeconds());
      //System.out.println(d.getSeconds());
    }
}
