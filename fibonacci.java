package WSApplause;

public class fibonacci {

	public static void main(String[] args) {
		int a = 1;
		int b = 1;

		System.out.println(b + "\n" + a);
		for (int i = 0; i <= 10; i++) {

			b = b + a;
			a = b - a;
			System.out.println(b);

		}
	}
}
