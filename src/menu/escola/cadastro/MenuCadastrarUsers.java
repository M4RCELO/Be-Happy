package menu.escola.cadastro;

import menu.escola.cadastro.aluno.MenuCadastrarAluno;
import menu.strategy.Menu;
import outros.ObterValores;

public class MenuCadastrarUsers extends ObterValores implements Menu{
	
	private static final String LS = System.lineSeparator();

	@Override
	public boolean setStrategyMenu() {
		int opcao = 0;
		String menu = "";
		menu += "====================================" + LS;
		menu += "       Menu Cadastrar Usuário" + LS;
		menu += "====================================" + LS;
		menu += ++opcao + ". Cadastrar Aluno" + LS;
		menu += ++opcao + ". Cadastrar Professor" + LS;
		menu += ++opcao + ". Cadastrar Responsável" + LS;
		menu += ++opcao + ". Sair" + LS;
		
		while (true) {
			System.out.println(menu);
			int opcaoEscolhida = obterValorInteger("Digite uma opção: ");
			switch (opcaoEscolhida) {
				case 1:
					MenuCadastrarAluno menuCadastrarAluno = new MenuCadastrarAluno();
					menuCadastrarAluno.setStrategyMenu();
					break;
				case 2:
					MenuCadastrarProfessor menuCadastrarProfessor = new MenuCadastrarProfessor();
					menuCadastrarProfessor.setStrategyMenu();
					break;
				case 3:
					MenuCadastrarResponsavel menuCadastrarResponsavel = new MenuCadastrarResponsavel();
					menuCadastrarResponsavel.setStrategyMenu();
					break;
				case 4:
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
