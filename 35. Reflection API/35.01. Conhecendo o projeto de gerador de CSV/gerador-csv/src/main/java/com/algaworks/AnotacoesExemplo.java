package com.algaworks;

import java.util.Date;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;

public class AnotacoesExemplo {

    public static void main(String[] args) {

        IntPredicate predicate = num -> num > 10;
        IntFunction<String> function = num -> "Número: " + num;
        IntSupplier supplier = () -> 10;
        IntConsumer consumer = num -> System.out.println("Número: " + num);

        Date data = new Date();
        //@Deprecated -> adiciona meta-dados
    }

}
