import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.*;
import java.awt.event.*;
public class test extends JFrame implements ActionListener
{   JButton button;
    test()
    {
        setSize(500,500);
         button=new JButton("click");
         button.setBounds(250,250,20,20);
         add(button);
        
    signupp.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent a) {
            JOptionPane.showMessageDialog(null,"hwllow", "info", JOptionPane.INFORMATION_MESSAGE);      

        }//actionperformed end
      }// Actionlistener end
      );
      
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) 
    {
        test obj = new test();
    }
}