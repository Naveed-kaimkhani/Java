import javax.swing.*;
public class simpleWindow
{
    public static void main(String[] args)
    {
        JFrame jf= new JFrame("Java GUI");
        jf.setSize(300,300);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}