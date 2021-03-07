package br.com.felipesantos.map;

import java.util.HashMap;
import java.util.Map;

public class ExemploHashMap {

	public static void main(String[] args) {
		/*
		 Entrada de chave e valor
		 Permite valores repetidos, n�o permite repeti��o de chave
		 Permite adi��o, busca por chave ou valor, atualiza��o, remo��o e navega��o
		 Pode ser ordenado 
		 HashMap � a mais utilizada pela performance	 
		 
		 */
		// Map<Key, Value>
		Map<String, Integer> campeoesMundiaisFifa = new HashMap<>();
		
		campeoesMundiaisFifa.put("Brasil", 5);
		campeoesMundiaisFifa.put("Alemanha", 4);
		campeoesMundiaisFifa.put("Italia", 4);
		campeoesMundiaisFifa.put("Uruguai", 2);
		campeoesMundiaisFifa.put("Argentina", 2);
		campeoesMundiaisFifa.put("Fran�a", 2);
		campeoesMundiaisFifa.put("Inglaterra", 1);
		campeoesMundiaisFifa.put("Espanha", 1);		
		System.out.println("Mapa dos Campe�es: " + campeoesMundiaisFifa);
		
		// atualiza o valor para chave Brasil
		campeoesMundiaisFifa.put("Brasil", 6);
		System.out.println("Mapa dos Campe�es: " + campeoesMundiaisFifa);
		
		// retorna valor 2 
		int titulosArgentina = campeoesMundiaisFifa.get("Argentina");
		System.out.println("Quanto t�tulos tem a Argentina? R: " + titulosArgentina);
		
		// retorna true ou false se existe a chave Fran�a
		String eCampeao = campeoesMundiaisFifa.containsKey("Fran�a") ? "Sim" : "N�o";
		System.out.println("Fran�a � um dos campe�es mundiais? R: " + eCampeao);
		
		//remove chave Fran�a
		campeoesMundiaisFifa.remove("Fran�a"); 
		System.out.println("Mapa dos Campe�es: " + campeoesMundiaisFifa);
		
		// retorna true ou false se existe a chave Fran�a
		eCampeao = campeoesMundiaisFifa.containsKey("Fran�a") ? "Sim" : "N�o";
		System.out.println("Fran�a � um dos campe�es mundiais? R: " + eCampeao);
		
		// retorna se tem ou n�o o valor 6
		String hexaCampeao = campeoesMundiaisFifa.containsValue(6) ? "Sim" : "N�o";
		System.out.println("Existe alguma sele��o haxaCampe�? R: " + hexaCampeao);
		
		// retorna o tamanho do mapa
		int tamanho = campeoesMundiaisFifa.size();
		System.out.println("Qual � o tamanho do mapa de sele��es? R: " + tamanho);
		
		
		// navega nos registros do mapa
		// + PERFORM�TICA
		System.out.println("\n------TABELA DE SELE��ES CAMPE�S MUNDIAIS------");
		for (Map.Entry<String, Integer> entry : campeoesMundiaisFifa.entrySet()) {
			System.out.println("Sele��o: " + entry.getKey() + " | T�tulos: " + entry.getValue());
		}
		
		// - PERFORM�TICA
		System.out.println("\n------TABELA DE SELE��ES CAMPE�S MUNDIAIS------");
		for (String key : campeoesMundiaisFifa.keySet()) {
			System.out.println("Sele��o: " + key + " | T�tulos: " + campeoesMundiaisFifa.get(key));
		}
		
		campeoesMundiaisFifa.clear();
		System.out.println("\nMapa dos Campe�es: " + campeoesMundiaisFifa);
		
		
		
		
	}

}
