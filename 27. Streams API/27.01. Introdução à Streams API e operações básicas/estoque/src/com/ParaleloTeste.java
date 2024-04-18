package com;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ParaleloTeste {


    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
        Optional<Integer> oNumero = numeros.parallelStream()
                .peek(System.out::println)
                .filter(n -> n % 2 == 0)
                //.findFirst();
                .findAny();
        System.out.println("----------");
        System.out.println(oNumero.orElseThrow());
   }


}
