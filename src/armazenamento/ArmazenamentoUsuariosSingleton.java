package armazenamento;

import java.nio.file.Paths;

public class ArmazenamentoUsuariosSingleton extends AmazenamentoAbstract{

	public static ArmazenamentoUsuariosSingleton instancia;

	protected ArmazenamentoUsuariosSingleton() {
		this.nomeArquivo = caminho +"Usuarios.txt";
		this.arquivo_path = Paths.get(nomeArquivo);
	}

	public static ArmazenamentoUsuariosSingleton getInstance(){
		if (instancia == null)
			instancia = new ArmazenamentoUsuariosSingleton();
		return instancia;
	}
}