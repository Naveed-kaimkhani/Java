
 import javax.swing.*;
 import java.awt.*;
 import java.awt.event.*;

   public class RegistrationForm implements ActionListener{

   	   JFrame frame;
   	   JPanel panel;
   	   JLabel label1, label2 , label3 , label4 , label5, label6;
   	   JTextField txt1 , txt2 , txt3 ;
   	   JTextArea ta1 , ta2;
   	   JRadioButton button1 , button2;
   	   JComboBox box1 , box2 , box3;
   	   JCheckBox cbox;
   	   JButton button3;

   
       RegistrationForm() {

   	   	   frame = new JFrame("Registration Form");
   	   	   
   	   	   frame.setSize(700 , 600);
   	   	   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	   	   frame.setLocationRelativeTo(null);
   	   	   frame.setLayout(null);
           
           label1 = new JLabel("Name :");
           label1.setBounds(20,50,100,20);

           txt1 = new JTextField();
           txt1.setBounds(100 , 50 , 210 , 20);

           label2 = new JLabel("Mobile :");
           label2.setBounds(20 , 100 , 100 , 20);

           txt2 = new JTextField();
           txt2.setBounds(100 , 100 , 210 , 20);

           label3 = new JLabel("Gender :");
           label3.setBounds(20 , 150 , 100 , 20);

           button1 = new JRadioButton("Male");
           button1.setBounds(130 , 150 , 80 , 20);
           button1.setFocusable(false);

           button2 = new JRadioButton("Female");
           button2.setBounds(220 , 150 , 80 , 20);
           button2.setFocusable(false);
           
           ButtonGroup bg = new ButtonGroup();
           bg.add(button1);
           bg.add(button2);

           label4 = new JLabel("DOB :");
           label4.setBounds(20 , 200 , 100 , 20);

           String date[] = {"1","2","3","4","6","7","8","9","10","11","12","13",
                             "14","15","16","17","18","19","20","21","22","23","24",
                              "25","26","27","28","29","30","31"};

           String month[] = {"Jan","Feb","Mar","Apr","May","Jun","July","Aug",
                              "Sep","Oct","Nov","Dec"};

           String years[] = {"2021","2020","2019","2018","2017","2016","2015",
                              "2014","2013","2012","2011","2010","2009","2008",
                              "2007","2006","2005","2004","2003","2002","2001"};

           box1 = new JComboBox(date);
           box1.setBounds(100,200,50,20);
           box2 = new JComboBox(month);
           box2.setBounds(170,200,50,20);
           box3 = new JComboBox(years);
           box3.setBounds(240,200,60,20);

           label5 = new JLabel("Email :");
           label5.setBounds(20 , 250 , 100 ,20);

           ta1 = new JTextArea();
           ta1.setBounds(110,240,200,50);

           cbox = new JCheckBox("Please accept terms and Condition...");
           cbox.setBounds(80 , 300 , 250 , 50);
           cbox.setFocusable(false);
   	   	   
   	   	   button3 = new JButton("Submit");
   	   	   button3.setBounds(150,370,80,20);
   	   	   button3.addActionListener(this);
   	   	   button3.setFocusable(false);

   	   	   ta2 = new JTextArea();
   	   	   ta2.setBounds(350,50,300,300);


   	   	   label6 = new JLabel();
   	   	   label6.setBounds(80 , 420 , 250 , 50);

   	   	   frame.add(label1); frame.add(label2); frame.add(txt1);
   	   	   frame.add(txt2); frame.add(label3); frame.add(button1);
   	   	   frame.add(button2); frame.add(label4); frame.add(box1);
   	       frame.add(box2); frame.add(box3); frame.add(label5);
   	   	   frame.add(ta1); frame.add(cbox); frame.add(button3);
   	   	   frame.add(ta2); frame.add(label6);

   	   	   frame.setVisible(true);
   	   }

   	   public void actionPerformed(ActionEvent e) {

   	   	    if(cbox.isSelected()) {

   	   	    	label6.setText("Registered Successfully!");
                String name = txt1.getText();
                String mobile = txt2.getText();
                String gender = "Male";
                if(button2.isSelected()) {
                   gender="Female";
                }

                String dob = box1.getSelectedItem()+"-"+box2.getSelectedItem()+"-"+
                box3.getSelectedItem();
                String address = ta1.getText();

                ta2.setText("Name:  " +name
                 + "\n\nMobile:  "+mobile + "\n\nGender:  " +gender+
                             "\n\nDate of Birth:  "+ dob + "\n\nAddress:  "+ address);
           } 
   	   	    else {

   	   	    	label6.setText("please accept Condition......");
   	   	    	ta2.setText("");
   	   	    }
   	   }

   	   public static void main(String[] args) {
   	   	  
   	   	   new RegistrationForm();
   	   }
   }
