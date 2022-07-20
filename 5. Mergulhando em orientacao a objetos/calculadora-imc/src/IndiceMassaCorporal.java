public class IndiceMassaCorporal {

    double resultado;
    double peso;
    double altura;

    boolean estaComObsesidade() {
        return resultado >= 30;
    }

    boolean estaAbaixoDoPesoIdeal() {
        return resultado < 18.5;
    }

}
