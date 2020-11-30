package menu.escola.cadastro.aluno.adapter;

import armazenamento.ArmazenamentoTurmas;
import dominio.Aluno;

public class CadastrarNaTurma implements ICadastrar{
	private ArmazenamentoTurmas armazenamentoTurmas;	
	
	
	public CadastrarNaTurma(int turma) {
		this.armazenamentoTurmas = new ArmazenamentoTurmas(turma);
	}

	@Override
	public void cadastrar(Aluno aluno) {
		armazenamentoTurmas.escreverTexto(aluno.getNome()+", "+aluno.getMatricula().toString()+", "+aluno.getCpf_responsavel().toString()+" ;");
	}
	
	
	
}
