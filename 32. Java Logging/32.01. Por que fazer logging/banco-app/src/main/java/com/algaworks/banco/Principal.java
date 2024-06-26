package com.algaworks.banco;

import com.algaworks.banco.negocio.ContaCorrente;
import com.algaworks.banco.negocio.SaldoInsuficienteException;
import com.algaworks.banco.negocio.Titular;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;

public class Principal {
    /*

    Log é organizado de forma hierarquica
    root (raiz)
    - com
      - algaworks
        - banco
            - negocio (pai)
                - ContaCorrente
                - Titular
            - Principal

    Error - mais crítico
    Warn - Uma alerta
    INFO - Apenas uma informação, não é um erro
    DEBUG - Para efetuar debug, geralmente fica desativado
    TRACE - Nível granular (pode deixar lento pela quantidade de logs)
    */

    private static final Logger logger = LoggerFactory.getLogger(Principal.class);

    public static void main(String[] args) {

        logger.info("Teste info");

        var titular = new Titular("João", "12312312399");
        var contaCorrente = new ContaCorrente(titular, 100, 9999);

        try {
            logger.debug("Manipulando conta corrente...");
            contaCorrente.depositar(new BigDecimal("200"));
            contaCorrente.sacar(new BigDecimal("50.5"));
            //contaCorrente.sacar(new BigDecimal("300"));
            contaCorrente.sacar(new BigDecimal("-10"));
        } catch (SaldoInsuficienteException e){
            // passando a excecão
            logger.warn("Pedido de saque com saldo insuficiente para conta "
                    + contaCorrente.getAgencia() + "/" + contaCorrente.getNumero(), e );
            //logger.warning("Pedido de saque com saldo insuficiente para conta "
            //        + contaCorrente.getAgencia() + "/" + contaCorrente.getNumero());
        } catch (Exception e) {
            logger.error("Erro administrando conta corrente" +
                    contaCorrente.getAgencia() + "/" + contaCorrente.getNumero(), e);
        }

    }

}
