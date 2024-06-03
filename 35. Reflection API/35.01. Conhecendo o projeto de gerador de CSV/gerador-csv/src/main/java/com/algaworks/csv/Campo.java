package com.algaworks.csv;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Meta anotações, uma anotação para funcionar as anotações

//CLASS OU RUNTIME -> tempo q a anotação vai ficar retida
// SOURCE -> somente é lida no código fonte
// RUNTIME -> em tempo de execução (retida no .class) quando estiver em execução.
// ElementType.TYPE -> a classe
//@Target( {ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.TYPE, ElementType.FIELD})
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Campo {


}
