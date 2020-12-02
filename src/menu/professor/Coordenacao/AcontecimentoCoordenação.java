package menu.professor.Coordenacao;

import armazenamento.ArmazenamentoAcontecimentosCoordenacao;
import outros.ObterValores;

public class AcontecimentoCoordenação extends ObterValores {
    ArmazenamentoAcontecimentosCoordenacao acontecimentos = new ArmazenamentoAcontecimentosCoordenacao();

    public void Acontecimento(String matricula){
        String acontecimento = obterValorString("O que aconteceu?");
        String noti= acontecimento +","+matricula+";";
        acontecimentos.escreverTexto(noti);

    }
}
