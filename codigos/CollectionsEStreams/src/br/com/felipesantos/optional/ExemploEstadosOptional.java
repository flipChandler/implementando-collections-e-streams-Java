package br.com.felipesantos.optional;

import java.util.Optional;

public class ExemploEstadosOptional {

	public static void main(String[] args) {
		Optional<String> optionalString = Optional.of("Valor presente");
		
		System.out.println("Valor Optional que est� presente");
		optionalString.ifPresentOrElse(
				System.out::println, () -> System.out.println("N�o est� presente"));
		
		
		Optional<String> optionalNull = Optional.ofNullable(null);
		System.out.println("\nValor Optional que n�o est� presente");
		optionalNull.ifPresentOrElse(
				System.out::println, () -> System.out.println("[null] N�o est� presente"));
		
		Optional<String> emptyOptional = Optional.empty();
		System.out.println("\nValor Optional que est� vazio");
		emptyOptional.ifPresentOrElse(
				System.out::println, () -> System.out.println("[empty] N�o est� presente"));
		
		Optional<String> optionalNullErro = Optional.of(null);
		System.out.println("Valor Optional lan�a NullPointerException");
		optionalNullErro.ifPresentOrElse(
				System.out::println, ()-> System.out.println("[erro] N�o est� presente"));

	}

}
