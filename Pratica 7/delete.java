import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Delete {
    private static final String DELETE_USERS_SQL = "delete from
    userdata ('id') != $_POST['id']);
    private final String url =  "localhost:0300/BDlivrariaUniversitaria";
private final String user = "localhost";
private final String password = "";

public static void main(String[] argv) throws SQLException {
    Delete deleteStatementExample = new
    Delete();
deleteStatementExample.deleteRecord();
}
public void deleteRecord() throws SQLException {
System.out.println(DELETE_USERS_SQL);
try (Connection connection = DriverManager.getConnection(url, user, 
password);
PreparedStatement preparedStatement = 
connection.prepareStatement(DELETE_USERS_SQL);) {
preparedStatement.setInt(1, 1);

int result = preparedStatement.executeUpdate();
System.out.println("Number of records affected :: " + result);
} catch (SQLException e) {

Delete();
}

}