import java.math.BigDecimal;
import java.sql.*;
import java.time.LocalDate;

public class CadastroVenda {

    public Long cadastrar(String nomeCliente, BigDecimal valorTotal, LocalDate dataPagamento) {
        if (valorTotal.compareTo(BigDecimal.ZERO) <= 0) {
            throw new RuntimeException("Valor total deve ser maior que 0");
        }
        if (dataPagamento.isAfter(LocalDate.now())) {
            throw new RuntimeException("Data do pagamento não pode ser uma data futura");
        }

        String dml = """
            insert into venda (
                nome_cliente,
                valor_total,
                data_pagamento
            )
            values (?, ?, ?)
            """;

        try (Connection conexao = DriverManager
                .getConnection("jdbc:mysql://localhost:3306/ej_comercial", "root", "Root@123");
             PreparedStatement comando = conexao.prepareStatement(dml, Statement.RETURN_GENERATED_KEYS)) {
            comando.setString(1, nomeCliente);
            comando.setBigDecimal(2, valorTotal);
            comando.setDate(3, Date.valueOf(dataPagamento));
            comando.executeUpdate();

            ResultSet codigoGeradoResultSet = comando.getGeneratedKeys();
            codigoGeradoResultSet.next();
            Long codigoGerado = codigoGeradoResultSet.getLong(1);

            return codigoGerado;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
