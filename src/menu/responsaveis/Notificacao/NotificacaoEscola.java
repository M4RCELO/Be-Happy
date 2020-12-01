package menu.responsaveis.Notificacao;

import armazenamento.ArmazenamentoNotificacao;
import outros.ObterValores;

public class NotificacaoEscola extends ObterValores {
    ArmazenamentoNotificacao notificacao = new ArmazenamentoNotificacao();

    public void notiEscola(String matricula){
        String texto = notificacao.lerTexto();
        String[] users = texto.split(";");
        for (int i = 0; i < users.length; i++) {
            String[] matriz_users = users[i].split(",");
            matriz_users[1] = matriz_users[1].replace(" ", "");
            if (matriz_users[1].equals(matricula)){
                System.out.println(users[i]);
            }
        }
    }

}
