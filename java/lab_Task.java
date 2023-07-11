import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import javax.swing.*;
class Gui extends JFrame implements ActionListener
{     JTextField TF;
    JButton jb;
   public Gui()
   {
        setSize(200,200);
        setLayout(null);    
        setVisible(true);    
    TF=new JTextField();
    TF.setBounds(100,100,100,20);
    add(TF);
     jb=new JButton("Clear");
    jb.setBounds(100,150,50,50);
    add(jb);
    jb.addActionListener(this);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

   public void actionPerformed(ActionEvent e)
   {
    
    if(e.getSource()==jb)
       {
            TF.setText("");
       }
    
   }
}



public class lab_Task {
    public static void main(String[] args) {
        Gui obj=new Gui();
       
    }
}
