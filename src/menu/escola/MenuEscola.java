package menu.escola;

import menu.escola.atualizaçãoDeHumor.AtualizacaoDeHumorEscola;
import menu.escola.notificarPais.NotificacaoPais;
import outros.ObterValores;
import menu.Menu;
import menu.escola.cadastro.MenuCadastrarUsers;

public class MenuEscola extends ObterValores implements Menu{

	private static final String LS = System.lineSeparator();
	
	@Override
	public boolean exibirMenu() {
		
		int opcao = 0;
		String menu = "";
		menu += "====================================" + LS;
		menu += "       Menu Principal - Escola" + LS;
		menu += "===================================="+ LS;
		menu += ++opcao + ". Atualização do humor dos alunos" + LS;
		menu += ++opcao + ". Cadastrar usuário" + LS;
		menu += ++opcao + ". Notificar pais" + LS;
		menu += ++opcao + ". Relatos de Bullying" + LS;
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
					MenuCadastrarUsers menuCadastrarUsers = new MenuCadastrarUsers();
					menuCadastrarUsers.exibirMenu();
					break;
				case 3:
					System.out.println("Notificar pais");
					NotificacaoPais notificacaoPais = new NotificacaoPais();
					notificacaoPais.Notificacao("0000");
					break;
				case 4:
					System.out.println("Relatos de Bullying");
					break;
				case 5:
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
