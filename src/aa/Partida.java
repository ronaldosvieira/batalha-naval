package aa;

import java.util.ArrayList;

public class Partida {
	
	private Jogador jogador1;
	private Jogador jogador2;	
	private ArrayList<Espectador> espectadores;
	
	public Partida(Jogador jogador1, Jogador jogador2) {
		this.jogador1 = jogador1;
		this.jogador2 = jogador2;
	}
	
	public void iniciarPartida() {
		
	}
	
	public Jogador sortearJogadorInicial() {
		return null;
	}
	
	public void criarNovaRodada() {
		
	}
	
	public boolean temVencedor() {
		return false;
	}
	
	public void finalizarPartida() {
		
	}
}
