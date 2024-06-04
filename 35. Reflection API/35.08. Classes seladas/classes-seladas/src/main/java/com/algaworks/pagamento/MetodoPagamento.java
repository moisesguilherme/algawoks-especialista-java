package com.algaworks.pagamento;

import java.math.BigDecimal;

public abstract class MetodoPagamento {

    private BigDecimal tarifa;

    public MetodoPagamento(BigDecimal tarifa) {
        this.tarifa = tarifa;
    }

    public BigDecimal getTarifa() {
        return tarifa;
    }

    public void setTarifa(BigDecimal tarifa) {
        this.tarifa = tarifa;
    }

}
