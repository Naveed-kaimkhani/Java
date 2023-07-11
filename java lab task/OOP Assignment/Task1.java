class Author
{
    private String name;
    private String Email;
    private char gender;

    public Author(String name, String Email, char gender)
    {
        this.name=name;
        this.Email=Email;
        this.gender=gender;

    }
    public String getname()
    {
        return name;

    }

    public String getEmail()
    {
        return Email;
    }

    public void setEmail(String Email)
    {
        this.Email=Email;
    }

    public char getGender()
    {
        return gender;
    }

    public String toString()
    {
        //System.out.println();
       return "Author[name="+name+", email="+Email+", Gender="+gender;
    }
    
}

public class Task1 {
    public static void main(String[] args)
    {
        Author obj = new Author("Robert Lafore", "Lafore123@gmail.com",'m');
        System.out.println(obj.toString());
        

    }

}