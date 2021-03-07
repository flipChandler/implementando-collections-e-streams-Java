package br.com.felipesantos.map;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class ExemploTreeMap {

	public static void main(String[] args) {
		/*
		 garante a ordenação por chave
		 */
		TreeMap<String, String> treeCapitais = new TreeMap<>();
		
		treeCapitais.put("RS", "Porto Alegre");
		treeCapitais.put("SC", "Santa Catarina");
		treeCapitais.put("PR", "Curitiba");
		treeCapitais.put("SP", "São Paulo");
		treeCapitais.put("RJ", "Rio de Janeiro");
		treeCapitais.put("MG", "Belo Horizonte");
		
		System.out.println("Arvore de capitais: " + treeCapitais);
		
		System.out.println("Primeira capital pela chave: " + treeCapitais.firstKey()); // MG
		
		System.out.println("Última capital pela chave: " + treeCapitais.lastKey());// SP
		
		System.out.println("Chave onde SC está abaixo dela: " + treeCapitais.lowerKey("SC")); // RS
		
		System.out.println("Chave onde SC está acima dela: " + treeCapitais.higherKey("SC")); // SP
		
		String uf1 = treeCapitais.firstEntry().getKey(); // MG
		String cidade1 = treeCapitais.firstEntry().getValue(); // Belo Horizonte		
		System.out.println("Primeira entrada -> UF: " + uf1 + " | Cidade: " + cidade1);
		
		String uf2 = treeCapitais.lastEntry().getKey(); // SP
		String cidade2 = treeCapitais.lastEntry().getValue(); // São Paulo
		System.out.println("Última entrada -> UF: " + uf2 + " | Cidade: " + cidade2);
		
		String uf3 = treeCapitais.lowerEntry("SC").getKey();
		String cidade3 = treeCapitais.lowerEntry("SC").getValue();
		System.out.println("Entrada acima de SC -> UF: " + uf3 + " | Cidade: " + cidade3);
		
		String uf4 = treeCapitais.higherEntry("SC").getKey();
		String cidade4 = treeCapitais.higherEntry("SC").getValue();
		System.out.println("Entrada abaixo de SC -> UF: " + uf4 + " | Cidade: " + cidade4);
		
		// retorna e remove o topo da arvore 
		Map.Entry<String, String> firstEntry = treeCapitais.pollFirstEntry();
		String uf5 = firstEntry.getKey();
		String cidade5 = firstEntry.getValue();
		System.out.println("Primeira entrada -> UF: " + uf5 + " | Cidade: " + cidade5);
		
		// retorna e remove o último da arvore
		Map.Entry<String, String> lastEntry = treeCapitais.pollLastEntry();
		String uf6 = lastEntry.getKey();
		String cidade6 = lastEntry.getValue();
		System.out.println("Última entrada -> UF: " + uf6 + " | Cidade: " + cidade6);
		
		System.out.println("Arvore de capitais: " + treeCapitais);
		
		Iterator<String> iterator = treeCapitais.keySet().iterator();
		
		System.out.println("\n------ARVORE ITERATOR------");
		while(iterator.hasNext()) {
			String key = iterator.next();
			String value = treeCapitais.get(key);
			System.out.println("UF: " + key + " | Cidade: " + value);
		}
		
		System.out.println("\n-----ARVORE FOREACH-------");
		for (String key : treeCapitais.keySet()) {
			String value = treeCapitais.get(key);
			System.out.println("UF: " + key + " | Cidade: " + value);
		}
		
		System.out.println("\n--------ARVORE ENTRY-----------");
		for (Map.Entry<String, String> entry : treeCapitais.entrySet()) {
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println("UF: " + key + " | Cidade: " + value);
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
