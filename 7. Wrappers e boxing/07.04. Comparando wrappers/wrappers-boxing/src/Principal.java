public class Principal {

    public static void main(String[] args) {
        Integer numero1 = 128;
        Integer numero2 = 128;
        Short numero3 = 128;

        // Compara se for do mesmo tipo
        //System.out.println(numero1.equals(numero2));

        // Compara o conteúdo e o tipo também, por isso vai retornar false.
        //System.out.println(numero1.equals(numero3));
        // Precisamos converter para fazer a comparacão.
        System.out.println(numero1.intValue()== numero3.intValue());
    }

}
