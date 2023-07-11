import java.sql.*;

import javax.print.DocFlavor.STRING;
public class App {
    public static void main(String[] args) throws Exception {

        String url="jdbc:mysql://localhost:3306/studentdb";
        String user="root";
        String password="*#@kk901";
     
                    //TO STORE DATA TASK#2
        try {       
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(url, user, password);
            Statement stm=con.createStatement();

            String rec1="insert into students values ('60','name','2020','Software','second')";
            stm.executeUpdate(rec1);
        } catch (Exception e) {
            System.out.println(e);
            //TODO: handle exception
        }

                    //  TO DISPLAY RECORDS TASK#3         
        // try {       
        //     Class.forName("com.mysql.cj.jdbc.Driver");
        //     Connection con=DriverManager.getConnection(url, user, password);
        //     Statement stm=con.createStatement();
        //     String sql="select * from students where semester = 'second'";
        //     ResultSet rs=stm.executeQuery(sql);

        //     while (rs.next()) {
        //         System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5));
        
        //     }
        // } catch (Exception e) {
        //     System.out.println(e);
        //     //TODO: handle exception
        // }

        

                //    TO Update RECORDS TASK#4         
        // try {       
        //     Class.forName("com.mysql.cj.jdbc.Driver");
        //     Connection con=DriverManager.getConnection(url, user, password);
        //     Statement stm=con.createStatement();
        //     String sql="update students set name='asim', batch='2021', dept='CS' , semester='first'  where rollno = '60'";
        //     stm.executeUpdate(sql);
            
        // } catch (Exception e) {
        //     System.out.println(e);
        //     //TODO: handle exception
        // }

            //    TO Delete RECORDS TASK#5         
        // try {       
        //     Class.forName("com.mysql.cj.jdbc.Driver");
        //     Connection con=DriverManager.getConnection(url, user, password);
        //     Statement stm=con.createStatement();
        //     String sql="delete from students where semester='first'";
        //     stm.executeUpdate(sql);
            
        // } catch (Exception e) {
        //     System.out.println(e);
        //     //TODO: handle exception
        // }
                      

    }
}
