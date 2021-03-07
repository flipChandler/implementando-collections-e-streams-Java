package br.com.felipesantos.map;

import java.util.Hashtable;
import java.util.Map;

public class ExemploHashTable {

	public static void main(String[] args) {
		
		Hashtable<String, Integer> estudantes = new Hashtable<>();
		
		estudantes.put("Carlos", 21);
		estudantes.put("Mariana", 33);
		estudantes.put("Priscila", 18);
		estudantes.put("Pedro", 44);
		
		System.out.println("Mapa de Estudantes: " + estudantes);
		
		estudantes.put("Pedro", 27);
		System.out.println("Mapa de Estudantes: " + estudantes);
		
		estudantes.remove("Pedro");
		System.out.println("Mapa de Estudantes: " + estudantes);

		int idadeMariana = estudantes.get("Mariana");
		System.out.println("A idade de Mariana é : " + idadeMariana);
		
		int tamanho = estudantes.size();
		System.out.println("O tamanho do mapa de estudantes é " + tamanho);
		
		// + performatico
		System.out.println("\n-----MAP DE ENTRY-----");
		for (Map.Entry<String, Integer> entry : estudantes.entrySet()) {
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("Nome: " + key + " | Idade: " + value);
		}
		
		System.out.println("\n-----MAP DE KEYSET--------");
		for (String key : estudantes.keySet()) {
			Integer value = estudantes.get(key);
			System.out.println("Nome: " + key + " | Idade: " + value);			
		}	
		

	}

}
