package br.souza.agendaMap;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Principal {
	public static void main(String[] args) {
		Agenda agenda = new Agenda();
		agendaEletronica(agenda);
	}
	public static void agendaEletronica(Agenda agenda) {
		JTextField nomeField = new JTextField(10);
        JTextField telefoneField = new JTextField(5);
        JTextField descricaoField =new JTextField();

		Object[]  addContato = {
                "Nome:",nomeField,
                "Telefone:",telefoneField,
                "Descrição:", descricaoField,
        };
		Object[]  buscarContato = {
                "Nome:",nomeField, 
        };
		
		JOptionPane.showMessageDialog(null, "Bem-vindo a sua Agenda eletrônica!", "Agenda Eletrônica", JOptionPane.PLAIN_MESSAGE);

		String msgContinua = "Deseja continuar na agenda?";
		int continuar = -1, resultado = 2;
		
		do {
			int decisao = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual operação deseja realizar? "
					+ "\n(1) - Adicionar Contatos\n(2) - Buscar Contatos"
					+ "\n(3) - Remover Contatos\n(4) - Abrir Agenda\n(5) - Sair: ", "Opções", JOptionPane.QUESTION_MESSAGE));
			
			switch(decisao){
				case 1:
					JOptionPane.showMessageDialog(null, "Você está na área de Adicionar Contatos!", "Adicionar Contato", JOptionPane.PLAIN_MESSAGE);
					
					resultado = JOptionPane.showConfirmDialog(null, addContato,
			                "Adicionar contato", JOptionPane.OK_CANCEL_OPTION);
					saida(resultado);
					 
					agenda.addContatos(nomeField.getText(), telefoneField.getText(), descricaoField.getText());
					nomeField.setText("");
					telefoneField.setText("");
					descricaoField.setText("");

					continuar = JOptionPane.showConfirmDialog(null,msgContinua);
					break;
					
				case 2:
					JOptionPane.showMessageDialog(null, "Você está na área de Busca de Contatos!", "Busca de Contatos", JOptionPane.INFORMATION_MESSAGE);
					resultado = JOptionPane.showConfirmDialog(null, buscarContato,
			                "Busca de Contato", JOptionPane.OK_CANCEL_OPTION);
					saida(resultado);
					JOptionPane.showMessageDialog(null,agenda.buscarContatos(nomeField.getText()));

					continuar = JOptionPane.showConfirmDialog(null,msgContinua);
					break;
				case 3:
					JOptionPane.showMessageDialog(null, "Você está na área de Remoção Contatos!");
					resultado = JOptionPane.showConfirmDialog(null, buscarContato,
	                "Busca de Contato", JOptionPane.OK_CANCEL_OPTION);
					saida(resultado);
					
					agenda.removerContatos(nomeField.getText());
					
					continuar = JOptionPane.showConfirmDialog(null,msgContinua);
					break;
					
				case 4:
					JOptionPane.showMessageDialog(null, "Esta é a sua agenda!");
					JOptionPane.showMessageDialog(null,agenda);
					continuar = JOptionPane.showConfirmDialog(null,msgContinua);
					break;
					
				case 5:
					JOptionPane.showMessageDialog(null, "Saindo!");
					break;
			}
		}while(continuar == 0);
		
	}
	public static void saida(int resultado) {
		if (resultado == JOptionPane.CANCEL_OPTION) {
            System.exit(0);
        }
	}
}



