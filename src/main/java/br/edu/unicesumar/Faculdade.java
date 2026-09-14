package br.edu.unicesumar;

import java.util.ArrayList;

public class Faculdade {
    private String curso;
    private ArrayList<Alunos> alunos;

    public Faculdade(String curso) {
        this.alunos = new ArrayList<>();
        this.curso = curso;
    }

    public void adiconarAluno(Alunos alunos) {
        this.alunos.add(alunos);
    }

    public String mostan(int v) {
        alunos.get(v).getNome();
        return alunos.get(v).getNome();
    }

    public void mostrarTudo(){
        for (Alunos aluno: alunos){
            System.out.printf("\n%d %s", aluno.getIdade(),aluno.getNome());

        }

    }
}
