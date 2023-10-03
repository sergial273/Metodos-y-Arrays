package tarea2;

import javax.swing.JOptionPane;

public class Tarea2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String dia = JOptionPane.showInputDialog("Indica cuantos números aleatorios quieres generar:");
		int totals = Integer.parseInt(dia);
		
		String m = JOptionPane.showInputDialog("Que numero quieres que sea el de rango inferior:");
		int min = Integer.parseInt(m);
		
		String ma = JOptionPane.showInputDialog("Que numero quieres que sea el de rango superior:");
		int max = Integer.parseInt(ma);
		
		while (max <= min) {
			JOptionPane.showMessageDialog(null,"Valor no vàlido para el rango superior");
			ma = JOptionPane.showInputDialog("Que numero quieres que sea el de rango superior:");
			max = Integer.parseInt(dia);
		}
		
		for(int i = 0; i<totals;i++) {
			System.out.print(generarNumeroRango(min,max)+", ");
		}
		
	}
	

	public static int generarNumeroRango(int min, int max) {	
		int rango = max-min+1;
		return (int)(Math.random() * rango) + min;
	}
}