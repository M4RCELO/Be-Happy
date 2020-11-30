package armazenamento;

import buscas.Login;
import dominio.AlunoLogado;
import outros.DataEHora;

public class Amazenar {
	
	private ArmazenamentoHumorAlunos armazenamentoHumor = new ArmazenamentoHumorAlunos();
	private ArmazenamentoRelatos armazenamentoRelatos = new ArmazenamentoRelatos();
	private AlunoLogado aluno = Login.alunoLogado;
	private DataEHora dataEHora = new DataEHora();
	
	public void humor(String humor) {
		String infos = aluno.getMatricula().toString()+", "+aluno.getTurma().toString()+", "+aluno.getCpf_responsavel().toString()+", "+humor+", "+dataEHora.getData()+", "+dataEHora.getHora()+" ;";
		armazenamentoHumor.escreverTexto(infos);
	}
	
	public void relato(String relatoStr) {
		String infos = aluno.getMatricula().toString()+", "+aluno.getCpf_responsavel().toString()+", "+relatoStr+", "+dataEHora.getData()+", "+dataEHora.getHora()+" ;";
		armazenamentoRelatos.escreverTexto(infos);
	}

}
