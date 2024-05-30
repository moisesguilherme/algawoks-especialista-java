package com.algaworks.comercial.repositorio;

import com.algaworks.comercial.entidade.Venda;

import java.sql.*;

public class VendasRepositorio {

    public Venda adicionar(Venda venda) {
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
            comando.setString(1, venda.getNomeCliente());
            comando.setBigDecimal(2, venda.getValorTotal());
            comando.setDate(3, Date.valueOf(venda.getDataPagamento()));
            comando.executeUpdate();

            ResultSet codigoGeradoResultSet = comando.getGeneratedKeys();
            codigoGeradoResultSet.next();
            Long codigoGerado = codigoGeradoResultSet.getLong(1);

            //return codigoGerado;
            return new Venda(codigoGerado, venda.getNomeCliente(), venda.getValorTotal(), venda.getDataPagamento());
        } catch (SQLException e) { // Problema de infraestrutura (perssistência dos dados)
            throw new PersistenciaException(e);
        }
    }


}
