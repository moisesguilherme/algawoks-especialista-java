package com.algaworks.sorteio;

public class ObjectFactory<T> {
    // Desafio:
    // Criar uma método que recebe um tipo de objeto
    // genérico e ele cria esse objeto dinamicamente.
    // essa classe nào pode conhecer o tipo

    //Criar um objeto do tipo generico
    public static<T> T tipo(Class<T> type){
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
        T obj = null;
        try{
            obj = type.newInstance();
        }catch(Exception e){
            System.out.println("Erro: " + e);
        }
        return obj;
    }
}
