package br.com.felipesantos.optional;

import java.util.Optional;

public class ExemploEstadosOptional {

	public static void main(String[] args) {
		Optional<String> optionalString = Optional.of("Valor presente");
		
		System.out.println("Valor Optional que está presente");
		optionalString.ifPresentOrElse(
				System.out::println, () -> System.out.println("Não está presente"));
		
		
		Optional<String> optionalNull = Optional.ofNullable(null);
		System.out.println("\nValor Optional que não está presente");
		optionalNull.ifPresentOrElse(
				System.out::println, () -> System.out.println("[null] Não está presente"));
		
		Optional<String> emptyOptional = Optional.empty();
		System.out.println("\nValor Optional que está vazio");
		emptyOptional.ifPresentOrElse(
				System.out::println, () -> System.out.println("[empty] Não está presente"));
		
		Optional<String> optionalNullErro = Optional.of(null);
		System.out.println("Valor Optional lança NullPointerException");
		optionalNullErro.ifPresentOrElse(
				System.out::println, ()-> System.out.println("[erro] Não está presente"));

	}

}
