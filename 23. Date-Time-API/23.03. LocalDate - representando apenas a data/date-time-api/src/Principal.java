import java.time.LocalDate;

public class Principal {

    public static void main(String[] args) {

        //LocalDate dataHoje = LocalDate.now();
        //System.out.println(dataHoje);
        // ISO-8601 -> 2023-12-28 (ano, mês e dia)

        //13/09/1981 - nasceu no Brasil as 9h da manhã
        //13/09/1981 - nasceu naa Austrália as 9h da manhã -> 13 horas à frente

        LocalDate dataNascimento = LocalDate.of(1981, 9, 13);
        System.out.println(dataNascimento);

        LocalDate diaDoProgramador = LocalDate.ofYearDay(2022, 256);
        System.out.println(diaDoProgramador);

    }

}
