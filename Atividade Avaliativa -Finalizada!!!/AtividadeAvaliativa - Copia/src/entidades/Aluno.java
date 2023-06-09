package entidades;

import java.util.ArrayList;
import java.util.Scanner;



/**
 * classa Aluno com metodos:
 * -adicionarNotas,removerNotas,listarNotas
 * 
 * utila um enum Disciplina
 * e uma ArrayList<Double> nesta classe
 * 
 */

public class Aluno extends Pessoa {
	
	private Turma turma;
	
	
	
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
	
	
	Scanner entrada = new Scanner(System.in);
	
	public Aluno(String nome, Integer cpf, String codigoTurma, Disciplina disciplinas) {
		super(nome,cpf);
		this.codigoTurma = codigoTurma;

		this.disciplinas=disciplinas;
		notas = new ArrayList<Double>();
		
	}
	public ArrayList<Double> getNotas() {
		return notas;
	}
	public void setNotas(ArrayList<Double> notas) {
		this.notas = notas;
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
	public ArrayList<Double> adicionarNota() {
		ArrayList<Double> notaAserAdd = new ArrayList<>();
		System.out.println("Quantas notas deseja adicionar? ");
		int qtdNota = entrada.nextInt();
		for(int i=0;i<qtdNota;i++) {
			System.out.println("Nota "+i);
			double notaAdd = entrada.nextDouble();
			notaAserAdd.add(notaAdd);
			System.out.println("Nota adicionada...");
		}
		return notaAserAdd;
	}
	//metodo remover notas do ArrayList
	public void removerNota(Double nota) {
		notas.remove(nota);
	}
	
	//metodo para listar as notas
	public void listarNotas() {
	System.out.println("Notas: " + notas);	
	}
	/*
	 * metodo para calcular nota com os atributos
	 * soma e media
	 * 
	 */
	
	public Double calcularNota() {
		Double media;
	    Double soma=0.0;
	    
	    for(Double n : notas) {
	    	soma = n.doubleValue() + soma;
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
