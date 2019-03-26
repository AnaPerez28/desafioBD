package WSApplause;

public class desafio6 {

	public static void main(String[] args) {

		int n = 8;

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n; j++) {

				if ((j == 0 || i == 0) || (j == (n - 1) || i == (n - 1)) || j == i || (i + j) == (n - 1)) {

					System.out.print("X");
				} else {

					System.out.print("O");
				}
			}
			System.out.println();
		}

	}

}