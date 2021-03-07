package br.com.felipesantos.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExemploHashSet {

	public static void main(String[] args) {
		/*
			 N�o garante ordem
			 N�o permite itens repetidos
			 N�o permite mudan�a de ordena��o
			 N�o permite atualiza��o, leitura apenas navega��o 
			 (-) adi��o de elementos tem o teste pra verificar se j� existe tal elemento | + custo de processamento
			 (+) para consultas, � mais perform�tico		 		 
		 */
		
		Set<Double> notasAlunos = new HashSet<>();
		
		notasAlunos.add(9.4);
		notasAlunos.add(2.8);
		notasAlunos.add(8.5);
		notasAlunos.add(1.9);
		notasAlunos.add(7.6);
		notasAlunos.add(4.8);
		notasAlunos.add(9.1);
		notasAlunos.add(3.2);
		
		System.out.println("Notas: " + notasAlunos);
		
		notasAlunos.remove(3.2);		
		System.out.println("Notas: " + notasAlunos);
		
		int tamanho = notasAlunos.size();
		System.out.println("Tamanho do Set de Notas: " + tamanho + "\n");
		
		Iterator<Double> iterator = notasAlunos.iterator();
		
		System.out.println("------Notas Iterator-----");
		while (iterator.hasNext()) {
			System.out.println("Notas: " + iterator.next());
		}
		
		System.out.println("\n-----Notas ForEach------");
		
		for (Double nota : notasAlunos) {
			System.out.println("Notas: " + nota);
		}
		
		notasAlunos.clear();
		
		boolean estaVazio = notasAlunos.isEmpty();
		
		System.out.println("O Set de Notas est� vazio? R: " + estaVazio);
		
	}

}
