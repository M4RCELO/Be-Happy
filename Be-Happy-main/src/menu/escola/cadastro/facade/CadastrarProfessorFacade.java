package menu.escola.cadastro.facade;

import dominio.ProfessorBuilder;
import outros.ObterValores;
import dominio.Professor;
import gerador.MatriculaSequencial;
import menu.escola.cadastro.Cadastrar;

public class CadastrarProfessorFacade {
	
	private ObterValores obterValores;
	private Cadastrar cadastrar;
	private MatriculaSequencial matriculaSequencial;
	
	public CadastrarProfessorFacade() {
		this.obterValores = new ObterValores();
		this.cadastrar = new Cadastrar();
		this.matriculaSequencial = new MatriculaSequencial();
	}
	
	public void cadastrarProfessorFacade() {
		String nome = obterValores.obterValorString("Digite o nome do Professor: ");
		String senha = obterValores.obterValorString("Digite a senha do Professor: ");
		String matricula = matriculaSequencial.obterProximoId();
		int turma = obterValores.obterValorInteger("Digite a turma em que o Professor ensina: ");
		Professor professor = new ProfessorBuilder().setNome(nome).setSenha(senha).setMatricula(matricula).setTurma(turma).createProfessor();
		cadastrar.cadastrarProfessor(professor);
	}
}
