package br.com.felipesantos.map;

import java.util.HashMap;
import java.util.Map;

public class ExercicioHashMap {

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>();
		map.put("AM", "Manaus");
		map.put("SP", "São Paulo");
		map.put("GO", "Goiania");
		map.put("ES", "Vitoria");
		map.put("SC", "Florianopolis");
		map.put("BA", "Salvador");
		map.put("PE", "Recife");
		map.put("RN", "Natal");
		map.put("CE", "Fortaleza");
		map.put("MG", "Belo Horizonte");
		map.put("MS", "Campo Grande");
		
		System.out.println("Mapa do estados-capitais: " + map + "\n");
		
		map.remove("MG");
		
		for (Map.Entry<String, String> entry : map.entrySet()) {
			String uf = entry.getKey();
			String capital = entry.getValue();
			System.out.println("UF: " + uf + " | Capital: " + capital);
		}
		
		int tamanho = map.size();
		System.out.println("\nO tamanho do mapa é : " + tamanho);
		
		String constaSC = map.containsKey("SC") ? "Sim" : "Não";
		System.out.println("\nO estado SC consta no mapa? R: " + constaSC);
		
		
		
	}

}
