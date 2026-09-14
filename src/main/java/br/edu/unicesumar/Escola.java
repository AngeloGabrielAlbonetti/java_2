package br.edu.unicesumar;

public class Escola {
    private String nome;
    private Prefessor prefessor;

    public Escola(String nome, Prefessor prefessor){
        this.nome=nome;
        this.prefessor=prefessor;
    }

    public String getNome() {
        return nome;
    }

    public Prefessor getPrefessor() {
        return prefessor;
    }
}
