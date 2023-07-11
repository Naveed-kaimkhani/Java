import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class Date_Formater {
    public static void main(String[] args)
    {
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        //DateTimeFormatter df = DateTimeFormatter.ofpattern("DD-MM-YY");
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM_YYYY");
        DateTimeFormatter df2 = DateTimeFormatter.ofPattern("dd-MM_YYYY--E");
        DateTimeFormatter df3 = DateTimeFormatter.ofPattern("dd-MM_YYYY a");
        String mydate = dt.format(df3);
        System.out.println(mydate);

    }
}
