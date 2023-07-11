import java.io.IOException;
import java.awt.event.*;
import javax.swing.*;
public class two_number_addition extends JFrame
{
    
    JLabel l1,l2,l3,l4;
    JTextField tf1,tf2;
    JButton b1;

    public two_number_addition(String s)
    {
        super(s);
    }
    public void setcomponents()
    {
        l1 = new JLabel("Addition of two number");
        l2 = new JLabel("First Number");
        l3 = new JLabel("Second Number");
        l4 = new JLabel();
        tf1 = new JTextField();
        tf2 = new JTextField();
        b1=new JButton("Add");
        
        setLayout(null);
        l1.setBounds(80,30,150,20);
        l2.setBounds(50,80,100,20);
        tf1.setBounds(150,80,100,20);
        tf2.setBounds(150,130,100,20);
        l3.setBounds(50,130,100,20);
        b1.setBounds(80,180,100,20);
        l4.setBounds(50,240,200,20);
        
        b1.addActionListener(new HandleEvent());
        
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        
        add(tf1);
        add(tf2);
        
        add(b1);
    }
    class HandleEvent implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            int a=Integer.parseInt(tf1.getText());
            int b=Integer.parseInt(tf2.getText());
            int s=a+b;
            l3.setText("sum is "+s);
        }
    }
    public static void main(String[] args) throws IOException
    {
        two_number_addition jf = new two_number_addition("JAVA GUI");
                
        jf.setcomponents(); 
        
        jf.setSize(300,300);
        jf.setVisible(true);
       
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
