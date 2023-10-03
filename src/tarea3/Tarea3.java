package tarea3;

import javax.swing.JOptionPane;

public class Tarea3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String dia = JOptionPane.showInputDialog("Que número quieres comprobar:");
		int num = Integer.parseInt(dia);
		
		if(comprobarPrimo(num)) {
			JOptionPane.showMessageDialog(null,"El número es primo");
		}
		else {
			JOptionPane.showMessageDialog(null,"El número no es primo");
		}
	}

	public static boolean comprobarPrimo(int num) {
		boolean primo = true;

		if (num <= 1) {
			primo = false;
			return primo;
			
		} else {
			for (int i = 2; i <= num / 2; i++) {
				if ((num % i) == 0) {
					primo = false;

					break;
				}
			}

			return primo;
		}
	}
}