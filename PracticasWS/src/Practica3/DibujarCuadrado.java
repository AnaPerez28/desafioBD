package Practica3;
import java.util.Scanner;

public class DibujarCuadrado {

	private Scanner leer;

	public void Dibujar() {

		leer = new Scanner(System.in);
		System.out.println("�De que tama�o ser� tu cuadrado?");
		int tama�o = leer.nextInt();
		System.out.println("Su cuadrado es el siguiente: ");

		for (int fila = 0; fila < tama�o; fila++) {
			for (int col = 0; col < tama�o; col++) {
				if (fila == 0 | col == 0 | col == tama�o - 1 | fila == tama�o - 1 | fila == col
						| col == (tama�o - fila) - 1) {
					System.out.print(" X");
				} else {
					System.out.print(" O");
				}
			}
			System.out.print("\n");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DibujarCuadrado c = new DibujarCuadrado();
		c.Dibujar();
	}

}
