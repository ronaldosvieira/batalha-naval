package aa;

import java.util.ArrayList;

public class Jogador {
	
	private String nickname; 
	private boolean bloqueado; 
	private TabuleiroDefesa tabuleiroDefesa;

	public Jogador(String nickname) { 
		this.nickname = nickname;
	}
	
	public void posicionarEmbarcacao(Embarcacao embarcacao, ArrayList<Coordenada> coordenadas) {
		
	}
	
	public void atirar(Coordenada coordenada) {
		
	}
	
	public boolean estaBloqueado() {
		return bloqueado;
	}
	
	public boolean verificarVitoria() {
		return true;
	}

}
