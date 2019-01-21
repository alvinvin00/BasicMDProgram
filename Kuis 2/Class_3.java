package testpack;

import java.util.Scanner;

public class Class_3 {
	public static String cari(int baris, int kolom, char[][] karakter, char cari) {
		for (int i = 0; i < baris; i++) {
			for (int j = 0; j < kolom; j++) {
				if (karakter[i][j] == cari)
					return (cari + " ditemukan pada matriks!");
			}
		}
		return (cari + " tidak ditemukan pada matriks!");
	}

	public static String tampil(int baris, int kolom, char[][] karakter,
			char cari) {
		System.out.println("Matriks yang diinput : ");
		for (int i = 0; i < baris; i++) {
			for (int j = 0; j < kolom; j++) {
				System.out.print(karakter[i][j]+" ");
			}
			System.out.println();
		}
		return (cari + " tidak ditemukan pada matriks!");
	}

	private static int hitung(int baris, int kolom, char[][] karakter, char cari) {
		int total = 0;
		for (int i = 0; i < baris; i++) {
			for (int j = 0; j < kolom; j++) {
				if (karakter[i][j] == cari)
					total++;
			}
		}
		return total;

	}

	public static void main(String[] args) {
		char jawab = 'Y';
		Scanner s = new Scanner(System.in);
		do {
			System.out.print("Masukkan jumlah baris = ");
			int baris = s.nextInt();
			System.out.print("Masukkan jumlah kolom = ");
			int kolom = s.nextInt();
			char[][] karakter = new char[baris][kolom];
			for (int i = 0; i < baris; i++) {
				for (int j = 0; j < kolom; j++) {
					System.out.print("Masukkan elemen (" + i + "," + j + ") = ");
					karakter[i][j] = s.next().charAt(0);
				}
			}
			System.out.println("===============================");
			System.out.print("Masukkan karakter yang ingin dicari = ");
			char cari = s.next().charAt(0);
			System.out.println("===============================");
			tampil(baris, kolom, karakter, cari);
			System.out.println("===============================");
			cari(baris, kolom, karakter, cari);
			System.out.println("Jadi, jumlah " + cari + " pada matriks = "
					+ hitung(baris, kolom, karakter, cari));
			System.out.print("Apakah anda ingin mengulang program(Y/T)? = ");
			jawab = Character.toUpperCase(s.next().charAt(0));
		} while (jawab == 'Y');

	}
}