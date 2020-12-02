package menu.escola.NotificaProfessor;

import armazenamento.ArmazenamentoAcontecimentosCoordenacao;
import armazenamento.ArmazenamentoNotificacao;
import outros.ObterValores;

public class NotiProfessor extends ObterValores {
    ArmazenamentoAcontecimentosCoordenacao acontecimentosCoordenacao = new ArmazenamentoAcontecimentosCoordenacao();
    ArmazenamentoNotificacao notificacao = new ArmazenamentoNotificacao();
    public void notiProfessor(String matricula){
        String texto = acontecimentosCoordenacao.lerTexto();
        String[] users = texto.split(";");
        for (int i = 0; i < users.length; i++) {
            String[] matriz_users = users[i].split(",");
            matriz_users[0] = matriz_users[0].replace("  ", "");
            matriz_users[1] = matriz_users[1].replace(" ", "");

            String nome = matriz_users[1];
            System.out.println(users[i]);
            boolean noti = obterValorBoolean("Deseja notificar os pais do aluno?");
             if (noti==true){
                    String notifi = "O aluno que o senhor(a) estar responsavel, teve um relato feito pelo Professor(a)"+","+matriz_users[0]+","+nome+";";
                    notificacao.escreverTexto(notifi);

            }
        }

    }
}
