public class Principal {

    public static void main(String[] args) {
        Participante participante1 = new Participante();
        System.out.println(participante1.nome);
        System.out.println(participante1.saldoDePontos);

        Participante participante2 = new Participante("Moisés");
        System.out.println(participante2.nome);
        System.out.println(participante2.saldoDePontos);

        Participante participante3 = new Participante("Moisés", -1);
        System.out.println(participante3.nome);
        System.out.println(participante3.saldoDePontos);

    }

}
