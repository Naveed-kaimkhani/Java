import java.awt.event.KeyEvent;
import java.lang.*;
import java.text.SimpleDateFormat;

import javax.swing.*;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.AbstractDocument.BranchElement;

import java.util.Date;

class my extends Thread implements KeyListener
{   JFrame j;
    JLabel lb;
    Date d;
    SimpleDateFormat format;
    String s;
    int Bounds;

    my()
    {
        j=new JFrame("Threading");
        j.setSize(500,500);
        j.setLayout(null);

        lb=new JLabel("Date");
        lb.setBounds(40,100,200,60);
        j.add(lb);


        

        j.setVisible(true);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void run()
        {      
        while(true)
        {   d=new Date();
            format=new SimpleDateFormat("E,MM_dd-YYYY hh:mm::ss") ;
            s=format.format(d);
            lb.setText(s);  
        }
    
    }

    public void KeyTyped(KeyEvent e)
    {
        throw new UnsupportedOperationException("NOt suppported yet");
    }
    public void KeyPressed(KeyEvent e)
    {
        switch(e.getKeyCode())
        {
            case KeyEvent.VK_Down:
            Bounds+=40;
            lb.setBounds(40,Bounds,200,60);
                break;
            case KeyEvent.VK_UP:
            Bounds-=40;
            lb.setBounds(40,Bounds,200,60);
            break;
        }
    }

}
public class multiThreading {
    public static void main(String[] args)
    {
        my obj = new my();
        //ur obj1 = new ur();
        obj.start();
        //obj1.start();
    }
}
