package tarea9;

import javax.swing.JOptionPane;

public class Tarea9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = rellenar(0,9);
		
		leerContYSuma(arr);
	}

	public static int[] rellenar(int min, int max) {
		String dia = JOptionPane.showInputDialog("De que tamaño quieres el array:");
		int num = Integer.parseInt(dia);
		
		while (num <= 0) {
			JOptionPane.showMessageDialog(null,"Valor no vàlido");
			dia = JOptionPane.showInputDialog("De que tamaño quieres el array:");
			num = Integer.parseInt(dia);
		}
		
		int arr[] = new int[num];
		for (int i = 0; i<num; i++) {
			int n = (int)(Math.random() * (max-min+1)) + min;
			arr[i] = n;
		}
		return arr;
		
	}
	
	public static void leerContYSuma(int arr[]) {
		int total = 0;
		for (int i = 0; i<arr.length; i++) {
			System.out.println("En el indice "+ i +" está el valor: "+arr[i]);
			total = total + arr[i];
		}
		System.out.println("La suma de los valores del array es: "+ total);
		
	}
}