package testpack;

import java.util.Scanner;

public class Pert_26 {

	/**
	 * @param args
	 */
	static int pascal(int i, int j) {
		if (j == 0 || j == i) {
			return 1;
		} else {
			return pascal(i - 1, j - 1) + pascal(i - 1, j);
		}
	}

	static void cetak(int x) {
		for (int i = 0; i <= x; i++) {
			for (int j = 0; j < x - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print(pascal(i, k) + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Masukkan baris = ");
		int baris = s.nextInt();
		cetak(baris);
	}

}
