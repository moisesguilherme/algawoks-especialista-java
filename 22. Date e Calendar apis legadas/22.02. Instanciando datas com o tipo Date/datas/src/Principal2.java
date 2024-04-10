import java.util.Date;

public class Principal2 {

    public static void main(String[] args) {

        Date hoje = new Date();
        Date ontem = new Date(System.currentTimeMillis() - (24 * 60 * 60 * 1000));

        System.out.println(hoje.getTime());  //1702_9_44718890
        System.out.println(ontem.getTime()); //1702_8_58318890

        Long diferencaMillis = hoje.getTime() - ontem.getTime();
        System.out.println(diferencaMillis); //86400000

        double diferencaHoras = diferencaMillis / 1000 / 60 / 60;
        double diferencaDias = diferencaMillis / 1000 / 60 / 60 / 24;

        System.out.printf("Diferenca em horas: %.2f%n", diferencaHoras);
        System.out.printf("Diferenca em dias: %.2f%n", diferencaDias);


        System.out.printf("Depois: %b%n", hoje.after(ontem));
        System.out.printf("Antes: %b%n", hoje.before(ontem));

        System.out.printf("Comparacão %d%n", hoje.compareTo(ontem)); //1
        System.out.printf("Comparacão %d%n", ontem.compareTo(hoje)); //-1


    }
}
