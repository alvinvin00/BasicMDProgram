package testpack;

import java.util.Scanner;

public class Pert_22 {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		System.out.println("Program menjumlahkan Nilai");
		System.out.print("Masukkan Banyak Nilai = ");
		int banyak = s.nextInt();
		double[] nilai = new double[banyak];
		double total = 0;
		for (int i = 0; i < banyak; i++) {
			System.out.print("Masukkan Nilai ke-" + (i + 1) + " = ");
			nilai[i] = s.nextDouble();
			total = total + nilai[i];
		}
		double maxValue = nilai[0];
		for (int i = 1; i < nilai.length; i++) {
			if (nilai[i] > maxValue) {
				maxValue = nilai[i];
			}
		}
		double minValue = nilai[0];
		for (int i = 1; i < nilai.length; i++) {
			if (nilai[i] < minValue) {
				minValue = nilai[i];
			}

			System.out.print("Hasil dari ");
			for (i = 0; i < nilai.length; i++) {
				System.out.print(nilai[i]);
				if (i == nilai.length - 1)
					System.out.print(" = " + total + "\n");
				else
					System.out.print(" + ");
			}
			double rata = total / nilai.length;
			System.out.println("Rata - Rata Nilai = " + rata);
			System.out.println("Nilai Terbesar = " + maxValue);
			System.out.println("Nilai Terkecil = " + minValue);
		}
	}
}