package menu.escola.cadastro;

import menu.escola.cadastro.facade.CadastrarResponsavelFacade;
import menu.strategy.Menu;

public class MenuCadastrarResponsavel implements Menu{
	
	private static final String LS = System.lineSeparator();

	@Override
	public boolean setStrategyMenu() {
		String menu = "";
		menu += "====================================" + LS;
		menu += " Digite as informações do Responsável" + LS;
		menu += "====================================" + LS;
		
		System.out.println(menu);
		CadastrarResponsavelFacade facade = new CadastrarResponsavelFacade();
		facade.cadastrarResponsavelFacade();
		System.out.println("O responsavel foi cadastrado com sucesso");
		return false;
	}

}
