package br.com.felipesantos.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ExemploStream {
	/*
	 * Manipulação de coleções com o paradigma funcional de forma paralela
	 * Imutável - não altera a coleção origem, sempre cria uma nova coleção
	 * 
	 * Mapping: retorna uma coleção com mesmo tamanho da origem com os elementos alterados
	 * Filtering: retorna uma coleção igual ou menor que a coleção origem, com os elementos intactos
	 * ForEach: executa uma determinada lógica para cada elemento, retornando nada
	 * Peek: executa uma determinada lógica para cada elemento, retornando a própria coleção
	 * Counting: retorna um inteiro que representa a contagem de elementos
	 * Grouping: retorna uma coleção agrupada de acordo com a regra definida
	 */
	
	public static void main(String[] args) {
		List<String> estudantes = new ArrayList<>();
		
		estudantes.add("Pedro");
		estudantes.add("Thayse");
		estudantes.add("Marcelo");
		estudantes.add("Sheila");
		estudantes.add("Leo");
		estudantes.add("Theo");
		estudantes.add("Rafael");
		estudantes.add("Sean");
		
		int contagem = (int) estudantes.stream().count();
		System.out.println("Contagem: " + contagem);
		
		Optional<String> objComMaiorNumeroDeLetras = estudantes.stream()
				.max(Comparator.comparingInt(String::length));
		System.out.println("Elemento com maior número de letras: " + objComMaiorNumeroDeLetras.get());
		
		Optional<String> objComMenorNumeroDeLetras = estudantes.stream()
				.min(Comparator.comparingInt(String::length));
		System.out.println("Elemento com menor número de letras: " + objComMenorNumeroDeLetras.get());
		
		List<String> listaComALetraR =  estudantes.stream()
				.filter((estudante) ->
				estudante.toLowerCase()
				.contains("r"))
				.collect(Collectors.toList());			
		System.out.println("Elementos com a letra r no nome: " + listaComALetraR);
		
		List<String> listaEstudantes = estudantes.stream()
			.map(estudante -> estudante.concat(" - ")
			.concat(String.valueOf(estudante.length())))
			.collect(Collectors.toList()); 			
		System.out.println("Retorna uma nova coleção com a quantidade de letras: " + listaEstudantes);
		
		List<String> top3Estudantes = estudantes.stream()
				.limit(3).collect(Collectors.toList());
		System.out.println("Top 3 dos estudantes: " + top3Estudantes);
		
		System.out.println("\n----LISTA DE ESTUDANTES STREAM FOREACH----");
		estudantes.stream().forEach(System.out::println);
		
		System.out.println("\n----LISTA STREAM PEEK------");
		estudantes.stream().peek(System.out::println).collect(Collectors.toList());
		
		boolean contemW = estudantes.stream().allMatch((elemento) -> elemento.toLowerCase().contains("e"));
		System.out.println("\nSe todos os nomes contêm a letra 'e'? R: " + contemW);
		
		boolean contemA = estudantes.stream().anyMatch((elemento) -> elemento.toLowerCase().contains("a"));
		System.out.println("\nSe algum dos nomes contêm a letra 'a'? R: " + contemA);
		
		boolean naoContemA = estudantes.stream().noneMatch((elemento) -> elemento.toLowerCase().contains("a"));
		System.out.println("\nSe nenhum dos nomes contêm a letra 'a'? R: " + naoContemA);
		
		System.out.print("\nQual é o primeiro nome da coleção? R: ");
		estudantes.stream().findFirst().ifPresent(System.out::println);
		
		System.out.println("\n----OPERAÇÃO ENCADEADA-----");
		System.out.println(estudantes.stream()
				.peek(System.out::println)
				.map(estudante -> estudante.concat(" - ").concat(String.valueOf(estudante.length())))
				.peek(System.out::println)
				.filter((estudante) -> estudante.toLowerCase().contains("r"))
				//.collect(Collectors.toList()));
				//.collect(Collectors.joining(", "))); // acrescenta ',' entre os elementos da lista
				//.collect(Collectors.toSet()));
				.collect(Collectors.groupingBy(estudante -> estudante.substring(estudante.indexOf("-") + 1)))); // agrupa os elementos por tamanho de letra
		
		
		
		
		
		
		

		
		
		
	}
}
