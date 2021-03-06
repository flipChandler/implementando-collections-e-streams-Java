package br.com.felipesantos.list;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class ExemploVector {

	public static void main(String[] args) {
		List<String> esportes = new Vector<>();
		
		esportes.add("Tênis");
		esportes.add("Futebol");
		esportes.add("Atletismo");
		esportes.add("Skate");
		esportes.add("Volei");
		esportes.add("Basquete");
		esportes.add("Natação");
		
		System.out.println("Lista: " + esportes);
		
		esportes.set(3, "Hipismo");
		System.out.println("Lista: " + esportes);
		
		esportes.remove(5);
		System.out.println("Lista: " + esportes);
		
		esportes.remove("Natação");
		System.out.println("Lista: " + esportes);
		
		System.out.println("Retorna a posição 4 da lista: " + esportes.get(4) +"\n");
		
		Iterator<String> iterator = esportes.iterator();
		
		System.out.println("----Imprimindo a lista Iterator----");
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
