import java.sql.*;
public class yr19_Q1 {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/studentdb";
        String user="root";
        String password="*#@kk901";
        
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(url, user, password);     
            Statement stm=con.createStatement();
            String sql="select * from studentdb";
            ResultSet rs=stm.executeQuery(sql);
            while(rs.next())
            {
                System.out.println(rs.getString(1)+" "+rs.getString(2)+rs.getString(3));
            }
        } catch (Exception e) {
            //TODO: handle exception
        
        }
      
    }
    
}
