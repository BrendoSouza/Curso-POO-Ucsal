package br.souza.agendaMap;

import java.util.ArrayList;

public class Contato {
	//Atributos
	private String nome, descricao;
	private ArrayList<String> telefones = new ArrayList<String>();
	
	//Construtor
	public Contato(String nome, String telefone) {
		this(nome, telefone, "");
	}
	public Contato(String nome, String telefone, String descricao) {
		this.setNome(nome);
		this.telefones.add(telefone);
		this.setDescricao(descricao);
	}
	
	//Getters e Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<String>getTelefones() {
		return telefones;
	}
	
	public void addTelefone(String telefone) {
		telefones.add(telefone);
	}
	
	public String getDescricao() {
		return this.descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Contato other = (Contato) obj;
		if (nome == null) {
			if (other.nome != null) {
				return false;
			}
		} else if (!nome.equals(other.nome)) {
			return false;
		}
		if (descricao == null) {
			if (other.descricao != null) {
				return false;
			}
		} else if (!descricao.equals(other.descricao)) {
			return false;
		}
		
		if (telefones == null) {
			if (other.telefones != null) {
				return false;
			}
		} else if (!telefones.equals(other.telefones)) {
			return false;
		}
		return true;
	}
	
	//toString
	@Override
	public String toString() {
		return " telefone - " +telefones+ " / descricao - " +descricao+ "\n";
	}

	
	

}
