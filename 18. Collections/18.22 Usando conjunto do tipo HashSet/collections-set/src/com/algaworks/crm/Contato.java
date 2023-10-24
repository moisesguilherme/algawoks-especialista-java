package com.algaworks.crm;

import java.util.Objects;

public class Contato {

    private String nome;
    private String email;
    private int idade;

    public Contato(String nome, String email, int idade) {
        Objects.requireNonNull(nome);
        Objects.requireNonNull(email);
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", idade=" + idade +
                '}';
    }

    // equals e hashcode com template, java.utils.Object, java 7+
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;
        return Objects.equals(email, contato.email);
    }

    // Boa prática sempre sobrescrever o método hashCode quando for alter o equals
    @Override
    public int hashCode() {
        return Objects.hash(email);
    }
}
