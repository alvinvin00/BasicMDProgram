package testpack;

import java.util.Scanner;

public class Pert_25 {

	/**
	 * @param args
	 */
	static void nilaiTerkecil(int[] nilai) {

		int kecil = nilai[0];
		for (int i = 0; i < 5; i++) {
			if (kecil > nilai[i]) {
				kecil = nilai[i];
			}
		}
		System.out.println("Nilai terkecil : " + kecil);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int[] nilai = new int[5];
		for (int i = 0; i < 5; i++) {
			System.out.print("Masukkan nilai ke-" + (i+1) + " = ");
			nilai[i] = s.nextInt();
		}
		nilaiTerkecil(nilai);
	}
}
