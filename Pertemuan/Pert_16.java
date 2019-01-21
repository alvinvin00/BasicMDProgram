package testpack;

public class Pert_16 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Soal 2A");
		for (int i = 1; i <= 8; i++) {
			for (int j = 1; j <= 8; j++) {
				System.out.print(j + " ");
			}
			System.out.println("");
		}
		System.out.println("Soal 2B");
		for (int i = 1; i <= 8; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println("");
		}
		System.out.println("Soal 3");
		for (int i = 1; i <= 8; i++) {
			for (int j = 1; j <= 8; j++) {
				System.out.print("(" + i + "," + j + ")");
			}
			System.out.println("");
		}
		System.out.println("Soal 4A");
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		System.out.println("Soal 4B");
		for (int i = 10; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		System.out.println("Soal 5");
		for (int i = 1; i <= 3; i++) {
			System.out.println("Bab " + i + ":");
			for (int j = 1; j <= 5; j++) {
				System.out.println("Subbab " + i + "." + j);
			}
			System.out.println("");
		}
		System.out.println("Test");
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println("");
		}
		System.out.println("Test2");
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 5; j++) {
				if (i % 2 == 0) {
					System.out.print("0 ");
				} else {
					System.out.print("1 ");
				}
			}
			System.out.println("");
		}
		System.out.println("Soal 5A");
		for (int i = 1; i <= 5; i++) {
			for (int a = 4; a >= i; a--) {
				System.out.print(" ");
			}
			for (int b = 1; b <= i; b++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
