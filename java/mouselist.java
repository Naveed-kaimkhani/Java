import javax.swing.*;
import javax.swing.event.MouseInputListener;
import java.awt.event.*;
import java.awt.*;

class Gu extends JFrame implements MouseListener {
    JLabel label1;
    JLabel label2;
    JTextField textfiled;
    JTextField textfield;
    JCheckBox CB;
    JButton regBut;
    JButton clear;
        JRadioButton RB;
    Gu()
    {   setLayout(null);
        
        label1 = new JLabel("Name :");
        label1.setBounds(20,50,100,20);
        add(label1);

        label2=new JLabel("Email :");
        label2.setBounds(20,90,100,20);
        add(label2);

        textfiled=new JTextField();
        textfiled.setBounds(60,50,70,20);
        add(textfiled);

        textfield =new JTextField();
        textfield.setBounds(60,90,70,20);
        add(textfield);
        
        RB=new JRadioButton("female");
        RB.setBounds(120,120,100,50);
        add(RB);

        CB=new JCheckBox("Terms and Condition");
        CB.setBounds(90,160,150,50);
        add(CB);

        regBut=new JButton("Register");
        regBut.setBounds(120,200,100,50);
        add(regBut);

        regBut.addMouseListener(this);

        setSize(400,400);
        setVisible(true);
        
    }
       @Override
        public void mouseEntered(MouseEvent e)
        {
            //regBut.setBackground(Color.BLACK);
            regBut.setText("mouse entered");
        }
        @Override
        public void mousePressed(MouseEvent e)
        {
            regBut.setText("mouse pressed");
        }

        @Override
        public void mouseReleased(MouseEvent e)
        {
            regBut.setText("mouse releaed");
        }

        @Override
        public void mouseClicked(MouseEvent e)
        {
            regBut.setText("mouse clicked");
        }
        
        
        @Override
        public void mouseExited(MouseEvent e)
        {
            regBut.setText("Exited");
        }
    }



public class mouselist{
    public static void main(String[] args) {
            Gu obj=new Gu();
            obj.setDefaultCloseOperation(Gu.EXIT_ON_CLOSE);
    }
}