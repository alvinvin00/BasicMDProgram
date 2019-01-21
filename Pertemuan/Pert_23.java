package testpack;

import java.util.Scanner;

public class Pert_23 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("============================================");
		System.out.print("Berapa banyak macam pakaian = ");
		int banyak = s.nextInt();
		String data[][] = new String[banyak][4];
		int total[] = new int[banyak];
		int totalBayar = 0;
		for (int i = 0; i < banyak; i++) {

			System.out.println("============================================");
			System.out.print("Masukkan Kode Pakaian = ");
			String kode = s.next();
			System.out.println("============================================");
			String jenis = kode.substring(0, 1);
			if (jenis.equals("P"))
				jenis = "Pria";
			else if (jenis.equals("W"))
				jenis = "Wanita";
			data[i][0] = jenis;

			int harga = 0;
			String pilihan = kode.substring(2, 4);
			if (pilihan.equals("KM")) {
				harga = 120000;
				pilihan = "Kemeja";
			} else if (pilihan.equals("KS")) {
				harga = 60000;
				pilihan = "Kaos";
			} else if (pilihan.equals("JT")) {
				harga = 150000;
				pilihan = "Jaket";
			} else if (pilihan.equals("JS")) {
				harga = 225000;
				pilihan = "Jas";
			}
			data[i][1] = pilihan;

			String bahan = kode.substring(5, 7);
			if (bahan.equals("01"))
				bahan = "Cotton";
			else if (bahan.equals("02"))
				bahan = "Jeans";
			else if (bahan.equals("03"))
				bahan = "Spandek";
			else if (bahan.equals("04"))
				bahan = "Wool";
			data[i][2] = bahan;

			String ukuran = kode.substring(8, 10);
			data[i][3] = ukuran;

			System.out.println("Jenis Pakaian   = " + jenis);
			System.out.println("Pilihan Pakaian = " + pilihan);
			System.out.println("Bahan Pakaian   = " + bahan);
			System.out.println("Ukuran Pakaian  = " + ukuran);
			System.out.println("Harga Satuan    = " + harga);
			System.out.print("Jumlah Beli     = ");
			int jumlah = s.nextInt();
			double diskon = 0;
			if (jumlah > 30)
				diskon = 0.3;
			else if (jumlah > 20)
				diskon = 0.2;
			else if (jumlah > 10)
				diskon = 0.1;
			int subtotal = (int) (jumlah * harga * (1 - diskon));
			System.out.println("Diskon          = " + (diskon * 100) + "%");
			System.out.println("Subtotal        = " + subtotal);
			total[i] = subtotal;
		}
		System.out.println("============================================");
		System.out.println("Jadi, Pembelian Anda adalah = ");
		for (int i = 0; i < banyak; i++) {
			System.out.println(data[i][1] + " " + data[i][2] + " " + data[i][0]
					+ " Ukuran " + data[i][3] + " = " + total[i]);
			totalBayar += total[i];
		}
		System.out.println("Total Bayar = " + totalBayar);

		System.out.println("==============Terima Kasih==================");
	}
}
