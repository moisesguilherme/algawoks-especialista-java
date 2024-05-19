import javax.crypto.spec.PSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Principal {

    public static void main(String[] args) {

        //Connection é um AutoCloseble
        //try-with-research
        try (Connection conexao = DriverManager
                .getConnection("jdbc:mysql://localhost:3306/ej_comercial", "root", "");) {
            System.out.println("Conexão aberta!");

            System.out.println(conexao.getClass()); //ConnectionImpl
        } catch (SQLException e) {
            System.out.println("Erro de banco de dados");
            e.printStackTrace();
            //throw new RuntimeException(e);
        }

    }

}
