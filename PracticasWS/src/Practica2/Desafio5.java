package Practica2;

//Crear un clico que imprima los primeros 10 numeros de la serie de fibonacci
// La sucesi�n de fibonacci se realiza sumando siempre los �ltimos 2 n�meros

public class Desafio5 {

	public int seriefibonacci(int tama�o) {
		int serie = 0, numero1 = 0, numero2 = 1;

		for (int i = 0; i < tama�o; i++) {
			serie = numero1;
			numero1 = numero2;
			numero2 = serie + numero2;
			System.out.println(serie);
		}
		return serie;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Desafio5 f = new Desafio5();
		f.seriefibonacci(10);
	}

}
