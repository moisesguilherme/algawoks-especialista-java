import java.io.*;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.Month;

import static java.nio.file.StandardOpenOption.CREATE;
import static java.nio.file.StandardOpenOption.WRITE;

public class PrincipalSerializar {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario("João",
                LocalDate.of(2005, Month.MARCH, 2),
                new BigDecimal("25000"));

        System.out.println(funcionario);

        Path path = Path.of("objetos/joao.ser");

        // API Clássica de IO
        /*
        try (var outputStream = new ObjectOutputStream(
                new FileOutputStream(path.toFile()))) {
            outputStream.writeObject(funcionario);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/

        // New IO
        try (var outputStream = new ObjectOutputStream(
                Files.newOutputStream(path, WRITE, CREATE))) {
            outputStream.writeObject(funcionario);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
