package menu.responsaveis;

import menu.responsaveis.Notificacao.NotificacaoEscola;
import menu.responsaveis.relatorio.RelatorioBullying;
import menu.responsaveis.relatorio.RelatorioComportamental;
import menu.strategy.Menu;
import outros.ObterValores;

public class MenuResponsavel extends ObterValores implements Menu{
	
	private static final String LS = System.lineSeparator();

	@Override
	public boolean setStrategyMenu() {
		int opcao = 0;
		String menu = "";
		menu += "====================================" + LS;
		menu += "     Menu Principal - Responsável" + LS;
		menu += "====================================" + LS;
		menu += ++opcao + ". Relatório comportamental" + LS;
		menu += ++opcao + ". Relatório Bullying" + LS;
		menu += ++opcao + ". Enviar mensagem para a escola" + LS;
		menu += ++opcao + ". Relatório Semanal" + LS;
		menu += ++opcao + ". Notificação da escola" + LS;
		menu += ++opcao + ". Sair" + LS;
		
		while (true) {
			System.out.println(menu);
			int opcaoEscolhida = obterValorInteger("Digite uma opção: ");
			switch (opcaoEscolhida) {
				case 1:
					System.out.println("Relatório comportamental");
					RelatorioComportamental relatorioComportamental = new RelatorioComportamental();
					String matricula = obterValorString("Informe a matricula do seu responsavel:");// colocar a matricula automatico
					relatorioComportamental.RComportamental(matricula);
					break;
				case 2:
					System.out.println("Relatório Bullying");
					RelatorioBullying relatorioBullying = new RelatorioBullying();
					String matriculaa = obterValorString("Informe a matricula do seu responsavel:");// colocar a matricula automatico
					relatorioBullying.RBullying(matriculaa);
					break;
				case 3:
					System.out.println("Enviar mensagem para a escola");
					break;
				case 4:
					System.out.println("Relatório Semanal");// falar com Marcelo pra tirar
					break;
				case 5:
					System.out.println("Notificação da escola");
					NotificacaoEscola notificacaoEscola = new NotificacaoEscola();
					String matriculaaa = obterValorString("Informe a matricula do seu responsavel:");// colocar a matricula automatico
					notificacaoEscola.notiEscola(matriculaaa);
					break;
				case 6:
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
