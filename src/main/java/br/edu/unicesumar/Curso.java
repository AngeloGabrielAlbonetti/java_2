package br.edu.unicesumar;

public class Curso {
    private String nome;
    private Aluno[] aluno = new Aluno[3];

    public Curso(String nome){
        this.nome=nome;
    }

    public void alunos(Aluno aluno, int post){
        this.aluno[post] = aluno;
    }

    public Aluno[] getAluno() {
        return aluno;
    }
    public Aluno getAluno2() {
        return aluno[1];
    }
}
