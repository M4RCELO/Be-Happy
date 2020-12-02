package armazenamento;

import java.nio.file.Paths;

public class ArmazenamentoUsuarios extends AmazenamentoAbstract{

	public ArmazenamentoUsuarios() {
		this.nomeArquivo = caminho +"Usuarios.txt";
		this.arquivo_path = Paths.get(nomeArquivo);
	}
}