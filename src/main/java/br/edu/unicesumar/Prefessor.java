package br.edu.unicesumar;

public class Prefessor {
    private  String nome;
    private  String diciplina;

    public Prefessor(String nome, String diciplina){
        this.nome=nome;
        this.diciplina=diciplina;
    }

    public String getNome() {
        return nome;
    }

    public String getDiciplina() {
        return diciplina;
    }
}
