package menu;

import outros.ObterValores;
import java.util.Scanner;
import buscas.Login;

public class MenuLogin extends ObterValores{
	
	private Scanner sc = new Scanner(System.in);
	
	private static final String LS = System.lineSeparator();
	
	private Login buscar = new Login();

	public boolean exibirMenu() {
		String menu = "";
		menu += "====================================" + LS;
		menu += "              Login" + LS;
		menu += "====================================" + LS;
		
		while(true) {
			System.out.println(menu);
			String matricula = obterValorString("Digite sua Matricula ou CPF: ");
			String senha = obterValorString("Digite sua Senha: ");
			buscar.fazerLogin(matricula, senha);
			
		}

	}

}
