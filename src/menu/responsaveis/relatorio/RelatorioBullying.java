package menu.responsaveis.relatorio;

import armazenamento.ArmagenamentoRelatosProfessor;
import armazenamento.ArmazenamentoRelatos;
import outros.ObterValores;

public class RelatorioBullying extends ObterValores {
    ArmazenamentoRelatos relatos = new ArmazenamentoRelatos();

    public void RBullying(String matriculaAluno){
        String texto = relatos.lerTexto();
        String[] users = texto.split(";");
        for (int i = 0; i < users.length; i++) {
            String[] matriz_users = users[i].split(",");
            matriz_users[0] = matriz_users[0].replace(" ", "");
            if (matriz_users[0].equals(matriculaAluno)){
                System.out.println(users[i]);
            }
        }
    }

}
