public class Principal {

    public static void main(String[] args) {
        Paciente paciente = new Paciente();
        paciente.altura = 1.82;
        paciente.peso = 175;

        double imc = paciente.calcularIndiceMassaCorporal();

        System.out.printf("IMC: %.2f%n", imc);
    }

}
