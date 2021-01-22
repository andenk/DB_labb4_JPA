import java.sql.*;

import static java.sql.Connection.*;

public class Main {
//  "jdbc:sqlserver://localhost:1433;username=NAME;password=NAME;database=NAME"
private PreparedStatement createStmt;

public static void main(String[] args) {
        // Create a variable for the connection string.
        String connectionUrl = "jdbc:sqlserver://localhost:1433;username=Andenk;password=A;database=everyloop";


        try (Connection con = DriverManager.getConnection(connectionUrl); Statement stmt = con.createStatement();) {
            String SQL = "SELECT TOP 10 * FROM dbo.Users2";
            ResultSet rs = stmt.executeQuery(SQL);
                                //stmt.executeUpdate(sql);
            // Iterate through the data in the result set and display it.
            while (rs.next()) {
                System.out.println(rs.getString("UserName") + " " + rs.getString("LastName"));
            }
        }
        // Handle any errors that may have occurred.
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
