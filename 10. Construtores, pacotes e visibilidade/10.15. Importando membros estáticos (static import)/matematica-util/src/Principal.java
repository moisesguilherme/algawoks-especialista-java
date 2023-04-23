// adicionou o import static
import static com.algaworks.matematica.CalculadoraArea.*;

public class Principal {

    public static void main(String[] args) {
        // Acessa
        // acessar um membro ou mais de um membro estático
        // alt+enter em calcularAreaQuadra, para adicionar o import (linha 4)
        // antes - CalculadoraArea.calcularAreaQuadrado
        double areaQuadrado = calcularAreaQuadrado(5.2);
        double areaCirculo =  calcularAreaCirculo(10.5);

        System.out.printf("PI: %.2f%n",  PI);
        System.out.printf("Área do quadrado: %.2f%n", areaQuadrado);
        System.out.printf("Área do círculo: %.2f%n", areaCirculo);
    }

}
