package com.algaworks.comercial.repositorio;

import com.algaworks.comercial.repositorio.memoria.MemoriaVendaRepositorio;
import com.algaworks.comercial.repositorio.mysql.MySQLVendaRepositorio;
import com.algaworks.comercial.repositorio.oracle.OracleVendaRepositorio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
// permite fechar a conexão com AutoCloseable
// usando o try-with-resource
public class FabricaDeRepositorio implements AutoCloseable {

    //private final Connection conexao;

    public FabricaDeRepositorio() {
        // não pode fazer conexão
        /*
        try {
            this.conexao = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/ej_comercial", "root", "Root@123");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }*/

        // não pode fechar a conexão com o try-with-resource
    }

    public VendaRepositorio criarVendaRepositorio() {
        //Se mudar o provider para Oracle, só mudar aqui na fábrica
        //return new MySQLVendaRepositorio(conexao);
        //return new OracleVendaRepositorio();
        return new MemoriaVendaRepositorio();
    }

    @Override
    public void close() {
      /*  try {
            conexao.close();
        } catch (SQLException e) {
            throw new PersistenciaException(e);
        }
       */
    }

}
