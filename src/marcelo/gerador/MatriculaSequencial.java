package marcelo.gerador;

import java.nio.file.Path;
import java.nio.file.Paths;

import marcelo.armazenamento.ArmazenamentoEmTexto;


public class MatriculaSequencial {
	
	ArmazenamentoEmTexto armazenamento = new ArmazenamentoEmTexto("/home/marcelo/Área de Trabalho/Códigos/Java/Be-Happy/Dados/Usuarios.txt");
	Path arquivo_path = Paths.get("/home/marcelo/Área de Trabalho/Códigos/Java/Be-Happy/Dados", "Usuarios.txt");
	
	public String obterProximoId() {
		Integer maiorId = getMaiorId()+1;
		String maiorIdSrt = maiorId.toString();
		if(maiorIdSrt.length()==1) {
			return "000"+maiorIdSrt;
		}else if(maiorIdSrt.length()==2) {
			return "00"+maiorIdSrt;
		}else if(maiorIdSrt.length()==3) {
			return "0"+maiorIdSrt;
		}
		
		return maiorIdSrt;
	}
	
	private Integer getMaiorId() {
		String texto = armazenamento.lerTexto(arquivo_path);
		String[] users = texto.split(";");
		Integer maiorId = -1;
		
		for (int i = 0; i < users.length; i++) {
			  String[] matriz_users = users[i].split(",");	
			  matriz_users[2] = matriz_users[2].replace(" ", "");
			  
			  if(Integer.parseInt(matriz_users[2])>maiorId) {
				  maiorId = Integer.parseInt(matriz_users[2]);
			  }
			  
		}
		
		return maiorId;
	}

}
