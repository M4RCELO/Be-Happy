package gerador;

import armazenamento.ArmazenamentoUsuariosSingleton;


public class MatriculaSequencial {
	
	ArmazenamentoUsuariosSingleton armazenamento = ArmazenamentoUsuariosSingleton.getInstance();
	
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
		String texto = armazenamento.lerTexto();
		String[] users = texto.split(";");
		Integer maiorId = -1;
		
		for (int i = 0; i < users.length; i++) {
			  String[] matriz_users = users[i].split(",");	
			  matriz_users[matriz_users.length-1] = matriz_users[matriz_users.length-1].replace(" ", "");
			  int tipo = Integer.parseInt(matriz_users[matriz_users.length-1]);
			  
			  if(tipo==1 || tipo==2 || tipo==4) {
				  matriz_users[2] = matriz_users[2].replace(" ", "");
				  if(Integer.parseInt(matriz_users[2])>maiorId) {
					  maiorId = Integer.parseInt(matriz_users[2]);
				  }
			  }
			  
			  
		}
		
		return maiorId;
	}

}
