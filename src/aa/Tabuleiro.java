package aa;

public abstract class Tabuleiro { 
	
	private int tamanhoHorizontal = 10;
	private int tamanhoVertical = 10;
	
	public Tabuleiro(int tamanhoHorizontal, int tamanhoVertical) {
		if(validarCampos(tamanhoHorizontal, tamanhoVertical)) {
			this.tamanhoHorizontal = tamanhoHorizontal;
			this.tamanhoVertical = tamanhoVertical;
		}
	}
	
	public abstract void marcarTiro(Coordenada coordenada);
	
	private boolean validarCampos(int tamanhoHorizontal, int tamanhoVertical) {
		return tamanhoHorizontal == tamanhoVertical;
	}
}