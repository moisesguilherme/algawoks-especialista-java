public class ShortCirOR {
    public static void main(String arg[])
    {

        boolean valorFinal = (ShortCirOR.imprimir(true)
                || ShortCirOR.imprimir(false)
                || ShortCirOR.imprimir(true));

        System.out.println(valorFinal);

        // Since first operand is true
        // and operator is ||, 
        // Evaluation stops and 
        // true is returned.
        //The && and || operators "short-circuit", meaning they don't evaluate the right-hand side if it isn't necessary.

        if (true || false || false) {
            System.out.println("This output "
                    + "got printed actually, "
                    + " due to short circuit");
        }
        else {
            System.out.println("This output "
                    + "will not "
                    + "be printed");
        }

        // Whole expression will be evaluated, 
        // as no true is encountered 
        // before last condition 
        // Therefore no Short circuit 
        if (false || true || true) {
            System.out.println(">>> This output "
                    + "gets print"
                    + " as there will be"
                    + " no Short circuit");
        }
        else {

            System.out.println("This output "
                    + "will not "
                    + "be printed");
        }
    }

    public static boolean imprimir(boolean valor){
        System.out.println("Executou");
        return valor;
    }
}