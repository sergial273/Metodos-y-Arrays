package tarea7;

import javax.swing.JOptionPane;

public class Tarea7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double num = pedirNum();
		
		
		conversion(num);
	}

	public static void conversion(double num) {
		JOptionPane.showMessageDialog(null,"Son "+ num*0.86 + " libras \n"+
				"Son "+ num*1.28611 + " dolares \n"+
				"Son "+ num*129.852 + " yenes \n"
				);
	}
	
	public static double pedirNum() {
		String dia = JOptionPane.showInputDialog("Que cantidad de euros quieres convertir:");
		Double num = Double.parseDouble(dia);
		
		while (num < 0) {
			JOptionPane.showMessageDialog(null,"Valor no vàlido");
			dia = JOptionPane.showInputDialog("Que cantidad de euros quieres convertir:");
			num = Double.parseDouble(dia);
		}
		return num;
	}
}
