package entidades;

import java.util.ArrayList;

/**
 * classa Aluno com metodos:
 * -adicionarNotas,removerNotas,listarNotas
 * 
 * utila um enum Disciplina
 * e uma ArrayList<Double> nesta classe
 * 
 */

public class Aluno extends Pessoa {
	//atributos
	private String codigoTurma;
	private Disciplina disciplinas;
	private ArrayList<Double> notas;
	
	//construtor
	/**
	 *  Construtor para instanciar os seguintes par�metros
	 * @param nome
	 * @param cpf
	 * @param codigoTurma
	 * @param disciplinas 
	 * @param notas
	 */
	
	
	
	public Aluno(String nome, Integer cpf, String codigoTurma, Disciplina disciplinas) {
		super(nome,cpf);
		this.codigoTurma = codigoTurma;

		this.disciplinas=disciplinas;
		notas = new ArrayList<Double>();
		
	}
	//contrutor padrao
	public Aluno(String nome, Integer cpf) {
		super(nome,cpf);
	}
	
	//gets e sets
	public String getCodigoTurma() {
		return codigoTurma;
	}
	
	public void setCodigoTurma(String codigoTurma) {
		this.codigoTurma = codigoTurma;
	}
	
	public Disciplina getDisciplinas() {
		return disciplinas;
	}
	
	public void setDisciplinas(Disciplina disciplinas) {
		this.disciplinas = disciplinas;
	}
	
	
	//metodo para adicionar notas do ArrayList
	public void adicionarNota(Double nota) {
		notas.add(nota);
	}
	//metodo remover notas do ArrayList
	public void removerNota(Double nota) {
		notas.remove(nota);
	}
	//metodo para listar as notas
	public void listarNotas() {
		if (notas.isEmpty()) {
			System.out.println("Nao tem notas na lista");
		}	else {
			for(int i = 0;i < notas.size(); i++) {
				System.out.println("_________ "+notas.get(i)+" _________");
				}
					
				}
		}
	/*
	 * metodo para calcular nota com os atributos
	 * soma e media
	 * 
	 */
	
	public double calcularNota() {
		double media=0.0;
	    double soma=0.0;
	    
	    for(int i = 0; i < notas.size(); i++) {
			soma = soma + notas.get(i);
		}
	    media = soma / notas.size();
	    
		return media;
		
		
	}
	
	@Override
	public String toString() {
		return "Aluno [nome="+ getNome() +" CPF="+ getCpf() + "   codigoTurma=" + codigoTurma + ", disciplinas=" + disciplinas + ", notas=" + notas + "]";
	}
	
	//metodo abstrato herdado de Pessoa
	
	
	@Override
	public void Informacao() {
		
		System.out.println(toString());
	}
	
	

}
