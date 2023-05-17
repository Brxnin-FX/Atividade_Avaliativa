package entidades;

public enum Diciplina {
	FPOO("Fundamento de Programaçao Orientada a Objetos"),
	LM("Linguagem de marcação"),
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
