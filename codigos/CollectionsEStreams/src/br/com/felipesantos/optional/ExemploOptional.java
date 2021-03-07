package br.com.felipesantos.optional;

import java.util.Optional;

public class ExemploOptional {

	public static void main(String[] args) {
		
		Optional<String> optionalString = Optional.ofNullable("Valor opcional");
		
		boolean presente = optionalString.isPresent();
		System.out.println("O valor está presente? R: " + presente);
		
		optionalString.ifPresent(System.out::println);
		
		optionalString.ifPresentOrElse(valor ->
				System.out.println(valor + "\n"), () -> System.out.println("Valor não está presente"));
		
		System.out.println();
		
		if (optionalString.isPresent()) {
			String valor = optionalString.get();
			System.out.println("Valor de Optional => " + valor );
		}
		
		optionalString.map(
				(valor) -> valor.concat("****")).ifPresent(System.out::println);
		
		optionalString.orElseThrow(IllegalStateException::new);// se estiver presente, executa, senão, lança uma exceção

	}

}
