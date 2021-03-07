package br.com.felipesantos.comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Exercicios {
	
	public static void main(String[] args) {
		List<Funcionario> funcionarios = new ArrayList<>();
		
		funcionarios.add(new Funcionario("Joca", 33, 2000.0, "auxiliar"));
		funcionarios.add(new Funcionario("Jamal", 23, 4000.0, "analistar"));
		funcionarios.add(new Funcionario("Francis", 25, 3500.0, "secretaria"));
		funcionarios.add(new Funcionario("Plinio", 18, 2000.0, "assistente"));
		funcionarios.add(new Funcionario("Mauro", 41, 1500.0, "pedreiro"));
		funcionarios.add(new Funcionario("Susi", 273, 4500.0, "marketeira"));
		
		funcionarios.sort(Comparator.naturalOrder()); // ordenou pelo nome, conforme compareTo de Funcioanrios
				
		for (Funcionario funcionario : funcionarios) {
			System.out.println(funcionario);
		}		
		
		System.out.println();
		Collections.sort(funcionarios); // pelo nome, pq implementou Comparable em Funcionario
		for (Funcionario funcionario : funcionarios) {
			System.out.println(funcionario);
		}
	}
}
