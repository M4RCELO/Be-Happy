package buscas;

import javax.swing.JOptionPane;

import armazenamento.ArmazenamentoUsuariosSingleton;
import menu.Menu;
import menu.factory.MenuFactory;

public class BuscarUsuario {

	ArmazenamentoUsuariosSingleton armazenamento = ArmazenamentoUsuariosSingleton.getInstancia();
	
	public void procurarUsuario(String matricula, String senha) {
		
		String texto = armazenamento.lerTexto();
		String[] users = texto.split(";");
		int entrou = 0;
		
		for (int i = 0; i < users.length; i++) {
			  String[] matriz_users = users[i].split(",");	
			  matriz_users[2] = matriz_users[2].replace(" ", "");
			  matriz_users[1] = matriz_users[1].replace(" ", "");
			  if (matriz_users[2].equals(matricula)) {
				  entrou+=1;
				  if(matriz_users[1].equals(senha)) {
					  matriz_users[matriz_users.length-1] = matriz_users[matriz_users.length-1].replace(" ", "");
					  int tipo = Integer.parseInt(matriz_users[matriz_users.length-1]);
					  
					  Menu menu = MenuFactory.getExibirMenu(tipo);
					  menu.exibirMenu();
					  
				  }else {
					  JOptionPane.showMessageDialog(null, "Senha incorreta.",
						      "Erro", JOptionPane.ERROR_MESSAGE);
					  break;
				  }
			  }
		}
		
		if (entrou==0) {
			JOptionPane.showMessageDialog(null, "Usuário não cadastrado.",
			      "Erro", JOptionPane.ERROR_MESSAGE);
		}
		
	}
	
}
