package menu.escola.cadastro.facade;

import dominio.AlunoBuilder;
import dominio.Turmas;
import menu.escola.cadastro.aluno.chain.CadastroAlunoChain;
import menu.escola.cadastro.aluno.chain.ChainFinal;
import menu.escola.cadastro.aluno.chain.ValidarCampos;
import menu.escola.cadastro.aluno.chain.VerificarCampos;
import outros.ObterValores;
import dominio.Aluno;
import gerador.MatriculaSequencial;
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
		String nome, senha, matricula;
		Integer turma;
		Long cpf_responsavel;
		Aluno aluno;

		while (true){

			nome = obterValores.obterValorString("Digite o nome do Aluno: ");
			senha = obterValores.obterValorString("Digite a senha do Aluno (6 dígitos no mín.): ");
			matricula = matriculaSequencial.obterProximoId();
			turma = obterValores.obterValorInteger("Digite a turma do Aluno: ");
			cpf_responsavel = obterValores.obterValorLong("Digite o CPF do responsável: ");
			aluno = new AlunoBuilder().nome(nome).senha(senha).matricula(matricula).turma(turma).cpf_responsavel(cpf_responsavel).criar();

			CadastroAlunoChain validarCampos = new ValidarCampos(aluno);
			CadastroAlunoChain verificarCampos = new VerificarCampos(aluno);
			CadastroAlunoChain chainFinal = new ChainFinal();

			validarCampos.proximo(verificarCampos);
			verificarCampos.proximo(chainFinal);

			if (validarCampos.validacao()) break;
		}

		Turmas novaTurma = new Turmas(turma);
		novaTurma.adicionarAluno(new Aluno(nome,matricula,cpf_responsavel));
		
		ICadastrar servico1 = new CadastrarNaTurma(turma);
		CadastrarAdapter cadastrarAdapter1 = new CadastrarAdapter(servico1);
		cadastrarAdapter1.cadastrar(aluno);
		
		ICadastrar servico2 = new CadastrarNoUser();
		CadastrarAdapter cadastrarAdapter2 = new CadastrarAdapter(servico2);
		cadastrarAdapter2.cadastrar(aluno);
	}

}
