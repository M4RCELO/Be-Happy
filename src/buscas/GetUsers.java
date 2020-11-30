package buscas;

import java.util.ArrayList;

import armazenamento.ArmazenamentoUsuariosSingleton;
import buscas.interator.Usuarios;

public class GetUsers {
	
	private static ArmazenamentoUsuariosSingleton armazenamento = ArmazenamentoUsuariosSingleton.getInstancia();
	
	public static ArrayList<Usuarios> users() {
		
		ArrayList<Usuarios> users = new ArrayList<>();
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
		
		return users;
	}
	
}
