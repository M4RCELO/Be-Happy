package buscas;

import javax.swing.JOptionPane;

import armazenamento.ArmazenamentoUsuariosSingleton;
import dominio.AlunoLogado;
import menu.aluno.MenuAluno;
import menu.escola.MenuEscola;
import menu.professor.MenuProfessor;
import menu.responsaveis.MenuResponsavel;

public class Login {
	
	public static AlunoLogado alunoLogado;

	ArmazenamentoUsuariosSingleton armazenamento = ArmazenamentoUsuariosSingleton.getInstancia();
	
	public void fazerLogin(String matricula, String senha) {
		
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
					  
					  if (tipo==1) {
						  alunoLogado = new AlunoLogado(matriz_users[2], Integer.parseInt(matriz_users[3].replace(" ", "")), Long.parseLong(matriz_users[4].replace(" ", "")));
						  MenuAluno menu = new MenuAluno();
						  menu.exibirMenu();
					  }
					  else if(tipo==2) {
						  MenuProfessor menu = new MenuProfessor();
						  menu.exibirMenu();
					  }
					  else if(tipo==3) {
						  MenuResponsavel menu = new MenuResponsavel();
						  menu.exibirMenu();
					  }
					  else if(tipo==4) {
						  MenuEscola menu = new MenuEscola();
						  menu.exibirMenu();
					  }
			        
					  
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
