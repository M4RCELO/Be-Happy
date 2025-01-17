package menu.escola;

import armazenamento.ArmazenamentoAcontecimentosCoordenacao;
import menu.escola.MensagensPais.MensagensPais;
import menu.escola.NotificaProfessor.NotiProfessor;
import menu.escola.Relatos.RelatosEscola;
import menu.escola.atualizaçãoDeHumor.AtualizacaoDeHumorEscola;
import menu.escola.notificarPais.NotificacaoPais;
import menu.strategy.Menu;
import outros.ObterValores;
import menu.escola.cadastro.MenuCadastrarUsers;

public class MenuEscola extends ObterValores implements Menu{

	private static final String LS = System.lineSeparator();
	
	@Override
	public boolean setStrategyMenu() {
		
		int opcao = 0;
		String menu = "";
		menu += "====================================" + LS;
		menu += "       Menu Principal - Escola" + LS;
		menu += "===================================="+ LS;
		menu += ++opcao + ". Atualização do humor dos alunos" + LS;
		menu += ++opcao + ". Cadastrar usuários" + LS;
		menu += ++opcao + ". Notificar pais" + LS;
		menu += ++opcao + ". Relatos de Bullying" + LS;
		menu += ++opcao + ". Notificaçao Professores" + LS;
		menu += ++opcao + ". Mensagens dos Pais" + LS;
		menu += ++opcao + ". Sair" + LS;
		
		while (true) {
			
			System.out.println(menu);
			
			int opcaoEscolhida = obterValorInteger("Digite uma opção: ");
			switch (opcaoEscolhida) {
				case 1:
					System.out.println("Atualização do humor dos alunos");
					AtualizacaoDeHumorEscola atualizacaoDeHumorEscola=new AtualizacaoDeHumorEscola();
					atualizacaoDeHumorEscola.VerAtualizacaohumor("0000");
					break;
				case 2:
					System.out.println("Cadastrar usuários");
					MenuCadastrarUsers menuCadastrarUsers = new MenuCadastrarUsers();
					menuCadastrarUsers.setStrategyMenu();
					break;
				case 3:
					System.out.println("Notificar pais");
					NotificacaoPais notificacaoPais = new NotificacaoPais();
					notificacaoPais.Notificacao("0000");

					break;
				case 4:
					System.out.println("Relatos de Bullying");
					RelatosEscola relatosEscola =new RelatosEscola();
					boolean todos = obterValorBoolean("Deseja ver os relatos de todos os Alunos?");
					relatosEscola.RelatosAlunosEscola(todos);
					break;
				case 5:
					System.out.println("Notificação Professores");
					NotiProfessor notiProfessor = new NotiProfessor();
					notiProfessor.notiProfessor("0000");
					break;
				case 6:
					System.out.println("Mensagens dos pais");
					MensagensPais mensagensPais = new MensagensPais();
					mensagensPais.mensagens("0000");

					break;
				case 7:
					return false;

				default:
					System.out.println();
					System.out.println("Erro! Opção desconhecida: " + opcaoEscolhida);
					System.out.println();
					break;
			}
		}
	}

}
