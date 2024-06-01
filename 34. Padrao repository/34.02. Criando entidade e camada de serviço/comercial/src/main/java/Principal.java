import com.algaworks.comercial.entidade.Venda;
import com.algaworks.comercial.repositorio.FabricaDeRepositorio;
import com.algaworks.comercial.repositorio.VendaRepositorio;
import com.algaworks.comercial.servico.CadastroVendaServico;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    static final Scanner SCANNER = new Scanner(System.in);
    static final DateTimeFormatter FORMATADOR_DATA = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static void main(String[] args) throws SQLException {

        List<Venda> cadastroVendas = new ArrayList<>();

        // Evitar usar o MemoriaFabricaDeRepositorio() em outro local, na interface
        try(FabricaDeRepositorio fabriacaDeRepositorio = FabricaDeRepositorio.obterIntancia()) {
            VendaRepositorio vendaRepositorio = fabriacaDeRepositorio.criarVendaRepositorio();
            var cadastroVendaServico = new CadastroVendaServico(vendaRepositorio);

            cadastro(cadastroVendas);

            for (Venda cadastroVenda : cadastroVendas) {
                Venda vendaCadastrada = cadastroVendaServico.cadastrar(cadastroVenda.getNomeCliente(),
                        cadastroVenda.getValorTotal(), cadastroVenda.getDataPagamento());
            }

            System.out.println("Listando todas as vendas:");
            var todasVendas = vendaRepositorio.consultar();
            todasVendas.forEach(System.out::println);
        }

    }

    private static List<Venda> cadastro(List<Venda> cadastroVendas) {
        boolean exit = false;

        while(!exit){
            System.out.println("---[ Cadastro de venda ]---");
            System.out.print("Nome: ");
            String nome = SCANNER.nextLine();
            System.out.print("Valor: ");
            BigDecimal valor = SCANNER.nextBigDecimal();
            SCANNER.nextLine();
            LocalDate data = obterDataVenda();

            System.out.print("\nDigite 0 para sair e 1 para continuar: ");
            int option = SCANNER.nextInt();
            SCANNER.nextLine();
            exit = option == 0;

            Venda venda = new Venda(nome, valor, data);
            cadastroVendas.add(venda);
        }
        SCANNER.close();
        return cadastroVendas;
    }

    private static LocalDate obterDataVenda() {
        while(true){
            try {
                System.out.print("Data: ");
                String data = SCANNER.nextLine();
                return LocalDate.parse(data, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            } catch (DateTimeParseException e) {
                System.out.println("Data inválida. Tente novamente.");
            }
        }
    }

}
