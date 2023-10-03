package tarea6;

import javax.swing.JOptionPane;

public class Tarea6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String dia = JOptionPane.showInputDialog("De que número quieres contar cifras:");
		int num = Integer.parseInt(dia);
		
		while (num < 0) {
			JOptionPane.showMessageDialog(null,"Valor no vàlido");
			dia = JOptionPane.showInputDialog("De que número quieres contar cifras:");
			num = Integer.parseInt(dia);
		}
		
		
		JOptionPane.showMessageDialog(null,"El número " + num + " tiene "+ calcCifras(num) + " cifras" );
	}

	public static int calcCifras(int num) {
		return String.valueOf(num).length();
	}
}