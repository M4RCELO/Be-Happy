package marcelo.menu.escola.cadastro;

import gabriel.dominio.Aluno;
import gabriel.dominio.Professor;
import gabriel.dominio.Responsavel;
import marcelo.armazenamento.ArmazenamentoUsuariosSingleton;

public class Cadastrar {
	
	ArmazenamentoUsuariosSingleton armazenamento = ArmazenamentoUsuariosSingleton.getInstancia();

	
	public void cadastrarAluno(Aluno aluno) {
		String infos = aluno.getNome()+", "+aluno.getSenha()+", "+aluno.getMatricula().toString()+", "+aluno.getTurma().toString()+", "+aluno.getCpf_responsavel().toString()+", 1 ;";
		armazenamento.escreverTexto(infos);
	}
	
	public void cadastrarProfessor(Professor prof) {
		String infos = prof.getNome()+", "+prof.getSenha()+", "+prof.getMatricula().toString()+", "+prof.getTurma().toString()+", 2 ;";
		armazenamento.escreverTexto(infos);
	}
	
	public void cadastrarResponsavel(Responsavel resp) {
		String infos = resp.getNome()+", "+resp.getSenha()+", "+resp.getCpf().toString()+", "+resp.getMatri_aluno_respom()+", 3 ;";
		armazenamento.escreverTexto(infos);
	}

}