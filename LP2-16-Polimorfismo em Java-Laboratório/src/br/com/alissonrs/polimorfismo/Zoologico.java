package br.com.alissonrs.polimorfismo;

import java.util.ArrayList;


public class Zoologico {
	public ArrayList<Mamifero> lista = new ArrayList<>();

	public static void main(String[] args) {
		//Mamifero mama;  A classe mamifero se tornou abstrata, logo nao sera possivel instanciar
		Cachorro cachorro;
		Vaca vaca;
		Gato gato;

		//mama = new Mamifero();
		cachorro = new Cachorro("Snoopy");
		vaca = new Vaca();
		gato = new Gato("Garfield");

		Zoologico zoo = new Zoologico();
		//zoo.lista.add(mama);
		zoo.lista.add(cachorro);
		zoo.lista.add(vaca);
		zoo.lista.add(gato);


		//mama.mamar();
		/*cachorro.mamar();
		vaca.mamar();
		gato.mamar();*/

		//mama.emitirSom();
		cachorro.emitirSom();
		vaca.emitirSom();
		gato.emitirSom();

		System.out.println("\nemitirSom pelo loop");
		for (Mamifero a : zoo.lista) {
			a.emitirSom();
		}
	}
}