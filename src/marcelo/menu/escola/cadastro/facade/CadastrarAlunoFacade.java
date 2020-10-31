package marcelo.menu.escola.cadastro.facade;

import gabriel.ObterValores;
import gabriel.dominio.Aluno;
import marcelo.gerador.MatriculaSequencial;
import marcelo.menu.escola.cadastro.Cadastrar;

public class CadastrarAlunoFacade {
	
	private ObterValores obterValores;
	private Cadastrar cadastrar;
	private MatriculaSequencial matriculaSequencial;
	
	public CadastrarAlunoFacade() {
		this.obterValores = new ObterValores();
		this.cadastrar = new Cadastrar();
		this.matriculaSequencial = new MatriculaSequencial();
	}
	
	public void cadastrarAlunoFacade() {
		String nome = obterValores.obterValorString("Digite o nome do Aluno: ");
		String senha = obterValores.obterValorString("Digite a senha do Aluno: ");
		String matricula = matriculaSequencial.obterProximoId();
		int turma = obterValores.obterValorInteger("Digite a turma do Aluno: ");
		Long cpf_responsavel = obterValores.obterValorLong("Digite o CPF do responsável: ");
		Aluno aluno = new Aluno(nome,senha,matricula,turma,cpf_responsavel);
		cadastrar.cadastrarAluno(aluno);
	}

}
