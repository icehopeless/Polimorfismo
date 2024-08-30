package br.com.alissonrs.polimorfismo;

public class Gato extends Mamifero {
    private static int contar = 0;
    private int numeroRegistro = 0;

    public void mamar (){
        System.out.println("Xuc, Xuc");
    }

    public void correr () {

    }

    @Override
	public void emitirSom() {		
		System.out.println("Miau, Miau!");
	}

    public Gato(String novoNome) {
		nome = novoNome;
		numeroRegistro = contar++;
	}

}
