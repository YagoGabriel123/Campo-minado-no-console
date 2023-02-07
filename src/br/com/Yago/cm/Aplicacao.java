package br.com.Yago.cm;

import br.com.Yago.cm.modelo.Tabuleiro;
import br.com.Yago.cm.visao.TabuleiroConsole;

public class Aplicacao {
	public static void main(String[] args) {
	
		Tabuleiro tabuleiro = new Tabuleiro(6,6,6);
		new TabuleiroConsole(tabuleiro);
	}

}
