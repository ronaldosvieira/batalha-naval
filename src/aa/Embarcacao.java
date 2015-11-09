package aa;

import java.util.ArrayList;

public class Embarcacao {
	
	private int tamanho;
	private int totalAcertos;
	private Orientacao orientacao;
	private ArrayList<Coordenada> coordenadas;
	
	public void posicionarEmbarcacao(ArrayList<Coordenada> listaCoordenadas, Orientacao orientacao) { 
		coordenadas = listaCoordenadas;
		this.orientacao = orientacao;
	}
	
	public boolean temCoordenada(Coordenada coordenada) { 
		return false;
	}
	
	public void marcarAcerto() { 
		totalAcertos++;
	}
	
	public int getTotalAcertos() { 
		return totalAcertos;
	}
	
	public int getTamanho() { 
		return tamanho;
	}
	
	public boolean afundou() { 
		return tamanho == totalAcertos;
	}
 	
}