package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {

		Gato gato = new Gato();
		Livros livros = new Livros();

		System.out.println(gato);
		System.out.println(livros);

	}

}

class Livros {
	private String nome;
	private String npag;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNpag() {
		return npag;
	}

	public void setNpag(String npag) {
		this.npag = npag;
	}

}