import java.awt.event.ActionEvent;
import java.awt.*;
import javax.swing.*;
import javax.swing.plaf.ActionMapUIResource;

class bookstore extends JFrame implements ActionListener
 {  
    JLabel registration_label;
    JLabel book_name;
    JLabel price;
    JLabel author1;
    JLabel author2;

    JTextField BN;
    JTextArea pr;
    JTextArea A1;
    JTextArea A2;

    JTextArea TA;

    JTextField Name_writingBar;
    JTextField Price_writingBar;
    JTextField Author1_writingBar;
    JTextField Author2_writingBar;
    JButton clear;
    bookstore()
    {
        setLayout(null);
        
        //registration_label=new JLabel("Registration");
        //registration_label.setBounds(60,0,500,500);
        //add(registration_label);
        


        book_name=new JLabel("Book Name");
        book_name.setBounds(50,20,400,400);
        add(book_name);
        
        price=new JLabel("Price");
        price.setBounds(50,60,400,400);
        add(price);
        
        author1=new JLabel("Author1");
        author2=new JLabel("Author2");
        author1.setBounds(50,100,400,400);
        author2.setBounds(50,140,400,400);
        add(author2);
        add(author1);
        
        Name_writingBar =new JTextField();
        Name_writingBar.setBounds(170,200,150,20);
        //Name_writingBar.setFont(new Font("SAN_SERIF",Font.PLAIN,16));
        add(Name_writingBar);


        Price_writingBar =new JTextField(); 
        Price_writingBar.setBounds(170,250,150,20);
        //Name_writingBar.setFont(new Font("SAN_SERIF",Font.PLAIN,16));
        add(Price_writingBar);
        
        
        Author1_writingBar =new JTextField();
        Author1_writingBar.setBounds(170,290,150,20);
        //Name_writingBar.setFont(new Font("SAN_SERIF",Font.PLAIN,16));
        add(Author1_writingBar);

        
        Author2_writingBar =new JTextField();
        Author2_writingBar.setBounds(170,340,150,20);
        //Name_writingBar.setFont(new Font("SAN_SERIF",Font.PLAIN,16));
        add(Author2_writingBar);
        
        clear=new JButton("clear");
        clear.setBounds(200,400,100,50);
        add(clear);
        clear.addActionListener(this);
        
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==clear)
        {
            String get=Name_writingBar.getText();
            if(get.equals("notepad"));
            {
                Runtime.getRuntime().exec("notepad");
            }
        }
    }

}

public class book  {
    public static void main(String[] args) 
    {
        bookstore obj=new bookstore();
        obj.setVisible(true);
        obj.setSize(400,600);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }    

}
