package buscas.interator;

import dominio.Usuarios;

public interface Interator {
	
	void first();
	void next();
	boolean isDone();
	Usuarios currentItem();

}
