public class Principal {

    public static void main(String[] args) {
        CalculadoraImc calculadoraImc = new CalculadoraImc();
        calculadoraImc.altura = 1.80;
        calculadoraImc.peso = 120;

        IndiceMassaCorporal imc = calculadoraImc.calcular();

        if (imc.estaComObsesidade()) {
            System.out.printf("Paciente com altura de %.2f e peso de %.2f " +
                    "está com obesidade%n", imc.altura, imc.peso);
        }
        System.out.printf("IMC: %.2f%n", imc.resultado);
    }

}
