class thr1 extends Thread
{
    public void run()
    {   int i=0;
        
        while(i<500)
        {   i++;
            System.out.println("good mornuing");
         
         try {
             Thread.sleep(500);
            } 
        catch (Exception e) {
             //TODO: handle exception
             System.out.println(e);
            }      
        }
        
    }
}

class thr2 extends Thread{
    public void run()
    {  int i=0;
        
        while(i<500)
        {   i++;
            System.out.println("hellow");
        }
        
    }
}
public class Task1 {
    public static void main(String[] args)
    {
        thr1 t1 = new thr1();
        thr2 t2 = new thr2();
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
    }
}
