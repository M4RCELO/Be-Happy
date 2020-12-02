package dominio;

import java.util.ArrayList;

import armazenamento.ArmazenamentoTurmas;

public class Turmas {
	
	private ArmazenamentoTurmas armazenamento;
    private Integer turma;
    private ArrayList<Aluno> listaAlunos;

    public Turmas(Integer turma) {
        this.turma = turma;
        armazenamento = new ArmazenamentoTurmas(turma);
        listaAlunos = armazenamento.recuperarTurmas();
    }
    
    public void adicionarAluno(Aluno novoAluno){
        listaAlunos.add(novoAluno);
    }

    public Integer getTurma() {
        return turma;
    }

    public void setTurma(Integer turma) {
        this.turma = turma;
    }

    public ArrayList<Aluno> getListaAlunos() {
        return listaAlunos;
    }

    public void setListaAlunos(ArrayList<Aluno> listaAlunos) {
        this.listaAlunos = listaAlunos;
    }
}
