import java.sql.*;
public class jdbc {
    public static void main(String[] args){
       String url  = "jdbc:mysql://localhost:3306/adbms_2027?useSSL=false&allowPublicKeyRetrieval=true";
       String user = "root";
        String password = "Pa@190704";

        String sql = "delete from student where id = ?";

        try(Connection conn = DriverManager.getConnection(url, user, password)){
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("Select * from student");
            while(rs.next()){
                System.out.println("ID: " + rs.getInt("id") + ", Name: " + rs.getString("name"));
            }
            System.out.println("connected!");
        }
        catch(SQLException sq){
            System.out.println(sq);
        }
    } 

    
}
