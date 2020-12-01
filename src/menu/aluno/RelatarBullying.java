package menu.aluno;

import armazenamento.AmazenarAluno;
import outros.ObterValores;

public class RelatarBullying extends ObterValores{

	private AmazenarAluno armazenar = new AmazenarAluno();
	
	public void relatar() {
		System.out.println("====================================");
		String relato = obterValorString("Digite o que aconteceu: ");
		armazenar.relato(relato);
	}
	
}
