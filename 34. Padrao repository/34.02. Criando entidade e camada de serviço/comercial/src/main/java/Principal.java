import com.algaworks.comercial.entidade.Venda;
import com.algaworks.comercial.repositorio.FabricaDeRepositorio;
import com.algaworks.comercial.repositorio.VendaRepositorio;
import com.algaworks.comercial.repositorio.mysql.MySQLVendaRepositorio; //forte acoplamento
import com.algaworks.comercial.servico.CadastroVendaServico;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.time.LocalDate;

public class Principal {

    public static void main(String[] args) throws SQLException {
        // try-with-resource
        try(var fabriacaDeRepositorio = new FabricaDeRepositorio()) {
            // Inverteu o controle do fluxo, a classe VendaRepositorio que fazia a conxecao
            // quem estabelece a conexao agora está de fora da classe
            // injeta a conexao
            VendaRepositorio mySQLVendaRepositorio = fabriacaDeRepositorio.criarVendaRepositorio();
            // injeta o vendaRepositorio
            var cadastroVendaServico = new CadastroVendaServico(mySQLVendaRepositorio);


            Venda vendaCadastrada = cadastroVendaServico.cadastrar("Moisés Paschoalick",
                    new BigDecimal("12300.87"), LocalDate.parse("2023-04-19"));

            System.out.println("Venda cadastrada: " + vendaCadastrada);

            System.out.println("Listando todas as vendas:");
            var todasVendas = mySQLVendaRepositorio.consultar(); //não passa pela classe de serviço
            todasVendas.forEach(System.out::println);
        }
    }
}
