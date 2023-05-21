package com.algaworks.agenda;

// Códigos boilerplate, muito setters e getters
// Java 14 e lancado no java 16 é o record
// toda classe record já é final, é uma classe imutável
public record Horario(int hora, int minuto) {
    // define a lista de propriedades: int hora, int minuto
    // o compilador cria automaticamente as variáveis de instância
    // private int hora;
    // private int minuto
    // também cria um construtor

    //Cria de uma forma implícita, não pode alterar a ordem do construtor
    /*public Horario(int hora, int minuto) {
         if (hora < 0 || hora > 23) {
             throw new IllegalArgumentException("Hora inválida: " + hora);
         }
         if(minuto < 0 || minuto > 59) {
             throw new IllegalArgumentException("Minuto inválido: " + minuto);
         }

         this.hora = hora;
         this.minuto = minuto;
     }*/

    //Compact constructor, sem parâmetros
    public Horario {
        if (hora < 0 || hora > 23) {
            throw new IllegalArgumentException("Hora inválida: " + hora);
        }
        if(minuto < 0 || minuto > 59) {
            throw new IllegalArgumentException("Minuto inválido: " + minuto);
        }

        //sem this, ele coloca automáticamente
        //this.hora = hora;
        //this.minuto = minuto;
    }


    public String formatar() {
        return String.format("%dh%dm", hora, minuto); //ou hora(), minuto()
    }

}