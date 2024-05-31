package com.algaworks.comercial.repositorio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
// permite fechar a conexão com AutoCloseable
public class FabricaDeRepositorio implements AutoCloseable{

    private final Connection conexao;

    public FabricaDeRepositorio() {
        try {
            this.conexao = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/ej_comercial", "root", "Root@123");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        // não pode fechar a conexão com o try-with-resource
    }

    public VendaRepositorio criarVendaRepositorio() {
        return new VendaRepositorio(conexao);
    }

    @Override
    public void close() {
        try {
            conexao.close();
        } catch (SQLException e) {
            throw new PersistenciaException(e);
        }
    }
}
