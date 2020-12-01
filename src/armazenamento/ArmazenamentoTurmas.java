package armazenamento;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import dominio.Aluno;

public class ArmazenamentoTurmas implements Armazenamento {
	
	private String nomeArquivo;
	private Path arquivo_path;
	
	public ArmazenamentoTurmas(Integer turma) {
		this.nomeArquivo = "C:/Users/Gabri/IdeaProjects/Be-Happy/Dados/Turmas"+turma.toString()+".txt";
		this.arquivo_path = Paths.get(nomeArquivo);		
	}
	
	public void escreverTexto(String texto) {
		try {
			FileWriter fw = new FileWriter(nomeArquivo, true);
			BufferedWriter conexao = new BufferedWriter(fw);
			conexao.write(texto);
			conexao.newLine();
			conexao.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public String lerTexto() {
		String texto = "";
		try {
			List<String> linhas = Files.readAllLines(arquivo_path);
			for (String linha : linhas) {
				texto += linha;
				texto += " ";
			}
			texto = texto.trim();
		} catch (IOException e) {
			try {
				FileWriter fw = new FileWriter(nomeArquivo, true);
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
		return texto;
	}
	
	public ArrayList<Aluno> recuperarTurmas() {
		ArrayList<Aluno> listaAlunos = new ArrayList<Aluno>();
		
		if(lerTexto().length()>0) {
			String texto = lerTexto();
			String[] users = texto.split(";");
			
			for (int i = 0; i < users.length; i++) {
				String[] matriz_users = users[i].split(",");
				Aluno aluno = new Aluno(matriz_users[0].replace(" ", ""), matriz_users[1].replace(" ", ""), Long.parseLong(matriz_users[2].replace(" ", "")));
				listaAlunos.add(aluno);
			}
		}
		
		return listaAlunos;
	
	}

}
