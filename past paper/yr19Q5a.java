import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Gu extends JFrame  {
        JButton one;
        JButton two;
        JButton three;
        JButton four;
        JTextField f;


       Gu()
    {   setLayout(new FlowLayout());
        four=new JButton("four");
        one=new JButton("oneeeeeeeeeeeeeee");
        three=new JButton("three");
        two=new JButton("two");
        
        f=new JTextField();
        add(f);
        add(four);
        add(one);
        add(three);
        add(two);
        
        setSize(400,400);
        setVisible(true);
        
    }
    }



public class yr19Q5a{
    public static void main(String[] args) {
            Gu obj=new Gu();
            obj.setDefaultCloseOperation(Gu.EXIT_ON_CLOSE);
    }
}