package dominio;

import java.util.ArrayList;

public class TurmasComposite {
    private Integer turma;
    private ArrayList<Aluno> listaAlunos;

    public TurmasComposite(Integer turma) {
        this.turma = turma;
        listaAlunos = new ArrayList<Aluno>();
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
