class Dog
{
    private String name="";
    private String breed="";
    private int age=0;

    public void set_Details(String name, String breed, int age)
    {
        this.name=name;
        this.breed=breed;
        this.age=age;
    }

    public void show_Details()
    {
        if(name.isEmpty()==true && breed.isEmpty()==true && age==0)
        {
            System.out.println("Details are unavailable");
        }

        else
        {
            System.out.println("Name : "+name+"\nBreed : "+breed+"\nAge : "+age);
        }
    }
}


public class Task_3 {
    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.set_Details("Bull Dog", "unknown", 4);
        obj.show_Details();
    }
}
