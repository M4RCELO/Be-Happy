package buscas.interator;

import java.util.ArrayList;

import buscas.GetUsers;

public class LoginInterator implements Interator{
	
	ArrayList<Usuarios> users = new ArrayList<>();
	int posicao = 0;

	public LoginInterator() {
		users = GetUsers.users();
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
	
}
