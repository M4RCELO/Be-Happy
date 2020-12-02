package menu.escola.MensagensPais;

import armazenamento.ArmazenamentoMensagensPais;
import outros.ObterValores;

public class MensagensPais extends ObterValores {
    ArmazenamentoMensagensPais armazenamentoMensagensPais = new ArmazenamentoMensagensPais();

    public void mensagens (String matricula){
        String texto = armazenamentoMensagensPais.lerTexto();
        String[] users = texto.split(";");
        for (int i = 0; i < users.length; i++) {
            String[] matriz_users = users[i].split(",");
            matriz_users[1] = matriz_users[1].replace(" ", "");
            System.out.println(users[i]);

        }
    }
}
