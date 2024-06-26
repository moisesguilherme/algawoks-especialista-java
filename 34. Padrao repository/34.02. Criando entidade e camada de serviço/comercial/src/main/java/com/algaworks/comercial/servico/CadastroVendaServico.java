package com.algaworks.comercial.servico;

import com.algaworks.comercial.entidade.Venda;
import com.algaworks.comercial.repositorio.VendaRepositorio;
import com.algaworks.comercial.repositorio.mysql.MySQLVendaRepositorio;

import java.math.BigDecimal;
import java.time.LocalDate;

// Ideia é não ter nenhum código de infra (conexão com banco)
// Apenas regras de negócios serviços
public class CadastroVendaServico {

    // A classe CadastroVendaServico tem um forte aclopamento com
    // a classe vendasRepositorio
    private final VendaRepositorio vendasRepositorio;

    public CadastroVendaServico(VendaRepositorio vendasRepositorio) {
        this.vendasRepositorio = vendasRepositorio;
    }

    public Venda cadastrar(String nomeCliente, BigDecimal valorTotal, LocalDate dataPagamento) {
        if (valorTotal.compareTo(BigDecimal.ZERO) <= 0) {
            throw new NegocioException("Valor total deve ser maior que 0");
        }
        if (dataPagamento.isAfter(LocalDate.now())) {
            throw new NegocioException("Data do pagamento não pode ser uma data futura");
        }

        // adicionar, nome igual como se fosse uma coleção (noms dos métodos)
        // Apenas usa o vendasRepositorio
        return vendasRepositorio.adicionar(new Venda(nomeCliente, valorTotal, dataPagamento));
    }

}
