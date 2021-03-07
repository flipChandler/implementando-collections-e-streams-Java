package br.com.felipesantos.comparators;

public class Funcionario implements Comparable<Funcionario> {
	
	private final String nome;
	private final int idade;
	private final double salario;
	private final String descricao;
	
	public Funcionario(String nome, int idade, double salario, String descricao) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.salario = salario;
		this.descricao = descricao;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public double getSalario() {
		return salario;
	}

	public String getDescricao() {
		return descricao;
	}

	// ordenar por nome
	@Override
	public int compareTo(Funcionario o) {		
		return this.getNome().compareTo(o.getNome());
	}

	@Override
	public String toString() {
		return nome + " - " + idade + " salario= " + salario + " - " + descricao;
	}
	
	
	
	
	
}
