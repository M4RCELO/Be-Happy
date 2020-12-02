package menu.escola.cadastro;

import dominio.Aluno;
import dominio.Professor;
import dominio.Responsavel;
import armazenamento.ArmazenamentoTurmas;
import armazenamento.ArmazenamentoUsuarios;

public class Cadastrar {
	
	ArmazenamentoUsuarios armazenamento = new ArmazenamentoUsuarios();
	
	public void cadastrarAluno(Aluno aluno) {
		String infos = aluno.getNome()+", "+aluno.getSenha()+", "+aluno.getMatricula().toString()+", "+aluno.getTurma().toString()+", "+aluno.getCpf_responsavel().toString()+", 1 ;";
		armazenamento.escreverTexto(infos);
	}
	
	public void cadastrarProfessor(Professor prof) {
		String infos = prof.getNome()+", "+prof.getSenha()+", "+prof.getMatricula().toString()+", 2 ;";
		armazenamento.escreverTexto(infos);
	}
	
	public void cadastrarResponsavel(Responsavel resp) {
		String infos = resp.getNome()+", "+resp.getSenha()+", "+resp.getCpf().toString()+", "+resp.getMatri_aluno_respom()+", 3 ;";
		armazenamento.escreverTexto(infos);
	}

}
