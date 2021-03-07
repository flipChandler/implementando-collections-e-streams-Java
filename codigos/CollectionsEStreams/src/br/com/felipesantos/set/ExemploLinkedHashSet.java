package br.com.felipesantos.set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class ExemploLinkedHashSet {

	public static void main(String[] args) {
		/*
		 Utilizar: quando � ncess�rio manter a ordem de inser��o dos elementos
		 Ordena��o: Mant�m a ordem de inser��o
		 Performance: � a implementa��o mais lenta por ser necess�rio manter a ordem		 
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
		
		System.out.println("Sequ�ncia n�merica: " + sequenciaNumerica);
		
		sequenciaNumerica.remove(1);
		System.out.println("Sequ�ncia n�merica: " + sequenciaNumerica);
		
		int tamanho = sequenciaNumerica.size();
		System.out.println("Tamanho do Set de Sequ�ncia: " + tamanho);
		
		Iterator<Integer> iterator = sequenciaNumerica.iterator();
		
		System.out.println("\n-----Sequ�ncia Iterator-------");
		int seq = 1;
		while(iterator.hasNext()) {
			System.out.println(seq + "� n�mero: " + iterator.next());
			seq++;
		}
		
		System.out.println("\n------Sequ�ncia ForEach-------");
		int cont = 1;
		for (Integer numero : sequenciaNumerica) {
			System.out.println(cont + "� n�mero: " + numero);
		}
		

	}

}
