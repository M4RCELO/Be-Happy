package menu.professor;

import outros.ObterValores;
import menu.Menu;

public class MenuProfessor extends ObterValores implements Menu{
	
	private static final String LS = System.lineSeparator();

	@Override
	public boolean exibirMenu() {
		
		int opcao = 0;
		String menu = "";
		menu += "====================================" + LS;
		menu += "     Menu Principal - Professor" + LS;
		menu += "====================================" + LS;
		menu += ++opcao + ". Comportamento diário" + LS;
		menu += ++opcao + ". Atualização do humor dos alunos" + LS;
		menu += ++opcao + ". Relatório Semanal" + LS;
		menu += ++opcao + ". Relatar acontecimentos a coordenação" + LS;
		menu += ++opcao + ". Sair" + LS;
		
		while (true) {
			System.out.println(menu);
			int opcaoEscolhida = obterValorInteger("Digite uma opção: ");
			switch (opcaoEscolhida) {
				case 1:
					System.out.println("Comportamento diário");
					break;
				case 2:
					System.out.println("Atualização do humor dos alunos");
					break;
				case 3:
					System.out.println("Relatório Semanal");
					break;
				case 4:
					System.out.println("Relatar acontecimentos a coordenação");
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
