package br.com.felipesantos.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
	
	
	public static void addNames(List<String> names) {		
		names.add("Felipe");
		names.add("Goku");
		names.add("Bulma");
		names.add("Vegeta");
		names.add("Josiani");
		names.add("Susi");
		names.add("Cleo");
	}

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		
		addNames(names);
		
		System.out.println("Lista: " + names);
		
		// substituindo um elemento da lista
		names.set(2, "Priscila"); // substitui Bulma por Priscila
		System.out.println("Nome na posição 2 da lista: " + names.get(2));//
		
		// ordenando a lista
		Collections.sort(names);		
		System.out.println("Lista ordenada: " + names);
		
		// removendo um elemento pelo indice 
		names.remove(4); // Priscila
		System.out.println("Lista com Priscila removida: " + names);
		
		// removendo um elemento pelo nome 
		names.remove("Cleo");
		System.out.println("Lista com Cleo removida: " + names);
		
		int tamanho = names.size();
		System.out.println("Tamanho da lista " + tamanho);
		
		boolean hasGoku = names.contains("Goku");
		System.out.println("Tem Goku na lista: " + hasGoku);
		
		int position = names.indexOf("Susi");
		System.out.println("Posição de Susi na lista: " + position);
		
		boolean listIsEmpty = names.isEmpty();
		System.out.println("A lista está vazia: " + listIsEmpty);
		
		// limpa a lista
		names.clear();
		System.out.println("Lista: " + names + "\n");
		
		addNames(names);
		System.out.println("Imprime Lista novamente");
		for (String name : names) {
			System.out.println(name);
		}
		
		System.out.println();
		
		// usando o Iterator		
		Iterator<String> iterator = names.iterator();
		
		System.out.println("---Imprime lista Iterator---");
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		

	}

}
