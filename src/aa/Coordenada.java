package aa;

public class Coordenada {
	
	private int coordenadaX;
	private int coordenadaY;
	private boolean marcada;
	
	public Coordenada (int coordenadaX, int coordenadaY) {
		this.coordenadaX = coordenadaX;
		this.coordenadaY = coordenadaY;
	}
	
	public int getCoordenadaX() {
		return coordenadaX;
	}
	
	public int getCoordenadaY() {
		return coordenadaY;
	}
	
	public void marcarTipo() {
		if(!marcada) marcada = true;
	}

}
