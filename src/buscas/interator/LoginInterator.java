package buscas.interator;

import java.util.ArrayList;

import dominio.Usuarios;

public class LoginInterator implements Interator{
	
	private ArrayList<Usuarios> lista;
	private int posicao;

	public LoginInterator(ArrayList<Usuarios> users) {
		this.lista = users;
		posicao = 0;
	}

	@Override
	public void first() {
		posicao = 0;
	}

	@Override
	public void next() {
		posicao++;
	}

	@Override
	public boolean isDone() {
		return posicao == lista.size();
	}

	@Override
	public Usuarios currentItem() {
		if(isDone()) posicao = lista.size()-1;
		else if (posicao<0) posicao=0;
		
		return lista.get(posicao);
	}

	
}
