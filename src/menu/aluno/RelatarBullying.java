package menu.aluno;

import armazenamento.Amazenar;
import outros.ObterValores;

public class RelatarBullying extends ObterValores{

	private Amazenar armazenar = new Amazenar();
	
	public void relatar() {
		System.out.println("====================================");
		String relato = obterValorString("Digite o que aconteceu: ");
		armazenar.relato(relato);
	}
	
}
