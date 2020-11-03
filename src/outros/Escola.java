package outros;

import dominio.Aluno;
import dominio.Professor;

public class Escola extends ObterValores{
    public void dia_aluno(Aluno aluno){
        boolean triste =this.obterValorBoolean("Você se sentiu triste hoje? ");
        boolean feliz =this.obterValorBoolean("Você se sentiu feliz hoje?");
        if (triste==true){
            String acontecimento=this.obterValorString("O que aconteceu para você estar triste? ");
        }
        else if( triste==false && feliz==false){
            boolean normal = true;
        }
        System.out.println("Agradecemos sua avaliação do dia.");


    }
    public void dia_professor(Professor professor){ // Tem que colocar a lista das turmas e fazer uma condição para avaliar todos os alunos
        boolean triste =this.obterValorBoolean("Esse aluno estava triste hoje? ");
        boolean feliz =this.obterValorBoolean("Esse aluno estava feliz hoje?");
        if (triste==true){
            String acontecimento=this.obterValorString("O que aconteceu para este aluno estar triste hoje? ");
        }
        else if( triste==false && feliz==false){
            boolean normal = true;
        }
        System.out.println("Agradecemos sua avaliação do dia.");



    }
}
