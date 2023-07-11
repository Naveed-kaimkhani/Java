import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Gu extends JFrame implements ActionListener {
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
        
        RB=new JRadioButton("Male");
        RB.setBounds(120,120,100,50);
        add(RB);

        CB=new JCheckBox("Terms and Condition");
        CB.setBounds(90,160,150,50);
        add(CB);

        regBut=new JButton("Register");
        regBut.setBounds(90,180,50,50);
        add(regBut);

        regBut.addActionListener(this);

        clear=new JButton("clear");
        clear.setBounds(220,280,70,20);
        clear.addActionListener(this);
        add(clear);

        setSize(400,400);
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ex)
    {
        if(ex.getSource()==regBut)
        {
            
            if(RB.isSelected())
            {
                if(CB.isSelected())
                {
                    
            String getname=textfield.getText();
            String getemail=textfiled.getText();
            JOptionPane.showMessageDialog(null, getname+"\n"+getemail, "INFO", JOptionPane.INFORMATION_MESSAGE);


                }
                else
                {
                    JOptionPane.showMessageDialog(null, "plzz accept term and condition", "INFO", JOptionPane.INFORMATION_MESSAGE);
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "select gender and condition", "INFO", JOptionPane.INFORMATION_MESSAGE);
            }
            
        }
        if(ex.getSource()==clear) 
        {
            textfield.setText("");
            textfiled.setText("");
        }
        
    }
}


public class Gui{
    public static void main(String[] args) {
            Gu obj=new Gu();
            obj.setDefaultCloseOperation(Gu.EXIT_ON_CLOSE);
    }
}