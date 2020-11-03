package menu.factory;

import menu.Menu;
import menu.aluno.MenuAluno;
import menu.escola.MenuEscola;
import menu.professor.MenuProfessor;
import menu.responsaveis.MenuResponsavel;

public abstract class MenuFactory {
	public static Menu getExibirMenu(int i){

        if(i==1){
            return new MenuAluno();
        }
        else if(i==2){
            return new MenuProfessor();
        }
        
        else if(i==3){
            return new MenuResponsavel();
        }
        
        else if(i==4){
            return new MenuEscola();
        }
        
        else {
        	return null;
        }

    }
}
