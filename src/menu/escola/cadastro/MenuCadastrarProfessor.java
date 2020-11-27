package menu.escola.cadastro;

import menu.escola.cadastro.facade.CadastrarProfessorFacade;
import menu.strategy.Menu;

public class MenuCadastrarProfessor implements Menu{

	private static final String LS = System.lineSeparator();

	@Override
	public boolean exibirMenu() {
		String menu = "";
		menu += "====================================" + LS;
		menu += " Digite as informações do Professor" + LS;
		menu += "====================================" + LS;
		
		System.out.println(menu);
		CadastrarProfessorFacade facade = new CadastrarProfessorFacade();
		facade.cadastrarProfessorFacade();
		System.out.println("O Professor foi cadastrado com sucesso");
		return false;
	}

}
