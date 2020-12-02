package armazenamento;

import java.nio.file.Paths;

public class ArmazenamentoAcontecimentosCoordenacao extends AmazenamentoAbstract {

    public ArmazenamentoAcontecimentosCoordenacao() {
        this.nomeArquivo =  caminho +"AcontecimentosCoordenacao.txt";
        this.arquivo_path = Paths.get(nomeArquivo);
    }
}
