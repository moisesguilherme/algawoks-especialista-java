package com.algaworks.pagamento;

public interface DocumentoPagavel{

    // Assinar o DocumentoPagavel
    // Todos DocumentoPagavel precisa ter o método;
    public abstract double getValorTotal();

    // Todos método é public asbstract, mesmo sem colocar.
    Beneficiario getBeneficiario();

}
