package com.algaworks.financeiro;

import java.io.Serializable;

public class ContaPagar implements Serializable {

    private String descricao;
    private double valor;
    private String dataVencimento;
    private boolean pago;
    private Fornecedor fornecedor;

    public ContaPagar() {

    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        if(valor <= 0)
            throw new RuntimeException("O valor não pode ser negativo");
        this.valor = valor;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public boolean isPago() {
        return pago;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public void pagar() {
        if(isPago())
            throw new RuntimeException("A conta já foi paga");

        pago = true;
    }

    public void cancelarPagamento() {
        // Nao pode cancelar se nao estiver pago
        if(!isPago())
            throw new RuntimeException("A conta está pendente de pagamento");

        pago = false;
    }
}
