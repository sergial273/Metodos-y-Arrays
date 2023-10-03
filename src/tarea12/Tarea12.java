package tarea12;

import javax.swing.JOptionPane;

public class Tarea12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dia = JOptionPane.showInputDialog("De que tamaño quieres el array:");
		int num = Integer.parseInt(dia);
		
		while (num <= 0) {
			JOptionPane.showMessageDialog(null,"Valor no vàlido");
			dia = JOptionPane.showInputDialog("De que tamaño quieres el array:");
			num = Integer.parseInt(dia);
		}
		
		int arr[] = rellenar(num);
		
		int res[] = acabadoEn(arr);
		mostrarTodo(arr);
		mostrarTodo(res);
	}

	public static int[] rellenar(int num) {
		
		int arr[] = new int[num];
		int max = 300;
		int min = 1;
		for (int i = 0; i<num; i++) {
			int n = (int)(Math.random() * (max-min+1)) + min;
			arr[i] = n;
		}
		return arr;
		
	}
	
	public static int[] acabadoEn(int[] arr) {
		String dia = JOptionPane.showInputDialog("En que digito quieres que acaben los números a buscar:");
		int fin = Integer.parseInt(dia);
		
		while (fin < 0) {
			JOptionPane.showMessageDialog(null,"Valor no vàlido");
			dia = JOptionPane.showInputDialog("En que digito quieres que acaben los números a buscar:");
			fin = Integer.parseInt(dia);
		}
		
		int total = 0;
		for (int i = 0; i<arr.length; i++) {
			if (arr[i]%10 == fin) {
				total++;
			}
		}
		int res[] = new int[total];
		int o = 0;
		for (int i = 0; i<arr.length; i++) {
			if (arr[i]%10 == fin) {
				res[o] = arr[i];
				o++;
			}
		}
		return res;
		
	}
	public static void mostrarTodo(int arr[]) {
		for (int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]+", ");
		}
		System.out.println();
		
	}

}