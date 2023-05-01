package com.algaworks.locacao.servico;

import com.algaworks.locacao.Locacao;
import com.algaworks.locacao.Veiculo;

public class ServicoDeLocacao {

    public void confirmarLocacao(Locacao locacao) {


        // Lei de Demeter (O objeto deve conhecer o mínimo possível da estrutra de outros objetos)
        // - só pode chamar método da própria instância.
        // - pode chamar os metódos dos parâmetros, neste caso locacão
        // - pode chamar métodos de variáveis de instâncias de outros objetos que estiver na classe
        // projeto fica mais manutenível
        // desvantagens: pode necessitar muitos métodos.
        
        // Train Wreck -> como se fosse um vagão, ().getX().getY()
        //double totalDiarias = locacao.getVeiculo().getGrupo().getValorDiaria()
        //        * locacao.getQuantidadeDiarias();

        // Código também ruim. Pede informacão e faz cálculo.
        // Tell don't ask
        //double totalDiarias = locacao.getValorDiaria()
        //        * locacao.getQuantidadeDiarias();

        double totalDiarias = locacao.calcularTotalDiarias();

        // TODO realiza lógica para registrar locação pelo valor das diárias

        // deixar o veículo reservado
        // locacao.getVeiculo().setDisponivel(false);
        locacao.reservarVeiculo();
    }

}
