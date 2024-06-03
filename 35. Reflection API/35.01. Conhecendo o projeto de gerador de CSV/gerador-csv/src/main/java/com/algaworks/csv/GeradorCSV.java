package com.algaworks.csv;

import com.algaworks.crm.entidade.Cliente;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GeradorCSV {
    // Reflection API
    // Class é palavra reservada, por isso o nome clazz (com z)
    public static <T> void imprimir(Class<T> clazz, List<T> objetos) {

        Field[] propriedades = clazz.getDeclaredFields();

        System.out.println(
                Arrays.stream(propriedades)
                        .map(Field::getName)
                        .collect(Collectors.joining(";"))
        );

        objetos.forEach(GeradorCSV::imprimir);
    }

    private static void imprimir(Object cliente)  {
        Field[] propriedades = cliente.getClass().getDeclaredFields();
        List<String> valores = new ArrayList<>();

        try {
            for (Field propriedade : propriedades) {
                //System.out.println(propriedade.getName());
                propriedade.setAccessible(true);
                Object resultado = propriedade.get(cliente);
                //System.out.println(resultado);
                valores.add(resultado == null ? "" : resultado.toString());
            }

            //System.out.println(valores.stream().collect(Collectors.joining(";")));
            System.out.println(String.join(";", valores));

        } catch (IllegalAccessException e) { // Check Exception (precisa tratar)
            throw new RuntimeException(e); // Uncheck Exception (Não precisa tratar)
        }

        /*System.out.printf("%d;%s;%s%n", cliente.getCodigo(),
                cliente.getNome(), cliente.getDataNascimento());*/
    }

}