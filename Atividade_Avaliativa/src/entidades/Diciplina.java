package entidades;

public enum Diciplina {
	FPOO("Fundamento de Programa�ao Orientada a Objetos"),
	LM("Linguagem de marca��o"),
	REDES("Redes"),
	SO("Sistemas Operacionais");
	
	String descricao;

	public String getDescricao() {
		return descricao;
	}

	Diciplina(String descricao) {
		this.descricao=descricao;
	}

}
