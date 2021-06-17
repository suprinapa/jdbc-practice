import java.sql.*;

public class MyJDBC
{

    public static void main(String[] args)
    {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc-practice", "root", "Root123.");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from people ");

            while (rs.next()) {
                System.out.println(rs.getString("FirstName"));

            }
        }
        catch (Exception e){
            e.getStackTrace();


            }
        }
    }

