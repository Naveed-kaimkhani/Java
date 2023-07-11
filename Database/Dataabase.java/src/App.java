/*
step1: load the and register the driver by Class.forname("com.mysql.jdbc.Driver");
step2: built connection by Connection con=Drivermanager.getconnection()
step3: create statement Statement st=con.createstatment
step4: make Resultset rs=st.getString()
*/ 






import java.sql.*;
import java.text.NumberFormat.Style;
import com.mysql.cj.protocol.Resultset;

public class App {
    public static void main(String[] args) throws Exception 
    {
        String url="jdbc:mysql://localhost:3306/student";
        String user="root";
        String password="*#@kk901";

        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection(url, user, password);
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("select name from undergradute");
        
        
        while(rs.next())
        {   
            String name=rs.getString("name");
            System.out.println(name);

        }

     }
           // st.close();
            //con.close();
    
}

