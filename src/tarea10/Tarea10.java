package tarea10;

import javax.swing.JOptionPane;

public class Tarea10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = rellenar();
		
		mostrarTodo(arr);
		mostrarMax(arr);
	}

	public static int[] rellenar() {
		String dia = JOptionPane.showInputDialog("De que tamaño quieres el array:");
		int num = Integer.parseInt(dia);
		
		while (num <= 0) {
			JOptionPane.showMessageDialog(null,"Valor no vàlido");
			dia = JOptionPane.showInputDialog("De que tamaño quieres el array:");
			num = Integer.parseInt(dia);
		}
		
		String m = JOptionPane.showInputDialog("Que numero quieres que sea el de rango inferior:");
		int min = Integer.parseInt(m);
		
		String ma = JOptionPane.showInputDialog("Que numero quieres que sea el de rango superior:");
		int max = Integer.parseInt(ma);
		
		while (max <= min) {
			JOptionPane.showMessageDialog(null,"Valor no vàlido para el rango superior");
			ma = JOptionPane.showInputDialog("Que numero quieres que sea el de rango superior:");
			max = Integer.parseInt(dia);
		}
		int arr[] = new int[num];
		for (int i = 0; i<num; i++) {
			//Genero el número aleatorio
			int n = (int)(Math.random() * (max-min+1)) + min;
			
			//Compruebo si el numero es primo
			while (!comprobarPrimo(n)) {
				//si no es primo se vuelve a generar hasta que lo sea
				n = (int)(Math.random() * (max-min+1)) + min;
			}
			arr[i] = n;
		}
		return arr;
		
	}
	
	public static void mostrarMax(int arr[]) {
		int max = arr[0];
		for (int i = 0; i<arr.length; i++) {
			if (arr[i]>max) {
				max = arr[i];
			}
		}
		System.out.println("El mayor número del array es: "+ max);
	}
	
	public static void mostrarTodo(int arr[]) {
		int total = 0;
		for (int i = 0; i<arr.length; i++) {
			System.out.println("En el indice "+ i +" está el valor: "+arr[i]);
			total = total + arr[i];
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