package testpack;

public class Pert_15 {

	public static void main(String[] args) {
		// int b = 6;
		// for (int i = 6; i > 0; i--) {
		// System.out.print(i + " ");
		// if (i == 1) {
		// i = b;
		// b--;
		// }
		// }
		for (int i = 1; i <= 8; i++) { // Baris
			for (int j = 1; j <= i; j++) { // Kolom
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

}
