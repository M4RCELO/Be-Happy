package buscas;

import javax.swing.JOptionPane;

import buscas.interator.LoginInterator;
import buscas.interator.Usuarios;
import dominio.AlunoLogado;
import menu.aluno.MenuAluno;
import menu.escola.MenuEscola;
import menu.professor.MenuProfessor;
import menu.responsaveis.MenuResponsavel;

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
					  if (user.getTipo()==1) {
						  alunoLogado = new AlunoLogado(user.getMatricula(), user.getTurma(), user.getCpf_responsavel());
						  MenuAluno menu = new MenuAluno();
						  menu.exibirMenu();
					  }
					  else if(user.getTipo()==2) {
						  MenuProfessor menu = new MenuProfessor();
						  menu.exibirMenu();
					  }
					  else if(user.getTipo()==3) {
						  MenuResponsavel menu = new MenuResponsavel();
						  menu.exibirMenu();
					  }
					  else if(user.getTipo()==4) {
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
