package marcelo.menu.escola.cadastro;

import marcelo.menu.Menu;
import marcelo.menu.escola.cadastro.facade.CadastrarProfessorFacade;

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
		
		return false;
	}

}
