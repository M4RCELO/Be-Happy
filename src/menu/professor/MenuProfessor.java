package menu.professor;

import menu.aluno.TelaAtuHumor;
import menu.professor.Comportamento.ComportamentoDiario;
import menu.professor.Coordenacao.AcontecimentoCoordenação;
import menu.professor.Relatorio.RelatorioProfessor;
import menu.strategy.Menu;
import outros.ObterValores;

public class MenuProfessor extends ObterValores implements Menu{
	
	private static final String LS = System.lineSeparator();

	@Override
	public boolean setStrategyMenu() {
		
		int opcao = 0;
		String menu = "";
		menu += "====================================" + LS;
		menu += "     Menu Principal - Professor" + LS;
		menu += "====================================" + LS;
		menu += ++opcao + ". Comportamento diário" + LS;
		menu += ++opcao + ". Relatório Semanal" + LS;
		menu += ++opcao + ". Relatar acontecimentos a coordenação" + LS;
		menu += ++opcao + ". Sair" + LS;
		
		while (true) {
			System.out.println(menu);
			int opcaoEscolhida = obterValorInteger("Digite uma opção: ");
			switch (opcaoEscolhida) {
				case 1:
					System.out.println("Comportamento diário");// passar um for no txt da turma do professor e mandar para a funçao
					ComportamentoDiario comportamentoDiario = new ComportamentoDiario();
					String matricula = obterValorString("Informe a matricula do aluno:");// vai ser substituida pelo for
					comportamentoDiario.compotamentoDiarioAluno(matricula);

					break;

				case 2:
					System.out.println("Relatório Semanal");
					int tipo = obterValorInteger("Qual relatório você deseja? Relatos (1) ou Humor (2)");
					RelatorioProfessor relatorioProfessor = new RelatorioProfessor();
					relatorioProfessor.RelatorioDosProfessores(tipo);
					break;
				case 3:
					System.out.println("Relatar acontecimentos a coordenação");
					AcontecimentoCoordenação acontecimentoCoordenação = new AcontecimentoCoordenação();
					String matriculaAluno = obterValorString("Informe a matricula do aluno que deseja relatar o acontecimento:");
					acontecimentoCoordenação.Acontecimento(matriculaAluno);
					break;
				case 4:
					return false;
				default:
					System.out.println();
					System.out.println("Erro! Opção desconhecida: " + opcaoEscolhida);
					System.out.println();
					break;
			}
		}
	}

}
