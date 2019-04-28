package br.souza.agendaMap;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		Agenda agenda = new Agenda();
		
		Scanner input = new Scanner(System.in);
		String nome = "", telefone = "", descricao = "", continuacao = "Deseja continuar na Agenda? \n(1) - Continuar, (2) - Sair";
		int continuar = 0;
		
		JOptionPane.showMessageDialog(null, "Bem-vindo a sua Agenda eletrônica!");
		
		do {
			int decisao = Integer.parseInt(JOptionPane.showInputDialog("Qual operação deseja realizar? "
					+ "\n(1) - Adicionar Contatos, (2) - Buscar Contatos, (3) - Remover Contatos, (4) - Abrir Agenda, (5) - Sair: "));
			
			
			
			switch(decisao){
				case 1:
					JOptionPane.showMessageDialog(null, "Você está na área de Adicionar Contatos!");
					nome = JOptionPane.showInputDialog("Informe o nome do Contato: ");
					telefone = JOptionPane.showInputDialog("Informe o número do Contato: ");
					descricao = JOptionPane.showInputDialog("Informe a descrição do Contato: ");
					
					agenda.addContatos(nome, telefone, descricao);
					
					continuar = Integer.parseInt(JOptionPane.showInputDialog(continuacao));
					break;
					
				case 2:
					JOptionPane.showMessageDialog(null, "Você está na área de Busca de Contatos!");
					nome = JOptionPane.showInputDialog("Informe o nome do Contato que deseja buscar: ");
					JOptionPane.showMessageDialog(null,agenda.buscarContatos(nome));
					
					continuar = Integer.parseInt(JOptionPane.showInputDialog(continuacao));
					break;
					
				case 3:
					JOptionPane.showMessageDialog(null, "Você está na área de Remoção Contatos!");
					nome = JOptionPane.showInputDialog("Informe o nome do Contato que deseja remover: ");
					
					agenda.removerContatos(nome);
					
					continuar = Integer.parseInt(JOptionPane.showInputDialog(continuacao));
					break;
					
				case 4:
					JOptionPane.showMessageDialog(null, "Esta é a sua agenda!");
					JOptionPane.showMessageDialog(null,agenda);
					continuar = Integer.parseInt(JOptionPane.showInputDialog(continuacao));
					break;
					
				case 5:
					JOptionPane.showMessageDialog(null, "Saindo!");
					break;
			}
		}while(continuar == 1);
		
		input.close();
		}
}



