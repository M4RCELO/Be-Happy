package armazenamento;

import java.nio.file.Paths;

public class ArmazenamentoHumorAlunosProfessor extends AmazenamentoAbstract{

    public ArmazenamentoHumorAlunosProfessor() {
        this.nomeArquivo = caminho +"HumorAlunosProfessor.txt";;
        this.arquivo_path = Paths.get(nomeArquivo);
    }

}
