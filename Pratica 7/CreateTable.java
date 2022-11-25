import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
    private final String url=
    "localhost:0300/BDlivrariaUniversitaria";
    private final String user = "localhost";
    private final String password = "";

    private static final String createTable = "CREATE TABLE 
    users " +
    "(ID INT PRIMARY KEY ," +
    " NAME TEXT, " +
    " EMAIL VARCHAR(50), " + 
    " PASSWORD VARCHAR(50))";
    public static void main(String[] argv) throws SQLException {
        CreateTable CreateTable = new
        CreateTable();
        CreateTable.createTable();
        }
        public void createTable() throws SQLException {
            System.out.println("Conexão Feita comSucesso!");
            try (Connection connection = DriverManager.getConnection(url, user, 
            password);
            Statement statement = connection.createStatement();) {
            statement.execute(createTableSQL);
            } catch (SQLException e) {
            printSQLException(e);
            }
            }


    
}
