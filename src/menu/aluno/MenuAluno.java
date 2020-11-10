package menu.aluno;

import outros.ObterValores;
import menu.Menu;

public class MenuAluno extends ObterValores implements Menu{
	
	private static final String LS = System.lineSeparator();

	@Override
	public boolean exibirMenu() {
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
					System.out.println("Relatar Bullying");
					break;
				case 2:
					System.out.println("Atualizar Humor");
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