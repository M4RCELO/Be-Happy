package menu.professor.Relatorio;

import armazenamento.ArmagenamentoHumorAlunosProfessor;
import armazenamento.ArmagenamentoRelatosProfessor;
import outros.ObterValores;

public class RelatorioProfessor extends ObterValores {
    ArmagenamentoRelatosProfessor armagenamentoRelatosProfessor = new ArmagenamentoRelatosProfessor();
    ArmagenamentoHumorAlunosProfessor armagenamentoHumorAlunosProfessor = new ArmagenamentoHumorAlunosProfessor();

    public void RelatorioDosProfessores(int tipo){ // colocar para ser os relatos só da turma do professor
        if(tipo==1){
            String texto = armagenamentoRelatosProfessor.lerTexto();
            String[] users = texto.split(";");
            for (int i = 0; i < users.length; i++) {
                System.out.println(users[i]);
            }
        }
        else if(tipo==2){ // colocar para ser os relatos só da turma do professor
            String texto = armagenamentoHumorAlunosProfessor.lerTexto();
            String[] users = texto.split(";");
            for (int i = 0; i < users.length; i++) {
                System.out.println(users[i]);
            }
        }
    }
}
