package menu.professor.Comportamento;

import armazenamento.ArmagenamentoRelatosProfessor;
import armazenamento.ArmazenamentoComportamentoDiario;
import outros.ObterValores;

public class ComportamentoDiario extends ObterValores {
   ArmazenamentoComportamentoDiario comportamentoDiario = new ArmazenamentoComportamentoDiario();
   ArmagenamentoRelatosProfessor relatosProfessor = new ArmagenamentoRelatosProfessor();
    public void compotamentoDiarioAluno( String matricula){
        String comportamento = obterValorString("Qual foi o comportamento desse aluno no dia?");
        String noti= comportamento +","+matricula+";";
        comportamentoDiario.escreverTexto(noti);
        relatosProfessor.escreverTexto(noti);
    }
}
