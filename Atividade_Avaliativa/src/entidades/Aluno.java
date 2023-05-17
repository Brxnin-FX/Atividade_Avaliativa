package entidades;

import java.util.ArrayList;

public class Aluno extends Pessoa{
	
	Diciplina diciplina;
	String codigoTurma;
	double media;
	ArrayList<Double> notas;
	
	
	public Aluno(String nome, double cpf,Diciplina diciplina,String codigoTurma) {
		super(nome, cpf);
		this.codigoTurma=codigoTurma;
		this.diciplina=diciplina;
		this.media=media;
		notas = new ArrayList<Double>();
		
	}
	
	
	//Gets and Setters

	public String getCodigoTurma() {
		return codigoTurma;
	}

	public void setCodigoTurma(String codigoTurma) {
		this.codigoTurma = codigoTurma;
	}

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}


	//Metodos
	
	
	
	public void adicionarNotas(double notaAluno) {
		notas.add(notaAluno);
	}
	

	public void removerNotas(double notaAluno) {
		notas.remove(notaAluno);
	}


	public double calcularMedia() {
		double soma = 0, media = 0;
	for(Double nota : notas) {
		soma += nota;
	}
	media = (soma /notas.size());
	
	return media;

	}
	
	public void listarNotas() {
		System.out.println("Notas desse Aluno: ");
		for(Double nota : notas) {
			System.out.println(nota);
		}
	}
	
	
	

	@Override
	public String exibirInformacoes() {
		
		return null;
	}
	
	
	
	
	
	
	
	
	
	
	public void MenuAluno() {
		System.out.println("Escolha sua opção");
		System.out.println("1 - Adicionar Nota");
		System.out.println("2 - Remover Nota");
		System.out.println("3 - Listar Notas");
		System.out.println("4 - Calcular Media");
		System.out.println("5 - Voltar");
	}
	

}
