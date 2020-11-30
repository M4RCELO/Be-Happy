package menu.escola.cadastro.aluno.adapter;

import dominio.Aluno;
import menu.escola.cadastro.Cadastrar;

public class CadastrarNoUser implements ICadastrar{
	private Cadastrar cadastrar;
	
	
	public CadastrarNoUser() {
		this.cadastrar = new Cadastrar();
	}
	
	@Override
	public void cadastrar(Aluno aluno) {
		cadastrar.cadastrarAluno(aluno);
	}

}
