package menu.responsaveis.MensagensEscola;

import armazenamento.ArmazenamentoMensagensPais;
import outros.ObterValores;

public class MensagemEscola extends ObterValores {
    ArmazenamentoMensagensPais armazenamentoMensagensPais = new ArmazenamentoMensagensPais();
    public void mensagens(String matricula){
        String cpf = obterValorString("Informe seu cpf:");
        String mensa = obterValorString("Informe sua mensagem:");
        String noti= mensa+","+cpf+";";
        armazenamentoMensagensPais.escreverTexto(noti);

    }
}
