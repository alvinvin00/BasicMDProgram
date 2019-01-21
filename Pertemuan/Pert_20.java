package testpack;

import java.util.Scanner;

public class Pert_20 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		boolean ulang = true;
		do {
			System.out.print("Masukkan Nomor Induk Karyawan : ");
			String nik = s.nextLine().toUpperCase();
			String kode = nik.substring(0, 3);
			String tahun = "20"+nik.substring(3, 5);
			String status = nik.substring(5,7);
			if (status.equals("01"))
				status = "Karyawan Tetap";
			else
				status = "Karyawan Kontrak";
			String pokok = nik.substring(7, 10);
			System.out.println("=======================================");
			System.out.println("Input NIK Karyawan : " + nik);
			System.out.println("Kode Bagian : " + kode);
			System.out.println("Tahun Masuk : " + tahun);
			System.out.println("Status Kerja : " + status);
			System.out.println("Nomor Pokok : " + pokok);
			System.out.println("=======================================");
			System.out.print("Apakah anda ingin mengulang lagi? (Y/N) : ");
			if (s.nextLine().equalsIgnoreCase("N"))
				ulang = false;
		} while (ulang == true);
	}
}
