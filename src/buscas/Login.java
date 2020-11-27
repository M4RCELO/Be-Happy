package buscas;

import javax.swing.JOptionPane;

import buscas.interator.LoginInterator;
import buscas.interator.Usuarios;
import dominio.AlunoLogado;
import menu.aluno.MenuAluno;
import menu.escola.MenuEscola;
import menu.professor.MenuProfessor;
import menu.responsaveis.MenuResponsavel;
import menu.strategy.ExibirMenu;
import menu.strategy.Menu;

public class Login {
	
	public static AlunoLogado alunoLogado;
	
	public void fazerLogin(String matricula, String senha) {
		
		int entrou = 0;
		
		LoginInterator loginInterator = new LoginInterator();
		
		while (loginInterator.hasNext()) {
			Usuarios user = (Usuarios) loginInterator.next();
			
			if (user.getMatricula().equals(matricula)) {
				  entrou+=1;
				  if(user.getSenha().equals(senha)) {  
					
					  
					ExibirMenu exibirMenu = new ExibirMenu();
					Menu menu = null;
					
					switch (user.getTipo()) {
					case 1:
						alunoLogado = new AlunoLogado(user.getMatricula(), user.getTurma(), user.getCpf_responsavel());
						menu = new MenuAluno();
						break;
						
					case 2:
						menu = new MenuProfessor();
						break;
						
					case 3:
						menu = new MenuResponsavel();
						break;
						
					case 4:
						menu = new MenuEscola();
						break;
					default:
						break;
					}
					
					exibirMenu.exibir(menu);
					  
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
