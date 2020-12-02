package menu.professor.Comportamento;

import armazenamento.ArmazenamentoTurmas;
import outros.ObterValores;

public class Turmas extends ObterValores {

    public void pecorrer( Integer turma){
        ArmazenamentoTurmas armazenamentoTurmas = new ArmazenamentoTurmas(turma);
        String texto = armazenamentoTurmas.lerTexto();
        String[] users = texto.split(";");
        for (int i = 0; i < users.length; i++) {
            String[] matriz_users = users[i].split(",");
            matriz_users[1] = matriz_users[1].replace(" ", "");
            String matricula = matriz_users[1];
            System.out.println(users[i]);
            ComportamentoDiario comportamentoDiario = new ComportamentoDiario();
            comportamentoDiario.compotamentoDiarioAluno(matricula);
        }
    }

}
