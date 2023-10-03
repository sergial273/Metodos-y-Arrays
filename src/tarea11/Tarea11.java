package tarea11;

import javax.swing.JOptionPane;

public class Tarea11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = metodoPedirDimensionParaEstructurarMejor();
		
		int arr1[] = rellenar(num);
		
		int arr2[] = arr1;
		
		arr2 = rellenar(num);
		int mult[] = multiplicarArr(arr1,arr2);
		
		mostrarTodo(arr1);
		mostrarTodo(arr2);
		mostrarTodo(mult);
	}

	public static int[] rellenar(int num) {
		int max = 100;
		int min = 0;
		
		int arr[] = new int[num];
		for (int i = 0; i<num; i++) {
			//Genero el número aleatorio
			int n = (int)(Math.random() * (max-min+1)) + min;
			
			arr[i] = n;
		}
		return arr;
		
	}
	
	public static void mostrarTodo(int arr[]) {
		for (int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]+", ");
		}
		System.out.println();
		
	}
	
	public static int[] multiplicarArr(int[] arr1, int[] arr2) {
		int res[] = new int[arr1.length];
		for (int i = 0; i<arr1.length; i++) {
			res[i] = arr1[i] * arr2[i];
		}
		return res;
	}
	
	public static int metodoPedirDimensionParaEstructurarMejor() {
		String dia = JOptionPane.showInputDialog("De que tamaño quieres el array:");
		int num = Integer.parseInt(dia);
		
		while (num <= 0) {
			JOptionPane.showMessageDialog(null,"Valor no vàlido");
			dia = JOptionPane.showInputDialog("De que tamaño quieres el array:");
			num = Integer.parseInt(dia);
		}
		return num;
	}

}