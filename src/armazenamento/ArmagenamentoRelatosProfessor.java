package armazenamento;

import java.nio.file.Paths;

public class ArmagenamentoRelatosProfessor extends AmazenamentoAbstract{

    public ArmagenamentoRelatosProfessor() {
        this.nomeArquivo = caminho +"RelatosProfessor.txt";
        this.arquivo_path = Paths.get(nomeArquivo);
    }

}
