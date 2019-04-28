package br.souza.agendaMap;

import java.util.Map;
import java.util.TreeMap;

import javax.swing.JOptionPane;

public class Agenda {
	//Atributos
	private Map<String, Contato> agenda;
	
	//Construtor
	public Agenda() {
		agenda = new TreeMap<>();
	}
	
	//Métodos personalizados
	public void addContatos(Contato contato) {
		this.agenda.put(contato.getNome(), contato);
	}
	public void addContatos(String nome, String telefone, String descricao) {
		Contato naAgenda = this.buscarContatos(nome);
		if(naAgenda != null) {
			naAgenda.addTelefone(telefone);
			naAgenda.setDescricao(descricao);
		}
		else {
			this.addContatos(new Contato(nome, telefone, descricao));
		}
	}
	public void addContatos(String nome, Contato contato) {
		Contato naAgenda = this.buscarContatos(nome);
		if(naAgenda != null) {
			naAgenda.addTelefone(contato.getTelefones().get(0));
		}
		else {
			this.agenda.put(nome, contato);
		}
	}
	
	
	public Contato buscarContatos(String nome) {
		if(!agenda.containsKey(nome)) {
			return null;
		}
		return agenda.get(nome);
	}
	
	public void removerContatos(String nome) {
		if(!(this.buscarContatos(nome) == null)) {
			agenda.remove(nome);
			JOptionPane.showMessageDialog(null, "Contato removido com sucesso!");
		}else {
			JOptionPane.showMessageDialog(null, "Este contato não existe ou ja foi removido!");
		}
		
	}
	
	//toString
	@Override
	public String toString() {
		return "Contatos: \n" +agenda;
	}
	
	//getters e setters
	public Map<String, Contato> getAgenda() {
		return agenda;
	}
	public void setAgenda(Map<String, Contato> agenda) {
		this.agenda = agenda;
	}
	
	
	
}
