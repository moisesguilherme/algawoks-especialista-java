package com.algaworks.sorteio;

import java.lang.reflect.Constructor;

// Desafio usando generics:
// Criar uma método que recebe um tipo de objeto
// genérico e o mesmo cria o objeto dinamicamente.
// Essa classe não pode conhecer o sue tipo

public class GenericsExample {
    public static<T> T createInstance(Class<T> clazz){

        // Classes que não possuem um construtor público
        if(clazz == Integer.class) {
            return clazz.cast(Integer.valueOf(0));
        }

        try{
            Constructor<T> constructor = clazz.getDeclaredConstructor();
            return constructor.newInstance();
        } catch (NoSuchMethodException e) {
            System.err.println("A classe não tem um construtor padrão.");
            e.printStackTrace();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
