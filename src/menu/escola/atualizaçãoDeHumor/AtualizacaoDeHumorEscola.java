package menu.escola.atualizaçãoDeHumor;

import armazenamento.ArmazenamentoHumorAlunos;
import outros.ObterValores;

public class AtualizacaoDeHumorEscola extends ObterValores {
    ArmazenamentoHumorAlunos armazenamentoHumorAlunos = new ArmazenamentoHumorAlunos();

    public void VerAtualizacaohumor(String matriculo){
        String texto = armazenamentoHumorAlunos.lerTexto();
        String[] users = texto.split(";");
        for (int i = 0; i < users.length; i++) {
           System.out.println(users[i]);
        }
    }
}
