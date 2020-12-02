package menu.professor.Relatorio;

import armazenamento.ArmagenamentoRelatosProfessor;
import outros.ObterValores;

public class RelatorioProfessor extends ObterValores {
    ArmagenamentoRelatosProfessor armagenamentoRelatosProfessor = new ArmagenamentoRelatosProfessor();

    public void RelatorioDosProfessores(int tipo){ // colocar para ser os relatos só da turma do professor
            String texto = armagenamentoRelatosProfessor.lerTexto();
            String[] users = texto.split(";");
            for (int i = 0; i < users.length; i++) {
                System.out.println(users[i]);
            }

    }
}
