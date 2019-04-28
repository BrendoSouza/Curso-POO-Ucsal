package br.souza.colecaoSet;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class ColecaoSet {

	public static void main(String[] args) {
		
		
		Set<Integer> conjunto1 = new TreeSet<>(Arrays.asList(0, 2, 4, 6, 8, 10));
		Set<Integer> conjunto2 = new TreeSet<>(Arrays.asList(0, 8, 15, 4, 3, 1));
		
		//União
		Set<Integer> teste1 = new TreeSet<>(conjunto1);
		teste1.addAll(conjunto2);
		System.out.println(teste1);
		
		//Interseção
		Set<Integer> teste2 = new TreeSet<>(conjunto1);
		teste2.retainAll(conjunto2);
		System.out.println(teste2);
		
		//Diferença
		Set<Integer> teste3 = new TreeSet<>(conjunto1);
		teste3.removeAll(conjunto2);
		System.out.println(teste3);
		
	}

}
