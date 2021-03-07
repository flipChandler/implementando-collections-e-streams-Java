package br.com.felipesantos.set;

import java.util.Set;
import java.util.TreeSet;

public class ExemploTreeSet {

	public static void main(String[] args) {
		/*
			 Utilizar: quando � necess�rio alterar a ordem com o uso de comparators
			 Ordena��o: mant�m a ordem e pode ser ordenado
			 Performance: � perform�tico para leitura. Para modifica��o tem a necessidade
			 de reordenar, sendo mais lento que o LinkedHashSet			 
		 */
		
		TreeSet<String> treeCapitais = new TreeSet<>();
		
		treeCapitais.add("Porto Alegre");
		treeCapitais.add("Florianopolis");
		treeCapitais.add("Curitiba");
		treeCapitais.add("S�o Paulo");
		treeCapitais.add("Rio de Janeiro");
		treeCapitais.add("Belo Horizonte");
		
		System.out.println("Capitais: " + treeCapitais);
		
		// retorna a primeira capital no topo da tree
		System.out.println(treeCapitais.first()); // Belo Horizonte
		
		// retorna a �ltima capital no fim da tree
		System.out.println(treeCapitais.last()); // S�o Paulo
		
		// retorna a primeira capital acima na �rvore da capital parametrizada
		System.out.println("lower: " + treeCapitais.lower("Florianopolis")); // Curitiba
		
		// retorna a primeira capital abaixo na �rvore da capital parametrizada
		System.out.println("higher: " + treeCapitais.higher("Florianopolis")); // Porto Alegre
		
		// retorna a primeira capital no topo da tree, removendo-a do set
		System.out.println("pollFirst:" + treeCapitais.pollFirst());// Belo Horizonte
		
		// retorna a ultima capital no topo da tree, removendo-a do set
		System.out.println("pollLast: " + treeCapitais.pollLast()); // S�o Paulo
		
		

	}

}
