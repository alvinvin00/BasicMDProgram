package testpack;

import java.util.Scanner;

public class Class_1 {

	/**
	 * @param args
	 */

	public static int harga(String[] data) {
		int harga = 0;
		if (data[0].equalsIgnoreCase("Nasi")) {
			if (data[1].equalsIgnoreCase("Ayam")) {
				harga = 20000;
			} else if (data[1].equalsIgnoreCase("Sapi")) {
				harga = 25000;
			} else if (data[1].equalsIgnoreCase("Seafood")) {
				harga = 30000;
			}
		} else if (data[0].equalsIgnoreCase("Mie")) {
			if (data[1].equalsIgnoreCase("Ayam")) {
				harga = 25000;
			} else if (data[1].equalsIgnoreCase("Sapi")) {
				harga = 30000;
			} else if (data[1].equalsIgnoreCase("Seafood")) {
				harga = 35000;
			}
		} else if (data[0].equalsIgnoreCase("Kwetiau")) {
			if (data[1].equalsIgnoreCase("Ayam")) {
				harga = 30000;
			} else if (data[1].equalsIgnoreCase("Sapi")) {
				harga = 35000;
			} else if (data[1].equalsIgnoreCase("Seafood")) {
				harga = 40000;
			}
		}
		return harga;
	}

	public static int diskon(int jumlah, int total) {
		double diskon = 0;
		if (jumlah >= 30)
			diskon = 0.3;
		else if (jumlah >= 20)
			diskon = 0.2;
		else if (jumlah >= 10)
			diskon = 0.1;
		return (int) (diskon * total);
	}

	public static String max(String[][] makanan, int[][] angka, int banyak) {
		int max = angka[0][0];
		int indeksMax = 0;
		for (int i = 0; i < banyak; i++) {
			if (max < angka[i][0]) {
				max = angka[i][0];
				indeksMax = i;
			}
		}
		return (makanan[indeksMax][1] + " " + makanan[indeksMax][2] + "("
				+ makanan[indeksMax][3] + ")");
	}

	public static String min(String[][] makanan, int[][] angka, int banyak) {
		int min = angka[0][0];
		int indeksMin = 0;
		for (int i = 0; i < banyak; i++) {
			if (min > angka[i][0]) {
				min = angka[i][0];
				indeksMin = i;
			}
		}
		return (makanan[indeksMin][1] + " " + makanan[indeksMin][2] + "("
				+ makanan[indeksMin][3] + ")");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		char jawab = 'Y';
		do {
			System.out.print("Berapa Macam Makanan = ");
			int banyak = s.nextInt();
			String[][] makanan = new String[banyak][4];
			int[][] angka = new int[banyak][3];
			int grandtotal = 0;
			for (int i = 0; i < banyak; i++) {
				System.out.print("Masukkan makanan ke-" + (i + 1)
						+ " (Jenis-Topping-Jumlah)= ");
				String kode = s.next();
				String[] data = kode.split("-");
				makanan[i][1] = data[0];// Jenis
				makanan[i][2] = data[1];// Topping
				makanan[i][3] = data[2];// Jumlah
				int jumlah = Integer.parseInt(data[2]);
				int total = harga(data) * jumlah;
				angka[i][0] = total;
				int diskon = diskon(jumlah, total);
				angka[i][1] = diskon;
				angka[i][2] = harga(data);
				if (jumlah >= 10) // Jika ada diskon
					angka[i][0] = total - diskon;
				grandtotal = grandtotal + angka[i][0];
			}
			System.out.println("===============================");
			System.out.println("Rincian Pembelian");
			System.out.println("===============================");
			for (int i = 0; i < banyak; i++) {
				System.out.println((i+1) + ". " + makanan[i][1] + "\t\t"
						+ angka[i][0]);
				System.out
						.println("\t\t" + makanan[i][3] + " @ " + angka[i][2]);
				if (angka[i][1] != 0) {
					System.out.println("diskon : \t-" + angka[i][1]);
				}
			}
			System.out.println("===============================");
			System.out.println("\t\tTotal : " + grandtotal);
			System.out.println("Makanan dengan jumlah paling banyak = "
					+ max(makanan, angka, banyak));
			System.out.println("Makanan dengan jumlah paling sedikit = "
					+ min(makanan, angka, banyak));
			System.out.println("===============================");
			System.out.print("Apakah anda ingin mengulang program(Y/T)? = ");
			jawab = Character.toUpperCase(s.next().charAt(0));
		} while (jawab == 'Y');
	}

}
