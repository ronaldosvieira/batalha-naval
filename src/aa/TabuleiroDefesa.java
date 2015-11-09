package aa;

import java.util.ArrayList;

public class TabuleiroDefesa extends Tabuleiro {
	
	private ArrayList<Embarcacao> embarcacoes = new ArrayList<Embarcacao>();

	public TabuleiroDefesa(int tamanhoHorizontal, int tamanhoVertical) {
		super(tamanhoHorizontal, tamanhoVertical);
	}
	
	public void posicionarEmbarcacao(Embarcacao embarcacao, ArrayList<Coordenada> coordenadas) {
		
	}

	@Override
	public void marcarTiro(Coordenada coordenada) {
		// TODO Auto-generated method stub
		
	}
	
	public boolean foiJogoFInalizado() {
		boolean estadoJogo = true;
		
		for(Embarcacao e : embarcacoes) {
			estadoJogo = estadoJogo && e.afundou();
		}
		
		return estadoJogo; 
	}

}
