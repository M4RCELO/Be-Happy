package armazenamento;

import java.nio.file.Paths;

public class ArmazenamentoHumorAlunos extends AmazenamentoAbstract{
	
	public ArmazenamentoHumorAlunos() {
		this.nomeArquivo = caminho +"HumorAlunos.txt";
		this.arquivo_path = Paths.get(nomeArquivo);
	}

}
