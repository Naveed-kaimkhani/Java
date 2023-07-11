class mythread implements Runnable
{
    
        public void run()
    {    
        System.out.println("hey");
        System.out.println("hey");
        System.out.println("hey");
        System.out.println("hey");
        System.out.println("hey");
        System.out.println("hey");
        System.out.println("hey");
        System.out.println("hey");
        System.out.println("hey");
        System.out.println("hey");
    }
    
}

class mythread2 implements Runnable
{   
    public void run()
    {
        System.out.println("chal nkal");
        System.out.println("chal nkal");
        System.out.println("chal nkal");
        System.out.println("chal nkal");
        System.out.println("chal nkal");
        System.out.println("chal nkal");
        System.out.println("chal nkal");
        System.out.println("chal nkal");
        System.out.println("chal nkal");
        System.out.println("chal nkal");
        System.out.println("chal nkal");
        System.out.println("chal nkal");
        System.out.println("chal nkal");

        System.out.println("chal nkal");
        System.out.println("chal nkal");
        System.out.println("chal nkal");

    }      
}


public class ThreadInteface {
    public static void main(String[] args)
    {   
        Thread object=new Thread(new mythread());
        Thread object2=new Thread(new mythread2());

        object.run();
        object2.run();
    }
}
