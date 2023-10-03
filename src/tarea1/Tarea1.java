package tarea1;

import javax.swing.JOptionPane;

public class Tarea1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String dia = JOptionPane.showInputDialog("Indica de que figura quieres calcular el área:");
		String dial = dia.toLowerCase();
		switch (dial) {
		case "circulo":
			double r = pedirCirculo();
			JOptionPane.showMessageDialog(null, "El area de " + dia + " es: " + areaCirculo(r));
			break;

		case "triangulo":
			r = pedirTriangulo1();
			double h = pedirTriangulo2();
			JOptionPane.showMessageDialog(null, "El area de " + dia + " es: " + areaTriangulo(r, h));
			break;

		case "cuadrado":
			r = pedirCuadrado();
			JOptionPane.showMessageDialog(null, "El area de " + dia + " es: " + areaCuadrado(r));
			break;
		default:
			JOptionPane.showMessageDialog(null, "Error! " + dia + ": No es una figura válida");
			break;
		}
	}

	public static double areaCirculo(double r) {
		return Math.PI * Math.pow(r, 2);
	}

	public static double areaTriangulo(double b, double h) {
		return (b * h) / 2;
	}

	public static double areaCuadrado(double l) {
		return l * l;
	}

	public static double pedirCirculo() {
		double r = -1;
		while (r < 0) {
			String rad = JOptionPane.showInputDialog("Cual es el radio de la figura:");
			r = Double.parseDouble(rad);
			if (r < 0) {
				JOptionPane.showMessageDialog(null, "Valor no vàlido para el radio");
			}
		}
		return r;
	}

	public static double pedirTriangulo1() {
		double r = -1;
		while (r < 0) {
			String rad = JOptionPane.showInputDialog("Cual es la base de la figura:");
			r = Double.parseDouble(rad);
			if (r < 0) {
				JOptionPane.showMessageDialog(null, "Valor no vàlido para la base");
			}
		}
		return r;
	}

	public static double pedirTriangulo2() {
		double h = -1;
		while (h < 0) {
			String rad = JOptionPane.showInputDialog("Cual es la altura de la figura:");
			h = Double.parseDouble(rad);
			if (h < 0) {
				JOptionPane.showMessageDialog(null, "Valor no vàlido para la altura");
			}
		}
		return h;
	}
	
	public static double pedirCuadrado() {
		double r = -1;
		while (r < 0) {
			String rad = JOptionPane.showInputDialog("Cual es el lado de la figura:");
			r = Double.parseDouble(rad);
			if (r < 0) {
				JOptionPane.showMessageDialog(null, "Valor no vàlido para el lado");
			}
		}
		return r;
	}
}