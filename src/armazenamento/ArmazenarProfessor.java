package armazenamento;

import buscas.Login;
import dominio.AlunoLogado;
import dominio.ProfessorLogado;
import outros.DataEHora;

public class ArmazenarProfessor {
    private ArmazenamentoHumorAlunosProfessor armagenamentoHumorAlunosProfessor = new ArmazenamentoHumorAlunosProfessor();
    private ArmagenamentoRelatosProfessor armagenamentoRelatosProfessor = new ArmagenamentoRelatosProfessor();
    private ProfessorLogado professor = Login.professorLogado;
    private AlunoLogado aluno = Login.alunoLogado;
    private DataEHora dataEHora = new DataEHora();

    public void humor(String humor) {
        String infos = professor.getMatricula().toString()+", "+aluno.getMatricula().toString()+", "+humor+", "+dataEHora.getData()+", "+dataEHora.getHora()+" ;";
        armagenamentoHumorAlunosProfessor.escreverTexto(infos);
    }
    public void relato(String relatoStr) {
        String infos = professor.getMatricula().toString()+", "+aluno.getMatricula().toString()+", "+relatoStr+", "+dataEHora.getData()+", "+dataEHora.getHora()+" ;";
        armagenamentoRelatosProfessor.escreverTexto(infos);
    }
}
