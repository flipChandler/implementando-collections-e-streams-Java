package br.com.felipesantos.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class ExemploLinkedList {

	public static void main(String[] args) {
		/*
		 Primeiro que entra, primeiro que sai
		 Garante a ordem de inser��o
		 N�o permite mudan�a de ordena��o, s� adiciona ou remove elementos
		 N�o pode remover elementos do meio da fila. 
		 
		 Serve para: caixa de entrada de emails, controle de estoque, controle de transi��es banc�rias,
		filas de compras em e-commerce, etc.
		 */
		
		Queue<String> filaBanco = new LinkedList<>();
		
		filaBanco.add("Jon Jones"); // prioridade para sair
		filaBanco.add("Margot Robbie");
		filaBanco.add("Harry Kane");
		filaBanco.add("Eva Mendes");
		filaBanco.add("Sandra Bullock");
		filaBanco.add("Rachel Weiz");
		filaBanco.add("Carol Castro");
		filaBanco.add("Paolla de Oliveira");
		filaBanco.add("Brad Pitt");
		filaBanco.add("Bruce Willis");
		
		System.out.println(filaBanco + "\n");
		
		// poll() -> remove e retorna o primeiro elemento da fila
		String clienteASerAtendido = filaBanco.poll();
		System.out.println("Cliente a ser atendido: " + clienteASerAtendido + "\n");		
		System.out.println(filaBanco + "\n");
		
		// peek() -> apenas retorna o primeiro elemento da fila
		String primeiroCliente = filaBanco.peek();
		System.out.println("Primeiro cliente: " + primeiroCliente + "\n");
		System.out.println(filaBanco + "\n");
		
		//filaBanco.clear();
		
		// retorna o primeiro elemento ou um erro ser� lan�ado se estiver vazia
		try {			
			String primeiroClienteOuErro = filaBanco.element();
			System.out.println("Primeiro cliente ou erro: " + primeiroClienteOuErro);
		} catch (NoSuchElementException e) {
			System.out.println("A fila est� vazia! " + e.getMessage());
		}
		
		int seq = 1;
		for (String cliente : filaBanco) {
			System.out.println(seq + "� cliente: " + cliente);
			seq++;
		}
		
		//Iterator
		Iterator<String> iterator = filaBanco.iterator();
		
		int ord = 1;
		System.out.print("\n----Cliente Iterator----");
		while (iterator.hasNext()) {
			System.out.print("\n" + ord + "� cliente: " + iterator.next());
			ord++;
		}
		
		int tamanho = filaBanco.size();
		System.out.println("\n\nTamanho da fila: " + tamanho);	
		

	}

}
