package menu.escola.cadastro.facade;

import dominio.AlunoBuilder;
import dominio.TurmasComposite;
import outros.ObterValores;
import armazenamento.ArmazenamentoTurmas;
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
		Aluno aluno = new AlunoBuilder().nome(nome).senha(senha).matricula(matricula).turma(turma).cpf_responsavel(cpf_responsavel).criar();
		
		TurmasComposite novaTurma = new TurmasComposite(turma);
		novaTurma.adicionarAluno(new Aluno(nome,matricula,cpf_responsavel));
		
		ArmazenamentoTurmas armazenamentoTurmas = new ArmazenamentoTurmas(turma);
		armazenamentoTurmas.escreverTexto(aluno.getNome()+", "+aluno.getMatricula().toString()+", "+aluno.getCpf_responsavel().toString()+" ;");
		
		cadastrar.cadastrarAluno(aluno);
		
	}

}
