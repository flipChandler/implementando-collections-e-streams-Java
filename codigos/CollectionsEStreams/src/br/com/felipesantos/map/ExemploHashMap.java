package br.com.felipesantos.map;

import java.util.HashMap;
import java.util.Map;

public class ExemploHashMap {

	public static void main(String[] args) {
		/*
		 Entrada de chave e valor
		 Permite valores repetidos, não permite repetição de chave
		 Permite adição, busca por chave ou valor, atualização, remoção e navegação
		 Pode ser ordenado 
		 HashMap é a mais utilizada pela performance	 
		 
		 */
		// Map<Key, Value>
		Map<String, Integer> campeoesMundiaisFifa = new HashMap<>();
		
		campeoesMundiaisFifa.put("Brasil", 5);
		campeoesMundiaisFifa.put("Alemanha", 4);
		campeoesMundiaisFifa.put("Italia", 4);
		campeoesMundiaisFifa.put("Uruguai", 2);
		campeoesMundiaisFifa.put("Argentina", 2);
		campeoesMundiaisFifa.put("França", 2);
		campeoesMundiaisFifa.put("Inglaterra", 1);
		campeoesMundiaisFifa.put("Espanha", 1);		
		System.out.println("Mapa dos Campeões: " + campeoesMundiaisFifa);
		
		// atualiza o valor para chave Brasil
		campeoesMundiaisFifa.put("Brasil", 6);
		System.out.println("Mapa dos Campeões: " + campeoesMundiaisFifa);
		
		// retorna valor 2 
		int titulosArgentina = campeoesMundiaisFifa.get("Argentina");
		System.out.println("Quanto títulos tem a Argentina? R: " + titulosArgentina);
		
		// retorna true ou false se existe a chave França
		String eCampeao = campeoesMundiaisFifa.containsKey("França") ? "Sim" : "Não";
		System.out.println("França é um dos campeões mundiais? R: " + eCampeao);
		
		//remove chave França
		campeoesMundiaisFifa.remove("França"); 
		System.out.println("Mapa dos Campeões: " + campeoesMundiaisFifa);
		
		// retorna true ou false se existe a chave França
		eCampeao = campeoesMundiaisFifa.containsKey("França") ? "Sim" : "Não";
		System.out.println("França é um dos campeões mundiais? R: " + eCampeao);
		
		// retorna se tem ou não o valor 6
		String hexaCampeao = campeoesMundiaisFifa.containsValue(6) ? "Sim" : "Não";
		System.out.println("Existe alguma seleção haxaCampeã? R: " + hexaCampeao);
		
		// retorna o tamanho do mapa
		int tamanho = campeoesMundiaisFifa.size();
		System.out.println("Qual é o tamanho do mapa de seleções? R: " + tamanho);
		
		
		// navega nos registros do mapa
		// + PERFORMÁTICA
		System.out.println("\n------TABELA DE SELEÇÕES CAMPEÃS MUNDIAIS------");
		for (Map.Entry<String, Integer> entry : campeoesMundiaisFifa.entrySet()) {
			System.out.println("Seleção: " + entry.getKey() + " | Títulos: " + entry.getValue());
		}
		
		// - PERFORMÁTICA
		System.out.println("\n------TABELA DE SELEÇÕES CAMPEÃS MUNDIAIS------");
		for (String key : campeoesMundiaisFifa.keySet()) {
			System.out.println("Seleção: " + key + " | Títulos: " + campeoesMundiaisFifa.get(key));
		}
		
		campeoesMundiaisFifa.clear();
		System.out.println("\nMapa dos Campeões: " + campeoesMundiaisFifa);
		
		
		
		
	}

}
