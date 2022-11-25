
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class InserirLivros {
    private final String url =  "localhost:0300/BDlivrariaUniversitaria";
private final String user = "postgres";
private final String password = "";
private static final String INSERT_USERS_SQL = "INSERT INTO users" +
"  (id, isbn, categoria, editora, publicacao,titulo,edicao ,volume,preco) VALUES " +
" id_isbn,id_categoria, id_editora, nm_titulo, dt_publicacao , nu_edicao,nu_volume,vl_preco);";
public static void main(String[] argv) throws SQLException {
    InserirLivros createTable = new InserirLivros();
CreateTable.InserirLivros();

}
public void inserInserirLivrosRecord() throws SQLException {
    System.out.println(INSERT_USERS_SQL);
    // Step 1: Establishing a Connection
    try (Connection connection = DriverManager.getConnection(url, user, password);
    // Step 2:Create a statement using connection object
    PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
    preparedStatement.setInt(1, 1);
    preparedStatement.setString(2, "Ricardo");
    preparedStatement.setString(3, "Abacaxi@gmail.com");
    preparedStatement.setString(4, "RS");
    preparedStatement.setString(5, "Luiz Santos");
    System.out.println(preparedStatement);

    preparedStatement.executeUpdate();
    } catch (SQLException e) {
    }
  
    }


}
