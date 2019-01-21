package testpack;

import java.util.Scanner;

public class Class_2 {

	/**
	 * @param args
	 */
	private static int totalJumlah(int[] angka, int banyak) {
		int total = 0;
		for (int i = 0; i < banyak; i++) {
			total += angka[i];
		}
		return total;
	}

	private static int jumlahGenap(int[] angka, int banyak) {
		int total = 0;
		for (int i = 0; i < banyak; i++) {
			if (angka[i] % 2 == 0)
				total++;
		}
		return total;
	}

	private static int jumlahGanjil(int[] angka, int banyak) {
		int total = 0;
		for (int i = 0; i < banyak; i++) {
			if (angka[i] % 2 == 1)
				total++;
		}
		return total;
	}

	private static int bilanganTerbesar(int[] angka, int banyak) {
		int max = angka[0];
		for (int i = 0; i < banyak; i++) {
			if (max < angka[i])
				max = angka[i];
		}
		return max;
	}

	private static int bilanganTerkecil(int[] angka, int banyak) {
		int min = angka[0];
		for (int i = 0; i < banyak; i++) {
			if (min > angka[i])
				min = angka[i];
		}
		return min;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		char jawab = 'Y';
		do {
			System.out.print("Masukkan banyak bilangan = ");
			int banyak = s.nextInt();
			int[] angka = new int[banyak];
			for (int i = 0; i < banyak; i++) {
				System.out.print("Masukkan bilangan ke-" + (i + 1) + " = ");
				angka[i] = s.nextInt();
			}
			System.out.println("Total Jumlah Bilangan Yang Diinput = "
					+ totalJumlah(angka, banyak));
			System.out.println("Jumlah Bilangan Genap Yang Diinput = "
					+ jumlahGenap(angka, banyak));
			System.out.println("Jumlah Bilangan Ganjil Yang Diinput = "
					+ jumlahGanjil(angka, banyak));
			System.out.println("Bilangan Terbesar Yang Diinput = "
					+ bilanganTerbesar(angka, banyak));
			System.out.println("Bilangan Terkecil Yang Diinput = "
					+ bilanganTerkecil(angka, banyak));
			System.out.print("Apakah anda ingin mengulang program(Y/T)? = ");
			jawab = Character.toUpperCase(s.next().charAt(0));
		} while (jawab == 'Y');
	}

}
