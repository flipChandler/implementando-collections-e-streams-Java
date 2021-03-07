package br.com.felipesantos.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExemploHashSet {

	public static void main(String[] args) {
		/*
			 Não garante ordem
			 Não permite itens repetidos
			 Não permite mudança de ordenação
			 Não permite atualização, leitura apenas navegação 
			 (-) adição de elementos tem o teste pra verificar se já existe tal elemento | + custo de processamento
			 (+) para consultas, é mais performático		 		 
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
		
		System.out.println("O Set de Notas está vazio? R: " + estaVazio);
		
	}

}
