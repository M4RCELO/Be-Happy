package menu.responsaveis.relatorio;

import armazenamento.ArmazenamentoComportamentoDiario;
import outros.ObterValores;

public class RelatorioComportamental extends ObterValores {
    ArmazenamentoComportamentoDiario comportamentoDiario = new ArmazenamentoComportamentoDiario();

    public void RComportamental(String matriculaAluno){
        String texto = comportamentoDiario.lerTexto();
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
