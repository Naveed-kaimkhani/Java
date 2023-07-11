import java.lang.annotation.Target;
import java.util.Random;
import java.util.Scanner;

class Game
{
    public boolean b=true;       
        private int gues_no;
      private  int input;
        private int num_of_gueses=0;
        
        public Game()
        {
            Random ran=new Random();
            this.gues_no=ran.nextInt(100);
        }
        
        public void user_input()
        {        
            Scanner sc = new Scanner(System.in);
            input=sc.nextInt();
        }

    public void correct()
    {  num_of_gueses++;
         if(input==gues_no)
        {
            System.out.print("you got it !!\n in "+num_of_gueses+" hands");
            b=false;
        }
        if(input>gues_no)
        {
            System.out.println("number is high ");
        }

        if(input<gues_no)
        {
            System.out.println("number is low ");
        }

        
    }
}


public class Guessing_game
{   
   public static void main(String [] args) 
    {  

    //Scanner sc=new Scanner(System.in);
     	System.out.println("Starting with oop");
        Game g=new Game();
        
        while(g.b)
        {   g.user_input();
            g.correct();  
        }
        
    
   }
}