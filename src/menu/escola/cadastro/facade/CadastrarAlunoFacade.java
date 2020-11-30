package menu.escola.cadastro.facade;

import dominio.AlunoBuilder;
import dominio.TurmasComposite;
import outros.ObterValores;
import armazenamento.ArmazenamentoTurmas;
import dominio.Aluno;
import gerador.MatriculaSequencial;
import menu.escola.cadastro.Cadastrar;
import menu.escola.cadastro.aluno.adapter.CadastrarAdapter;
import menu.escola.cadastro.aluno.adapter.CadastrarNaTurma;
import menu.escola.cadastro.aluno.adapter.CadastrarNoUser;
import menu.escola.cadastro.aluno.adapter.ICadastrar;

public class CadastrarAlunoFacade {
	
	private ObterValores obterValores;
	private MatriculaSequencial matriculaSequencial;
	
	public CadastrarAlunoFacade() {
		this.obterValores = new ObterValores();
		this.matriculaSequencial = new MatriculaSequencial();
	}
	
	public void cadastrarAlunoFacade() {
		
		String nome = obterValores.obterValorString("Digite o nome do Aluno: ");
		String senha = obterValores.obterValorString("Digite a senha do Aluno: ");
		String matricula = matriculaSequencial.obterProximoId();
		int turma = obterValores.obterValorInteger("Digite a turma do Aluno: ");
		Long cpf_responsavel = obterValores.obterValorLong("Digite o CPF do responsável: ");
		Aluno aluno = new AlunoBuilder().nome(nome).senha(senha).matricula(matricula).turma(turma).cpf_responsavel(cpf_responsavel).criar();
		
		TurmasComposite novaTurma = new TurmasComposite(turma);
		novaTurma.adicionarAluno(new Aluno(nome,matricula,cpf_responsavel));
		
		ICadastrar servico1 = new CadastrarNaTurma(turma);
		CadastrarAdapter cadastrarAdapter1 = new CadastrarAdapter(servico1);
		cadastrarAdapter1.cadastrar(aluno);
		
		ICadastrar servico2 = new CadastrarNoUser();
		CadastrarAdapter cadastrarAdapter2 = new CadastrarAdapter(servico2);
		cadastrarAdapter2.cadastrar(aluno);
		
	}

}
