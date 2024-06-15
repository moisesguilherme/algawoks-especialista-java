import java.math.BigDecimal;
import java.sql.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Cadastro {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Valor total: ");
        BigDecimal valorTotal = new BigDecimal(scanner.nextLine());

        System.out.print("Data de pagamento: ");
        LocalDate dataPagamento = LocalDate.parse(scanner.nextLine(),
                DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        // Text block """ """
        String dml = """
                    insert into venda (
                        nome_cliente,
                        valor_total,
                        data_pagamento
                    ) values (?, ?, ?)
                """;

        try (Connection conexao = DriverManager
                .getConnection("jdbc:mysql://localhost:3306/ej_comercial", "root", "Root@123");
            PreparedStatement comando = conexao.prepareStatement(dml)) {
            comando.setString(1, nome);
            comando.setBigDecimal(2, valorTotal);
            comando.setDate(3, Date.valueOf(dataPagamento)); //java.sql tranformar um LocalDate para java.sql date
            comando.executeUpdate(); //retorna quantas linhas foram alteradas

            System.out.println("Venda cadastrada");
        } catch (SQLException e) {
            System.out.println("Erro cadastrando venda");
            e.printStackTrace();
        }

    }

}
