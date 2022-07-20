public class Paciente {

    double peso;
    double altura;

    double calcularIndiceMassaCorporal() {
        double imcCalculado  = peso / (altura * altura);

        return imcCalculado;
    }

}
