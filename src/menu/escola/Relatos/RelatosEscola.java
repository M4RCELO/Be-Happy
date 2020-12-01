package menu.escola.Relatos;

import armazenamento.ArmazenamentoRelatos;
import outros.ObterValores;

public class RelatosEscola extends ObterValores {
    ArmazenamentoRelatos armazenamentoRelatos = new ArmazenamentoRelatos();

    public void RelatosAlunosEscola( boolean todos){
        if(todos==true){
            String texto = armazenamentoRelatos.lerTexto();
            String[] users = texto.split(";");
            for (int i = 0; i < users.length; i++) {
                System.out.println(users[i]);
            }
        }
        else if (todos==false){
            String matriculaAluno = obterValorString("Informe a Matricula do Aluno que deseja ver os relatos:");
            String texto = armazenamentoRelatos.lerTexto();
            String[] users = texto.split(";");

            for (int i = 0; i < users.length; i++) {
                String[] matriz_users = users[i].split(",");
                matriz_users[0] = matriz_users[0].replace(" ", "");
                if(matriz_users[0].equals(matriculaAluno)){
                    System.out.println(users[i]);
                }


            }
        }
    }
}
