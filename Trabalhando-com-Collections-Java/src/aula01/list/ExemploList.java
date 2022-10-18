package aula01.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ExemploList {

	public static void main(String[] args) {

		List<Double> notas = new ArrayList<Double>();
		notas.add(7.0);
		notas.add(5.0);
		notas.add(6.0);
		notas.add(7.5);
		notas.add(4.0);
		notas.add(3.0);
		notas.add(1.0);
		notas.add(2.0);

		System.out.println(notas.toString());

		System.out.println("Exiba a posi��o da nota 6.0  : " + notas.indexOf(6d));

		System.out.println("Adicione na lista a nota 8.0 na posi��o 4: ");
		notas.add(4, 8d);
		System.out.println(notas.indexOf(8d));

		System.out.println("Substitua a nota 5.0 pela nota 3.0: ");
		notas.set(notas.indexOf(5d), 3d);
		System.out.println(notas.toString());

		System.out.println("Confira se a nota 5.0 est� na lista: ");
		System.out.println(notas.contains(5d));

		// System.out.println("Exiba todas as notas na ordem que foram informadas: ");
		// for(Double nota : notas) System.out.println(nota);

		System.out.println("Exiba a terceira nota adicionada: " + notas.get(3));
		System.out.println(notas.toString());

		System.out.println("Exiba a menor nota: " + Collections.min(notas));

		System.out.println("Exiba a menor nota: " + Collections.max(notas));

		Iterator<Double> iterator = notas.iterator();
		Double soma = 0d;
		while (iterator.hasNext()) {
			Double next = iterator.next();
			soma += next;
		}
		System.out.println("Exiba a soma dos valores: " + soma);

		System.out.println("Exiba a media das notas: " + (soma / notas.size()));

		System.out.println("Remove a nota 0: ");
		notas.remove(0d);

		System.out.println("Remova as notas menores que 7 exiba a lista: ");

		Iterator<Double> interator1 = notas.iterator();
		while (iterator.hasNext()) {
			Double next = interator1.next();
			if (next < 7) {
				iterator.remove();
			}
		}

		System.out.println(notas.toString());

		//System.out.println("Apague toda a lista");
		//notas.clear();
		//System.out.println(notas.toString());

		System.out.println("Confira se a lista est� vazia: " + notas.isEmpty());

		LinkedList<Double> notas2 = new LinkedList<Double>();
		notas2.addAll(notas);
		
		System.out.println("Lista de notas2 recebendo lista de notas: ");
		System.out.println(notas2.toString());
		
		System.out.println("Mostre a primeira nota da nova lista sem remov�-lo: ");
		System.out.println(notas2.getFirst());
		System.out.println(notas2.toString());
		
		System.out.println("Mostre a primeira nota da nova lista sem removendo-o: ");
		System.out.println(notas2.removeFirst());
		

	}

}
