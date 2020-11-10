package menu.escola.cadastro.facade;

import dominio.ResponsavelBuilder;
import outros.ObterValores;
import dominio.Responsavel;
import menu.escola.cadastro.Cadastrar;

public class CadastrarResponsavelFacade {
	
	private ObterValores obterValores;
	private Cadastrar cadastrar;
	
	public CadastrarResponsavelFacade() {
		this.obterValores = new ObterValores();
		this.cadastrar = new Cadastrar();
	}
	
	public void cadastrarResponsavelFacade() {
		String nome = obterValores.obterValorString("Digite o nome do Responsável: ");
		String senha = obterValores.obterValorString("Digite a senha do Responsável: ");
		Long cpf = obterValores.obterValorLong("Digite o CPF do Responsável: ");
		String matri_aluno_respon = obterValores.obterValorString("Digite a matrícula do aluno de quem é Responsável: ");
		Responsavel responsavel = new ResponsavelBuilder().setNome(nome).setSenha(senha).setCpf(cpf).setMatri_aluno_respon(matri_aluno_respon).createResponsavel();
		cadastrar.cadastrarResponsavel(responsavel);
	}
	
}
