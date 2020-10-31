package marcelo.menu.factory;

import marcelo.menu.Menu;
import marcelo.menu.aluno.MenuAluno;
import marcelo.menu.escola.MenuEscola;
import marcelo.menu.professor.MenuProfessor;
import marcelo.menu.responsaveis.MenuResponsavel;

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
