public class Calculadora {

    static double calcularMedia(int[] numeros) {
        int total = 0;

        for(int i = 0; i < numeros.length; i++){
            total += numeros[i];
        }

        return (double) total / numeros.length;
    }

}
