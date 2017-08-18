package br.estudo.model;

import javax.persistence.Entity;

@Entity
public class Cliente extends AbstractEntity {

	private String nome;

	public Cliente() {

	}

	public Cliente(String nome) {

		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
