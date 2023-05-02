package com.algaworks.matematica;


public class CalculadoraArea {

    // Quando não tem nehum construtor, é o padrão sem argumento
    // Não vai conseguir instanciar um objeto
    private CalculadoraArea() {

    }

    public static final double PI = 3.14159265358979323846;
    public static double calcularAreaQuadrado(double medidaDoLado) {
        return medidaDoLado * medidaDoLado;
    }

    public static double calcularAreaCirculo(double raio) {
        return raio * raio * CalculadoraArea.PI;
    }

}
