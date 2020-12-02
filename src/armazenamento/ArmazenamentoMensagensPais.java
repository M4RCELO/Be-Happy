package armazenamento;

import java.nio.file.Paths;

public class ArmazenamentoMensagensPais extends AmazenamentoAbstract {
    public ArmazenamentoMensagensPais() {
        this.nomeArquivo = caminho + "MensagensPais.txt";
        this.arquivo_path = Paths.get(nomeArquivo);
    }
}

