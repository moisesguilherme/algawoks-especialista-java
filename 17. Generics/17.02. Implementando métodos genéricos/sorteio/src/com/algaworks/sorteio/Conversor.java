package com.algaworks.sorteio;

public class Conversor<T> {
    // É possível criar uma método que recebe parametros genéricos, mas que o retorno seja um tipo definido?
    public String converter(T t) {
        return "";
    }

    //Criar um objeto do tipo generico
    public static <T> T tipo(T t){

        //Declarar com o objeto
        //T obj = ;
        //Class<T> type = new<T>();
        //return type.newInstance();

        return t;
    }
}
