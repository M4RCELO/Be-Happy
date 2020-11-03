package marcelo.menu.escola.cadastro;

import marcelo.menu.Menu;
import marcelo.menu.escola.cadastro.facade.CadastrarResponsavelFacade;

public class MenuCadastrarResponsavel implements Menu{
	
	private static final String LS = System.lineSeparator();

	@Override
	public boolean exibirMenu() {
		String menu = "";
		menu += "====================================" + LS;
		menu += " Digite as informações do Responsável" + LS;
		menu += "====================================" + LS;
		
		System.out.println(menu);
		CadastrarResponsavelFacade facade = new CadastrarResponsavelFacade();
		facade.cadastrarResponsavelFacade();
		
		return false;
	}

}