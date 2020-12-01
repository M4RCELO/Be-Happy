package menu.responsaveis.relatorio;

import armazenamento.ArmagenamentoRelatosProfessor;
import outros.ObterValores;

public class RelatorioBullying extends ObterValores {
    ArmagenamentoRelatosProfessor relatosProfessor = new ArmagenamentoRelatosProfessor();

    public void RBullying(String matriculaAluno){
        String texto = relatosProfessor.lerTexto();
        String[] users = texto.split(";");
        for (int i = 0; i < users.length; i++) {
            String[] matriz_users = users[i].split(",");
            matriz_users[1] = matriz_users[1].replace(" ", "");
            if (matriz_users[1].equals(matriculaAluno)){
                System.out.println(users[i]);
            }
        }
    }

}
