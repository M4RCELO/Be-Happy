package menu.aluno;

import outros.ObterValores;
import menu.strategy.Menu;

public class MenuAluno extends ObterValores implements Menu{
	
	private static final String LS = System.lineSeparator();

	@Override
	public boolean setStrategyMenu() {
		int opcao = 0;
		String menu = "";
		menu += "====================================" + LS;
		menu += "       Menu Principal - Criança" + LS;
		menu += "====================================" + LS;
		menu += ++opcao + ". Relatar Bullying" + LS;
		menu += ++opcao + ". Atualização do humor" + LS;
		menu += ++opcao + ". Sair" + LS;
		
		while (true) {
			System.out.println(menu);
			int opcaoEscolhida = obterValorInteger("Digite uma opção: ");
			switch (opcaoEscolhida) {
				case 1:
					RelatarBullying relatarBullying = new RelatarBullying();
					relatarBullying.relatar();
					break;
				case 2:
					TelaAtuHumor window = new TelaAtuHumor();
					window.run();
					break;
				case 3:
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
