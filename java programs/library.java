import java.util.Scanner;
class Onlibrary
{
    String[] books;
    int No_of_books;
    public Onlibrary()
    {  
        int No_of_books=0;
      books = new String[100];  //this is called instantiation its only done when book is an reference of string aray
    }
    void add(String s)
    {
        books[No_of_books]=s;
        No_of_books++;
        System.out.println("Book has been added ");
    }
    void show()
    {
        for(String ele:books){
            if(ele==null)
            {   
                continue;
            }
            System.out.println("* "+ele);
        }
    }
    void issuebook(String s)
    {
        for(int i=0; i<books.length; i++)
        {
            if(books[i].equals(s))
            {
                books[i]=null;
                System.out.println(s +" has been issued");
                return;
            }
        }
        
    }
    void returnbook(String s)
    {
        add(s);
    }
}
public class library {
    public static void main(String [] args){
        Onlibrary obj=new Onlibrary();
        obj.add("cpp");
        obj.add("java");
        obj.add("python");
        System.out.println("");
        obj.show();
        System.out.println("");
        obj.issuebook("java");
        System.out.println("");
        obj.show();
        

}
}
