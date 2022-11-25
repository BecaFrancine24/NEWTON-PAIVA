
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Buscar {
    private final String url =  "localhost:0300/BDlivrariaUniversitaria";
private final String user = "localhost";
private final String password = "";
private static final String INSERT_USERS_SQL = "SELECT * FROM livro where vl_preco >= 10.00;" +
"  (SELECT * FROM livro where nm_titulo = 'Engenharia de Software';) VALUES ";
public static void main(String[] argv) throws SQLException {
    Buscar createTable = new Buscar();
CreateTable.Buscar();

}
public void inserInserirLivrosRecord() throws SQLException {
    System.out.println(INSERT_USERS_SQL);
    // Step 1: Establishing a Connection
    try (Connection connection = DriverManager.getConnection(url, user, password);
    // Step 2:Create a statement using connection object
    PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
    preparedStatement.setInt(1, 1);
    preparedStatement.setString(2, "Abacaxi");
    preparedStatement.setString(3, "Abacaxi@gmail.com");
    preparedStatement.setString(4, "RS");
    preparedStatement.setString(5, "Luiz Santos");
    System.out.println(preparedStatement);

    preparedStatement.Buscar();
    } catch (SQLException e) {
    }
  
    }


}