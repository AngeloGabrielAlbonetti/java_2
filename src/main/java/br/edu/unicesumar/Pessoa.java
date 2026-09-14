package br.edu.unicesumar;

public class Pessoa {
    private String nome;
    private Endereço endereço;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public Endereço getEndereço() {
        return endereço;
    }

    public String getNome() {
        return nome;
    }

    public void setEndereço(Endereço endereço) {
        this.endereço = endereço;
    }
}
