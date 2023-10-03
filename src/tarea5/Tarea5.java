package tarea5;

import javax.swing.JOptionPane;

public class Tarea5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String dia = JOptionPane.showInputDialog("De que número quieres convertir a binario:");
		int num = Integer.parseInt(dia);
		
		while (num < 0) {
			JOptionPane.showMessageDialog(null,"Valor no vàlido");
			dia = JOptionPane.showInputDialog("De que número quieres convertir a binario:");
			num = Integer.parseInt(dia);
		}
		
		
		JOptionPane.showMessageDialog(null,"El binario de " + num + " es "+ calcBinario(num) );
	}

	public static String calcBinario(int num) {
		return Integer.toBinaryString(num);
	}
}
