import java.io.*;
public class yr19_Q2b {
    public static void main(String[] args) {
        try {
            File myfile = new File("19sw.txt");
            myfile.createNewFile();
            
            // FileWriter fileW = new FileWriter("19sw.txt");
            // fileW.write("HEy future programmers");
            // fileW.close();

            //FileReader fileR=new FileReader("19sw.txt");
            
                FileReader fw=new FileReader("19sw.txt");
               int next;
                while((next=fw.read())!=-1)
                {
                   
                    System.out.print((char)next);
                }
        }
                   catch(Exception e)
                   {
                       System.out.println(e);
                   } 
        
    }
}