package tarea2;

import javax.swing.JOptionPane;

public class Tarea2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int totals = pedirNum();
		int min = pedirMin();
		int max = pedirMax(min);
		
		
		for(int i = 0; i<totals;i++) {
			System.out.print(generarNumeroRango(min,max)+", ");
		}
		
	}
	

	public static int generarNumeroRango(int min, int max) {	
		int rango = max-min+1;
		return (int)(Math.random() * rango) + min;
	}

	public static int pedirNum() {
		String dia = JOptionPane.showInputDialog("Indica cuantos números aleatorios quieres generar:");
		int num = Integer.parseInt(dia);
		
		while (num <= 0) {
			JOptionPane.showMessageDialog(null,"Valor no vàlido");
			dia = JOptionPane.showInputDialog("Indica cuantos números aleatorios quieres generar:");
			num = Integer.parseInt(dia);
		}
		return num;
	}
	
	public static int pedirMin() {
		String m = JOptionPane.showInputDialog("Que numero quieres que sea el de rango inferior:");
		int min = Integer.parseInt(m);
		return min;
	}
	
	public static int pedirMax(int min) {
		String ma = JOptionPane.showInputDialog("Que numero quieres que sea el de rango superior:");
		int max = Integer.parseInt(ma);
		
		while (max <= min) {
			JOptionPane.showMessageDialog(null,"Valor no vàlido para el rango superior");
			ma = JOptionPane.showInputDialog("Que numero quieres que sea el de rango superior:");
			max = Integer.parseInt(ma);
		}
		return max;
	}
	
	

}