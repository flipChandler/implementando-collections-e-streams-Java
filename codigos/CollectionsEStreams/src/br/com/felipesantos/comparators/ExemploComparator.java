package br.com.felipesantos.comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExemploComparator {
	
	public static void main(String[] args) {
		
		/*
		 Comparable e Comparator são interfaces auxiliares da API de Collections para trabalhar
		 com ordenação de coleções		  
		 */
		
		List<Estudante> estudantes = new ArrayList<>();
		
		estudantes.add(new Estudante("Pedro", 19));
		estudantes.add(new Estudante("Carlos", 23));
		estudantes.add(new Estudante("Mariana", 21));
		estudantes.add(new Estudante("João", 18));
		estudantes.add(new Estudante("Sabrina", 20));
		estudantes.add(new Estudante("Raquel", 22));
		estudantes.add(new Estudante("Lucas", 21));
		estudantes.add(new Estudante("Josiani", 27));
		estudantes.add(new Estudante("Alexia", 39));
		estudantes.add(new Estudante("Karina", 28));
		
		System.out.println("\n----ORDEM DE INSERÇÃO-----");
		System.out.println(estudantes);
		
		estudantes.sort((primeiro, segundo) -> primeiro.getIdade() - segundo.getIdade());
		System.out.println("\n----Ordem crescente por idade----");
		System.out.println(estudantes);
		
		estudantes.sort((primeiro, segundo) -> segundo.getIdade() - primeiro.getIdade());
		System.out.println("\n----Ordem Decrescente por Idade-----");
		System.out.println(estudantes);
		
		estudantes.sort(Comparator.comparingInt(Estudante::getIdade)); // "compara os inteiros usando o getIdade"
		System.out.println("\n----Ordem crescente por idade (method reference) ---");
		System.out.println(estudantes);
		
		estudantes.sort(Comparator.comparingInt(Estudante::getIdade).reversed());
		System.out.println("\n----Ordem decrescente por idade (method reference) ---");
		System.out.println(estudantes);
		
		Collections.sort(estudantes); // somente quando Estudante implementa Comparable | sort é de Comparable
		System.out.println("\n----Ordem crescente por idade (implementa Comparable) ---");
		System.out.println(estudantes);
		
		Collections.sort(estudantes, new EstudanteComparatorReverso()); 
		System.out.println("\n----Ordem decrescente por idade (interface Comparator) ---");
		System.out.println(estudantes);
		
		
		
	}
}
