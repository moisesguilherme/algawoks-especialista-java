public class Calculadora {

    static double calcularMedia(int[] numeros) {
        int total = 0;
        // atalho digitar: numeros.fori
        // se precisar do indice é melhor usar esse for
        /*
        for(int i = 0; i < numeros.length; i++){
            total += numeros[i];
        }
        */

        // java 5 enhanced-for
        // for - se precisar ir até o final
        for (int numero : numeros) {
            total += numero;
        }

        return (double) total / numeros.length;
    }

}
