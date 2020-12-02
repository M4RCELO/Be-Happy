package armazenamento;

import java.nio.file.Paths;

public class ArmazenamentoComportamentoDiario extends AmazenamentoAbstract{

    public ArmazenamentoComportamentoDiario() {
        this.nomeArquivo = caminho +"ComportamentoDiario.txt";
        this.arquivo_path = Paths.get(nomeArquivo);

    }

}
