import java.awt.Color;
import java.awt.event.*;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.plaf.MenuBarUI;
import javax.swing.plaf.basic.BasicBorders.RadioButtonBorder;

class GUI extends JFrame implements MouseListener{
        JLabel register;
        JLabel name;
        JTextField namefield;
        JLabel gender;
        JButton registerButton;
        JCheckBox jb;
        JRadioButton male;
        JComboBox city;
        JTextArea ta;
        // JMenuBar bar;
        // JMenu filemenu;
        // JMenu editmenu;
        // JMenuItem newitem;
        // JMenuItem openitem;
        //JColorChooser color;
    public GUI()
    {  
        setSize(400,600); 
        setLayout(null);
       //  getContentPane().setBackground(Color.DARK_GRAY);
        
        register=new JLabel("REGISTRATION");
        register.setBounds(100,10,200,200);
        add(register);

         name=new JLabel("Name");
         name.setBounds(70,40,400,400);
         add(name);

         namefield=new JTextField();
         namefield.setBounds(120,100,50,20);
         add(namefield);

         gender=new JLabel("Gender");
         gender.setBounds(70,80,400,400);
         add(gender);


        male=new JRadioButton("Male");
        male.setBounds(150,150,150,150);

        ButtonGroup bg=new ButtonGroup();
        bg.add(male);
        add(male);

        JCheckBox jb=new JCheckBox("Terms and condition");
        jb.setBounds(70,300,150,150);
        add(jb);
        
        
        String[] list={"HYD", "Karachi","Jamshoro"};        
         city=new JComboBox(list);
        city.setBounds(170,350,150,20);
        add(city);

        //add(c);
        setVisible(true);
      
        registerButton=new JButton("Register");
        registerButton.setBounds(100,500,100,20);
        registerButton.addActionListener(this);
        add(registerButton);

        //namefield=new JTextField();
        //namefield.setBounds(200,800,100,100);
       // add(namefield);

        // Bar = new MenuBar();
        
        // filemenu=new JMenu("File");
        // editmenu=new JMenu("Edit");

        // newitem=new JMenuItem("New");
        // openitem=new JMenuItem("Edit");

        // filemenu.add(newitem); filemenu.add(openitem);
        // Bar.add(filemenu); Bar.add(editmenu);
        // Color color=JColorChooser.showDialog(null,"Select COlor",Color.yellow);
        // name.setForeground(color);
        registerButton.addActionListener(this);
}
        @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==registerButton)
        {
                // if(male.isSelected())
                // {

                //         Boolean b=jb.isSelected();
                //         String s=String.valueOf(b);
                //         JOptionPane.showMessageDialog(null,jb.isSelected(), "info", JOptionPane.INFORMATION_MESSAGE);

                //     //    if(jb.isSelected()!=false)
                //        // {
                //                 JOptionPane.showMessageDialog(null, "test", "info", JOptionPane.INFORMATION_MESSAGE);
                //        // }
                // }
                
                        
                        String get=String.valueOf(namefield.getText());
                        JOptionPane.showMessageDialog(null, get, "info", JOptionPane.INFORMATION_MESSAGE);

                        if(get.equals("notepad"))
                        {       try {
                                Runtime.getRuntime().exec("notepad");
                        } catch (Exception ex) {
                                //TODO: handle exception

                        }
                                
                        }
        
        }
        
        registerButton.addMouseListener(this);
                        

    }
    @Override
    public void mousePressed(MouseEvent ex)
    {
        registerButton.setText("pressed");
    }
    @Override
    public void mouseReleased(MouseEvent ex)
    {
        registerButton.setText("Released");
    }
    @Override
    public void mouseEntered(MouseEvent ex)
    {
        registerButton.setText("Entered");
    }

}


public class lecture {
        public static void main(String[] args) 
        {
                GUI obj=new GUI();
                obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
}
