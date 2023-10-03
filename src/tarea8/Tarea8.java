package tarea8;

import javax.swing.JOptionPane;

public class Tarea8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = rellenar();
		
		leer(arr);
	}

	public static int[] rellenar() {
		int arr[] = new int[10];
		for (int i = 0; i<10; i++) {
			String dia = JOptionPane.showInputDialog("Que valor quieres introducir en el array:");
			int num = Integer.parseInt(dia);
			arr[i] = num;
		}
		return arr;
		
	}
	
	public static void leer(int arr[]) {
		for (int i = 0; i<10; i++) {
			System.out.println("En el indice "+ i +" está el valor: "+arr[i]);
		}
	}
}
