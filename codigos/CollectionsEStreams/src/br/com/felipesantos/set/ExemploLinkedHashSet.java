package br.com.felipesantos.set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class ExemploLinkedHashSet {

	public static void main(String[] args) {
		/*
		 Utilizar: quando é ncessário manter a ordem de inserção dos elementos
		 Ordenação: Mantém a ordem de inserção
		 Performance: é a implementação mais lenta por ser necessário manter a ordem		 
		 */
		
		Set<Integer> sequenciaNumerica = new LinkedHashSet<>();
		
		sequenciaNumerica.add(4);
		sequenciaNumerica.add(9);
		sequenciaNumerica.add(12);
		sequenciaNumerica.add(33);
		sequenciaNumerica.add(90);
		sequenciaNumerica.add(7);
		sequenciaNumerica.add(1);
		sequenciaNumerica.add(67);
		sequenciaNumerica.add(15);
		
		System.out.println("Sequência númerica: " + sequenciaNumerica);
		
		sequenciaNumerica.remove(1);
		System.out.println("Sequência númerica: " + sequenciaNumerica);
		
		int tamanho = sequenciaNumerica.size();
		System.out.println("Tamanho do Set de Sequência: " + tamanho);
		
		Iterator<Integer> iterator = sequenciaNumerica.iterator();
		
		System.out.println("\n-----Sequência Iterator-------");
		int seq = 1;
		while(iterator.hasNext()) {
			System.out.println(seq + "º número: " + iterator.next());
			seq++;
		}
		
		System.out.println("\n------Sequência ForEach-------");
		int cont = 1;
		for (Integer numero : sequenciaNumerica) {
			System.out.println(cont + "º número: " + numero);
		}
		

	}

}
