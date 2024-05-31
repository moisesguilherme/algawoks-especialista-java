package com.algaworks.comercial.repositorio.mysql;

import com.algaworks.comercial.repositorio.FabricaDeRepositorio;
import com.algaworks.comercial.repositorio.PersistenciaException;
import com.algaworks.comercial.repositorio.VendaRepositorio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLFabricaDeRepositorio implements FabricaDeRepositorio {

    private final Connection conexao;

    public MySQLFabricaDeRepositorio() {
        try {
            this.conexao = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/ej_comercial", "root", "Root@123");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public VendaRepositorio criarVendaRepositorio() {
        return new MySQLVendaRepositorio(conexao);
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
