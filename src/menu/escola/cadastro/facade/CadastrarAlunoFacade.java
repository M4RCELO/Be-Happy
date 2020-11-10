package menu.escola.cadastro.facade;

import dominio.AlunoBuilder;
import dominio.TurmasComposite;
import outros.ObterValores;
import dominio.Aluno;
import gerador.MatriculaSequencial;
import menu.escola.cadastro.Cadastrar;

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
		Aluno aluno = new AlunoBuilder().setNome(nome).setSenha(senha).setMatricula(matricula).setTurma(turma).setCpf_responsavel(cpf_responsavel).createAluno();
		cadastrar.cadastrarAluno(aluno);
		TurmasComposite novaTurma=new TurmasComposite(turma);
		novaTurma.adicionarAluno(aluno);
		for (Aluno aluno1: novaTurma.getListaAlunos()){
			System.out.println(aluno1.getNome()+ " "+aluno1.getMatricula());
		}
	}

}
