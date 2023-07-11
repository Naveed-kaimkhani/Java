 import java.util.*;
// import java.io.File;
// import java.io.FileWriter;
// import java.io.IOException;
import java.io.*;
public class File_handling {
    public static void main(String[] args)  //throws IOException
    {   
        File myfile = new File("naveed.txt");
       
        try {
            myfile.createNewFile();    
        } catch (IOException e) {
            //TODO: handle exception
            System.out.println("FIle not created");
            System.out.println(e);
        }
       
        // try {
        //     FileWriter fileWriter = new FileWriter("naveed.txt");  
        //     fileWriter.write("hehehheehehhe\nhahhahh");
        //     fileWriter.close();  
        // } catch (Exception e) {
           
        //     System.out.println(e);
        // }

        // try {
        //     Scanner sc= new Scanner(myfile);
        //     while(sc.hasNextLine())
        //     {
        //         String line= sc.nextLine();
        //         System.out.println(line);
        //     }
        // } catch (Exception e) {
        //     //TODO: handle exception
        //     System.out.println(e);
        // }


    }
}
