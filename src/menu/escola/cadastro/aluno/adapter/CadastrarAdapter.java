package menu.escola.cadastro.aluno.adapter;

import dominio.Aluno;

public class CadastrarAdapter implements ICadastrar{
	
	private ICadastrar servico; 
	
	public CadastrarAdapter(ICadastrar servico) {
		this.servico = servico;
	}
	
	@Override
	public void cadastrar(Aluno aluno) {
		servico.cadastrar(aluno);
	}
	
	
	
}
