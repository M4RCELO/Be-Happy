package menu.aluno.atuhumor;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import armazenamento.ArmazenamentoHumorAlunos;
import dominio.AlunoLogado;

public class AmazenarHumor {
	
	private ArmazenamentoHumorAlunos armazenamento = new ArmazenamentoHumorAlunos();
	private Calendar c = Calendar.getInstance();
	private SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
	
	public void Humor(String humor,AlunoLogado aluno) {
		String hora = Integer.toString(c.getTime().getHours());
		String minutos = Integer.toString(c.getTime().getMinutes());
		String segundos = Integer.toString(c.getTime().getSeconds());
		c.setTime(c.getTime());
		
		String horaStr = hora+":"+minutos+":"+segundos;
		String dataStr = formato.format(c.getTime());
		
		String infos = aluno.getMatricula().toString()+", "+aluno.getTurma().toString()+", "+aluno.getCpf_responsavel().toString()+", "+humor+", "+dataStr+", "+horaStr+" ;";
		armazenamento.escreverTexto(infos);
	}

}
