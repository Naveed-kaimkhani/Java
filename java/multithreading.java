import java.lang.*;
class multiexam extends Thread
{
    public void run() {
    //   try {
    //     Thread.sleep(100);   
    //   } catch (Exception e) {
    //       //TODO: handle exception
    //   }
        System.out.print(Thread.currentThread().getPriority());
        for (int i = 0; i < 10; i++) {    
            System.out.println("hey");
        }
        //System.out.println(Thread.currentThread().isAlive());
    }
}

class multiexam2 extends Thread
{
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("morning");
        }
        //System.out.println(Thread.currentThread().isAlive());
    }
}

public class multithreading {
        public static void main(String[] args) {
           
                multiexam obj=new multiexam();
                multiexam2 obj2=new multiexam2();
                obj.start();
                obj2.start();
                obj.setPriority(5);
                // obj.start();
                // try {
                //     obj.join();   
                // } catch (Exception e) {
                //     //TODO: handle exception
                // }
               
                
                
                
                // System.out.println(obj.isAlive());
                // obj.start();
                // System.out.println(obj.isAlive());
            }
        
}
