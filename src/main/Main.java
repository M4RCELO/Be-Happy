package main;

import marcelo.menu.MenuLogin;

public class Main {
	public static void main(String[] args) {
		MenuLogin menu = new MenuLogin();
		boolean continuarExecucao = true;
		while (continuarExecucao) {
			continuarExecucao = menu.exibirMenu();
		}
	}
}
