package menu.escola.notificarPais;

import armazenamento.ArmazenamentoNotificacao;
import armazenamento.ArmazenamentoHumorAlunos;
import armazenamento.ArmazenamentoUsuariosSingleton;
import outros.ObterValores;

public class NotificacaoPais extends ObterValores {
    ArmazenamentoHumorAlunos humorAlunos = new ArmazenamentoHumorAlunos();
    ArmazenamentoNotificacao notificacao = new ArmazenamentoNotificacao();
    ArmazenamentoUsuariosSingleton usuarios = ArmazenamentoUsuariosSingleton.getInstance();


    public void Notificacao(String matricula) {
        String texto = humorAlunos.lerTexto();
        String[] users = texto.split(";");
        for (int i = 0; i < users.length; i++) {
            String[] matriz_users = users[i].split(",");
            matriz_users[3] = matriz_users[3].replace(" ", "");
            matriz_users[0] = matriz_users[0].replace(" ", "");
            String triste = "Triste";
            String raiva = "Raiva";
            if (matriz_users[3].equals(triste)){
                String text = usuarios.lerTexto();
                String[] user = text.split(";");
                for (int t = 1; t < user.length; t++){
                    String[] matriz_user = user[t].split(",");
                    matriz_user[0] = matriz_user[0].replace(" ", "");
                    matriz_user[2] = matriz_user[2].replace(" ", "");
                    String nome = matriz_users[0];
                    if (matriz_user[2].equals(nome)){
                        System.out.println("O aluno "+matriz_user[0]+" teve uma atualização de humor de tristeza!");
                        Boolean noti = obterValorBoolean("Deseja notificar o responsavel desse aluno?");

                        if (noti==true){
                            String notifi = "O aluno que o senhor(a) estar responsavel teve uma atualização de humor de tristeza"+","+nome+";";
                            notificacao.escreverTexto(notifi);
                            continue;
                        }
                        else if(noti==false){
                            continue;
                        }

                    }
                }

            }
        }
    }
}
