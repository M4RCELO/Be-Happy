package marcelo.menu.escola.cadastro;

import marcelo.menu.Menu;
import marcelo.menu.escola.cadastro.facade.CadastrarAlunoFacade;

public class MenuCadastrarAluno implements Menu{
	
	private static final String LS = System.lineSeparator();

	@Override
	public boolean exibirMenu() {
		String menu = "";
		menu += "====================================" + LS;
		menu += "   Digite as informações do Aluno" + LS;
		menu += "====================================" + LS;
		
		System.out.println(menu);
		CadastrarAlunoFacade facade = new CadastrarAlunoFacade();
		facade.cadastrarAlunoFacade();
		
		return false;
	}
	

}
