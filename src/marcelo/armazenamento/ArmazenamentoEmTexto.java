package marcelo.armazenamento;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class ArmazenamentoEmTexto{

	protected String nomeArquivo;
	
	public ArmazenamentoEmTexto(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
	}
	
	public void escreverTexto(String texto) {
		try {
			// O parametro é que indica se deve sobrescrever ou continua no
			// arquivo.
			FileWriter fw = new FileWriter(nomeArquivo, true);
			BufferedWriter conexao = new BufferedWriter(fw);
			conexao.write(texto);
			conexao.newLine();
			conexao.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public String lerTexto(Path path) {
		String texto = "";
		try {
			List<String> linhas = Files.readAllLines(path);
			for (String linha : linhas) {
				texto += linha;
				texto += " ";
			}
			texto = texto.trim();
		} catch (IOException e) {
			System.out.println(e);
		}
		return texto;
	}
	
}