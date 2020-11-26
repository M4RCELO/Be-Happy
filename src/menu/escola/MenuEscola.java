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
		
		
		while (true) {
			
			String menu = "";
			menu += "====================================" + LS;
			menu += "       Menu Principal - Escola" + LS;
			menu += "====================================";
			
			System.out.println(menu);
			
			ItemMenu [] menuItens = new ItemMenu[5];

			menuItens[0] = new ItemMenu("Atualização do humor dos alunos");
			menuItens[1] = new ItemMenu("Cadastrar usuário");
			menuItens[2] = new ItemMenu("Notificar pais");
			menuItens[3] = new ItemMenu("Relatos de Bullying");
			menuItens[4] = new ItemMenu("Sair");
			
			MenuInterator menuIterator = new MenuInterator(menuItens);
			
			while (menuIterator.hasNext()) {
				ItemMenu menuItem = (ItemMenu)menuIterator.next();
				System.out.println(menuIterator.getPosicao().toString()+". "+menuItem.nome);
			}
			System.out.println();
			
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
