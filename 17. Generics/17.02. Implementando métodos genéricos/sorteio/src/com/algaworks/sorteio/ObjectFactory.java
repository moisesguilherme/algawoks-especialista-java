package com.algaworks.sorteio;

public class ObjectFactory<T> {
    // Desafio:
    // Criar uma método que recebe um tipo de objeto
    // genérico e ele cria esse objeto dinamicamente.
    // essa classe nào pode conhecer o tipo

    //Criar um objeto do tipo generico
    public static <T> T tipo(T type){
        //Declarar com o objeto
        //Class<T> type = new<T>()
        /*if(type instanceof String){
             obj = (T) type;
        } else if (type instanceof Integer){
             obj = (T) type;
        } else if(type instanceof Cliente){
            obj = (T) type;
        }*/

        //return new type.componentType();
        T obj = (T) type; //Ainda não cria o obj, e sim retornar ele.
        return obj;

    }
}
