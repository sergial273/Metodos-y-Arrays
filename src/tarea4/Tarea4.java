package tarea4;

import javax.swing.JOptionPane;

public class Tarea4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = pedirNum();
		
		JOptionPane.showMessageDialog(null,"El factorial de " + num + " es "+ calcFactorial(num) );
	}

	public static int calcFactorial(int num) {
		int total = 1;
		for (int i = num; i>1;i--) {
			total = total*i;
		}
				
		return total;
	}
	
	public static int pedirNum() {

		String dia = JOptionPane.showInputDialog("De que número quieres calcular el fatorial:");
		int num = Integer.parseInt(dia);
		
		while (num < 0) {
			JOptionPane.showMessageDialog(null,"Valor no vàlido");
			dia = JOptionPane.showInputDialog("De que número quieres calcular el fatorial:");
			num = Integer.parseInt(dia);
		}
		
		return num;
	}
}
