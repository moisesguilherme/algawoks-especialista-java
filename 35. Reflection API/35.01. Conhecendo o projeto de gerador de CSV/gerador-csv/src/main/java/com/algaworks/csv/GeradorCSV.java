package com.algaworks.csv;

import com.algaworks.crm.entidade.Cliente;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GeradorCSV {
    // Reflection API
    public static <T> void imprimir(List<Cliente> objetos) {

        // precisa adicionar manualmente
        //System.out.println("codigo;nome;dataNascimento");

        //Class c = Cliente.class;
        //System.out.println(Arrays.toString(Cliente.class.getMethods()));
        //System.out.println(Arrays.toString(Cliente.class.getDeclaredFields())); // propriedades
        // [public java.lang.Long com.algaworks.crm.entidade.Cliente.getCodigo(), public java.lang.String com.algaworks.crm.entidade.Cliente.getNome(), public java.time.LocalDate com.algaworks.crm.entidade.Cliente.getDataNascimento(), public boolean java.lang.Object.equals(java.lang.Object), public java.lang.String java.lang.Object.toString(), public native int java.lang.Object.hashCode(), public final native java.lang.Class java.lang.Object.getClass(), public final native void java.lang.Object.notify(), public final native void java.lang.Object.notifyAll(), public final void java.lang.Object.wait(long) throws java.lang.InterruptedException, public final void java.lang.Object.wait(long,int) throws java.lang.InterruptedException, public final void java.lang.Object.wait() throws java.lang.InterruptedException]
        // Java lang reflect (Pacote)
        Field[] propriedades = Cliente.class.getDeclaredFields();

        System.out.println(
                Arrays.stream(propriedades)
                        .map(Field::getName)
                        .collect(Collectors.joining(";"))
        );



        objetos.forEach(GeradorCSV::imprimir);
    }

    private static void imprimir(Cliente cliente) {
        System.out.printf("%d;%s;%s%n", cliente.getCodigo(),
                cliente.getNome(), cliente.getDataNascimento());
    }

}