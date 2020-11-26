package buscas.interator;

import java.util.ArrayList;

import armazenamento.ArmazenamentoUsuariosSingleton;

public class LoginInterator implements Interator{
	
	ArrayList<Usuarios> users = new ArrayList<>();
	int posicao = 0;
	ArmazenamentoUsuariosSingleton armazenamento = ArmazenamentoUsuariosSingleton.getInstancia();

	public LoginInterator() {
		getUsers();
	}

	@Override
	public boolean hasNext() {
		if (posicao >= users.size() || users.get(posicao) == null) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public Object next() {
		Usuarios user = users.get(posicao);
		posicao++;
		return user;
	}
	
	private void getUsers() {
		
		String texto = armazenamento.lerTexto();
		String[] allUsers = texto.split(";");
		
		for (int i = 0; i<allUsers.length;i++) {
			String[] matriz_users = allUsers[i].split(",");	
			int tipo = Integer.parseInt(matriz_users[matriz_users.length-1].replace(" ", ""));
			
			if(tipo!=4) {
				matriz_users[1] = matriz_users[1].replace(" ", "");
				matriz_users[2] = matriz_users[2].replace(" ", "");
				matriz_users[3] = matriz_users[3].replace(" ", "");
				matriz_users[4] = matriz_users[4].replace(" ", "");
				
				if (tipo==1)users.add(new Usuarios(matriz_users[2], matriz_users[1], Integer.parseInt(matriz_users[3]), Long.parseLong(matriz_users[4]), tipo));
				else users.add(new Usuarios(matriz_users[2], matriz_users[1], tipo));
			}else {
				matriz_users[1] = matriz_users[1].replace(" ", "");
				matriz_users[2] = matriz_users[2].replace(" ", "");
				
				users.add(new Usuarios(matriz_users[2], matriz_users[1], tipo));
			}
			
		}
		
	}
}
