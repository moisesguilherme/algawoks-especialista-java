import java.io.*;
import java.util.Scanner;

public class PrincipalPrintStream {


    public static void main(String[] args) throws IOException {
        //API de IO do Java
        System.out.println("PrintStream"); //System tem uma variável estática out
        //java. io. PrintStream

        PrintStream printStream  = System.out;
        OutputStream outPrintStream  = System.out;

        String nome = "Moises";
        printStream.printf("Olá, %s%n", nome);
        outPrintStream.write("Moisés".getBytes());

        PrintStream out  = new PrintStream(new FileOutputStream(new File("docs/arquivo.txt")));
        out.printf("Olá, %s %n", nome);
    }

}
