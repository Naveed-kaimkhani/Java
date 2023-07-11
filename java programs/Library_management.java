import java.util.*;
class online_library
{
    //private String[] bookname;
     ArrayList<String> booksname= new ArrayList<>();
     ArrayList<String> issueto = new ArrayList<>();

     void Addbook(String book , String Author)
     {
         booksname.add(book+" "+Author);
     }

     void issueTo(String name_of_Student , String book , String Date )
     {
         issueto.add("Name of Student "+name_of_Student+"\n "+"Name of book"+ book+"\n "+"Date :"+Date);
        booksname.remove(book);        
     }
     void showallbooks()
     {
         System.out.println("All Available books "+booksname);
     }

     void showallissuebook()
     {
         System.out.println(issueto);
     }
}
public class Library_management{
    public static void main(String[] args)
    {
        online_library obj = new online_library();
        obj.Addbook("Cpp", "Robert Lafore");
        obj.Addbook("java how to program", "pata nh");
        obj.showallbooks();

        obj.issueTo("naveed", "cpp", "8/11/2021");
        obj.showallissuebook();
        
    }
}