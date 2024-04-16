package exemploNPE;

import java.util.Optional;

public class Principal {

    public static class Passageiro {
        private String nome;
        private String sobreNome;

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getSobreNome() {
            return sobreNome;
        }

        public void setSobreNome(String sobreNome) {
            this.sobreNome = sobreNome;
        }

        public Optional buscaSobreNome() {
            return Optional.ofNullable(sobreNome);
        }
    }

    public static void main(String[] args) {

        Principal.Passageiro passageiro = new Passageiro();
        passageiro.setNome("Moisés");
        passageiro.setSobreNome(" Freitas ");

        Optional<String> sobrenome = passageiro.buscaSobreNome();

        /*if(passageiro.getSobreNome().equalsIgnoreCase("Freitas")) {
            System.out.println(passageiro.getSobreNome());
        }*/

        if(sobrenome.isPresent()) {
            System.out.println(passageiro.getSobreNome());
        }

    }

}
